/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.servicios;

import com.egg.springLibrary.entidades.Image;
import com.egg.springLibrary.entidades.Usuario;
import com.egg.springLibrary.enumeraciones.Rol;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.repositorios.UserRepository;
import com.egg.springLibrary.servicios.ImageService;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author CamiloH
 */
@Service
public class UserService implements UserDetailsService {

    @Autowired
    private UserRepository usuarioRepositorio;

    @Autowired
    private ImageService imagenServicio;

    // Crear Usuario
    @Transactional
    public void createUser(MultipartFile archivo, String nombre, String email, String passwordA, String passwordB) throws MyException {

        validar(nombre, email, passwordA, passwordB);
        // INSTANCIAR EL OBJETO AUTHOR
        Usuario usuario = new Usuario();

        // setear atributos del objeto (el id no porque se autogenera)
        usuario.setNombre(nombre);
        usuario.setEmail(email);
        usuario.setPassword(new BCryptPasswordEncoder().encode(passwordA));

        usuario.setRol(Rol.USER);
        //guardar en la bd
        Image imagen = imagenServicio.guardaImagen(archivo);
        usuario.setImagen(imagen);
        usuarioRepositorio.save(usuario);
    }

    // Modificar Usuario
    @Transactional
    public void actualizar(MultipartFile archivo, String idUsuario, String nombre, String email, String passwordA, String passwordB) throws MyException {

        validar(nombre, email, passwordA, passwordB);

        Optional<Usuario> respuesta = usuarioRepositorio.findById(idUsuario);
        if (respuesta.isPresent()) {

            // INSTANCIAR EL OBJETO AUTHOR
            Usuario usuario = respuesta.get();
            usuario.setNombre(nombre);
            usuario.setEmail(email);
            usuario.setPassword(new BCryptPasswordEncoder().encode(passwordA));
            // setear atributos del objeto (el id no porque se autogenera)
            usuario.setRol(Rol.USER);
            //guardar en la bd
            String idImagen = null;
            if (usuario.getImagen() != null) {
                idImagen = usuario.getImagen().getId();
                
            }
            
            Image imagen = imagenServicio.actualizar(archivo, idImagen);
            usuario.setImagen(imagen);
            usuarioRepositorio.save(usuario);
        }

    }
    
    //Captura el id del Usuario 
    public Usuario getOne(String id) {
        return usuarioRepositorio.getOne(id);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepositorio.findXMail(email);
        if (usuario != null) {
            List<GrantedAuthority> permisos = new ArrayList<>();
            GrantedAuthority p = new SimpleGrantedAuthority("ROLE_" + usuario.getRol().toString());

            permisos.add(p);

            ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();

            HttpSession sesion = attr.getRequest().getSession(true);

            sesion.setAttribute("usuariosesion", usuario);

            return new User(usuario.getEmail(), usuario.getPassword(), permisos);

        } else {
            return null;
        }

    }

    //Método para validar si el campo esta vacio o no
    private void validar(String nombre, String email, String passwordA, String passwordB) throws MyException {

        if (nombre.isEmpty() || nombre == null) {
            throw new MyException("el nombre de usuario  no puede ser nulo o estar vacio");
        }

        if (email.isEmpty() || email == null) {
            throw new MyException("el email del usuario  no puede ser nulo o estar vacio");
        }

        if (passwordA.isEmpty() || passwordA == null) {
            throw new MyException("la contraseña del usuario  no puede ser nulo o estar vacio");
        }

        if (passwordB.isEmpty() || passwordB == null) {
            throw new MyException("la contraseña del usuario  no puede ser nulo o estar vacio");
        }

        if (passwordA.length() <= 5 || passwordB.length() <= 5) {
            throw new MyException("la contraseña debe contener mas de 6 caracteres ");
        }

        if (!passwordA.equals(passwordB)) {
            throw new MyException("las contraseñas ingresadas deben coincidir");
        }

    }

}
