/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.egg.springLibrary.repositorios;

import com.egg.springLibrary.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CamiloH
 */
@Repository
public interface UserRepository extends JpaRepository<Usuario, String>     {
    
    @Query("SELECT u FROM Usuario u WHERE u.email = :email")
    public Usuario findXMail(@Param("email")String email);
    
}
