
package com.egg.springLibrary.servicios;

import com.egg.springLibrary.entidades.Editorial;
import com.egg.springLibrary.excepciones.MyException;
import com.egg.springLibrary.repositorios.EditorialRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author CamiloH
 */
@Service
public class EditorialService {
    // Instanciar los repositorios como variables globales
    @Autowired
    private EditorialRepository editorialRepositorio;
    
    
    // Crear una editorial 
    @Transactional
    public void createEditorial(String nameE) throws MyException{
        
        validar(nameE);
        // INSTANCIAR OBJETO DE TIPO EDITORIAL
        Editorial editorial = new Editorial();
        
        //seteamos los atributos
        editorial.setName(nameE);
        
        //guardar en la bd
        editorialRepositorio.save(editorial);
    }
    
    //Listar editoriales 
    public List<Editorial> listAllEditorials(){
        List<Editorial> editorials = new ArrayList();
        
        editorials = editorialRepositorio.findAll();
        //Metodo propio del jpaRepo es traer todos los datos de la tabla con el ".findAll()"
        return editorials;
    }
    
    // Actualizar Editorial 
    public void updateOnlyOneEditorial(String idE, String nameE) throws MyException{
        
        validar(nameE);
        // en caso de que el id de la editorial este mal digitado o que no se encuentre, se debe de usar un optional 
        Optional<Editorial> answerE = editorialRepositorio.findById(idE);
        
        //comprobar de que si exista un dato con el mismo id
        if (answerE.isPresent()) {
            //instanciamos un objeto de tipo Editorial
            Editorial editorial = answerE.get();
            
            //seteamos el nombre, porque el id no hay como modificarle
            editorial.setName(nameE);
            
            //guardamos
            editorialRepositorio.save(editorial);
        }
    }
    
    public Editorial getOne(String id){
        return editorialRepositorio.getOne(id);
    }
    
     private void validar(String nombreEditorial) throws MyException {

        if (nombreEditorial.isEmpty()) {
            throw new MyException("el nombre de la editorial no puede ser nulo o estar vacio");
        }
       
    }
}
