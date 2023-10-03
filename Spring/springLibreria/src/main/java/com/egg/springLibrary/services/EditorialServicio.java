
package com.egg.springLibrary.services;

import com.egg.springLibrary.entidades.Editorial;
import com.egg.springLibrary.excepciones.MyException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.egg.springLibrary.repository.EditorialRepositorio;

/**
 *
 * @author CamiloH
 */
@Service
public class EditorialServicio {
    // intanciar los repositorios como variables globales
    @Autowired
    EditorialRepositorio editorialRepositorio;
    
    
    // CREATE AN EDITORIAL ----------------------------------------------------------------------------------------------------
    @Transactional
    public void createEditorial(String nombre) throws MyException{
        validar(nombre);
        // INSTANCIAR OBJETO DE TIPO EDITORIAL
        Editorial editorial = new Editorial();
        
        //seteamos los atributos
        editorial.setNombre(nombre);
        
        //guardar en la bd
        editorialRepositorio.save(editorial);
    }
    
    //TAKE ALL EDITORIALS ----------------------------------------------------------------------------------------------------
    public List<Editorial> listAllEditorials(){
        List<Editorial> editoriales = new ArrayList();
        
        editoriales = editorialRepositorio.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return editoriales;
    }
    
    // UPDATE EDITORIAL ----------------------------------------------------------------------------------------------------------
    @Transactional
    public void actualizarByEditorial(String idEditorial, String nombreEditorial) throws MyException{
        
        validar(nombreEditorial);
        
        // en caso de que el id de la editorial este mal digitado o que no se encuentre, se debe de usar un optional 
        Optional<Editorial> respuestaEditorial = editorialRepositorio.findById(idEditorial);
        
        //comprobar de que si exista un dato con el mismo id
        if (respuestaEditorial.isPresent()) {
            //instanciamos un objeto de tipo Editorial
            Editorial editorial = respuestaEditorial.get();
            
            //seteamos el nombre, porque el id no hay como modificarle
            editorial.setNombre(nombreEditorial);
            
            //guardamos
            editorialRepositorio.save(editorial);
        }
    }
    
    private void validar(String nombreEditorial) throws MyException {

        if (nombreEditorial.isEmpty()) {
            throw new MyException("el nombre de la editorial no puede ser nulo o estar vacio");
        }
       
    }
}
