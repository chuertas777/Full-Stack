/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.egg.springLibrary.repositorios;

import com.egg.springLibrary.entidades.Book;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author CamiloH
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    @Query("SELECT b FROM Book b WHERE b.title = :titleBook")
    public Book findBookByTitle(@Param("titleBook") String titleBook);
    
    @Query("SELECT b FROM Book b WHERE b.author.name = :nameAuthor")
    public List<Book> findBookByAuthor(@Param("nameAuthor") String nameAuthor);
}
