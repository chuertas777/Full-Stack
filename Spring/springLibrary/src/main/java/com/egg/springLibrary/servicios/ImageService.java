/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.servicios;

import com.egg.springLibrary.entidades.Image;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.repositorios.ImageRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author CamiloH
 */
@Service
public class ImageService {

    // Instanciar los repositorios como variables globales
    @Autowired
    private ImageRepository imagenRepositorio;

    // Crear una Imagen 
    @Transactional
    public Image guardaImagen(MultipartFile archivo) throws MyException {
        if (archivo != null) {
            try {

                Image imagen = new Image();

                imagen.setMime(archivo.getContentType());

                imagen.setNombre(archivo.getName());

                imagen.setContenido(archivo.getBytes());

                return imagenRepositorio.save(imagen);

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
    }
    
     public Image actualizar(MultipartFile archivo, String idImagen) throws MyException{
         if (archivo != null) {
            try {
                
                Image imagen = new Image();
                
                if (idImagen != null) {
                    Optional<Image> respuesta = imagenRepositorio.findById(idImagen);
                    
                    if (respuesta.isPresent()) {
                        imagen = respuesta.get();
                    }
                }
                
                imagen.setMime(archivo.getContentType());
                
                imagen.setNombre(archivo.getName());
                
                imagen.setContenido(archivo.getBytes());
                
                return imagenRepositorio.save(imagen);
                
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return null;
        
    }
     
      @Transactional
	public List<Image> listarTodos() {
		return imagenRepositorio.findAll();
	}
     

}
