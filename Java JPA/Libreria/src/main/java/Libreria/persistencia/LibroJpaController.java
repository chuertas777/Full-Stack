/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libreria.persistencia;

import Libreria.entidades.Autor;
import Libreria.entidades.Editorial;
import Libreria.entidades.Libro;
import Libreria.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author CamiloH
 */
public class LibroJpaController implements Serializable {

    private EntityManager em;

    public LibroJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public LibroJpaController() {
        emf = Persistence.createEntityManagerFactory("LibreriaJPAUP");
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //Persistencia para crear un libro
    public void create(Libro libro) {
        em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(libro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    //Persistencia para editar un Libro por ISBN
    public void editLibroByIsbn(Long isbn, String titulo) throws NonexistentEntityException, Exception {
        em = null;
        try {
            em = getEntityManager();
            Libro libro = em.find(Libro.class, isbn);
            if (libro == null) {
                throw new NonexistentEntityException("El libro con el isbn " + isbn
                        + " no existe en la BD Libreria.");
            }

            em.getTransaction().begin();
            libro.setTitulo(titulo);

            // Actualiza otros atributos según sea necesario
            em.getTransaction().commit();
        } catch (Exception ex) {
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Persistencia para editar un libro
    public void edit(Libro libro) throws NonexistentEntityException, Exception {
        em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            libro = em.merge(libro);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                long id = libro.getIsbn();
                if (findLibro(id) == null) {
                    throw new NonexistentEntityException("The libro with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Persistencia para eliminar un libro
    public void destroy(long id) throws NonexistentEntityException {
        em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Libro libro;
            try {
                libro = em.getReference(Libro.class, id);
                libro.getIsbn();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The libro with id " + id + " no longer exists.", enfe);
            }
            em.remove(libro);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    //Persistencia para obtener una lista de libros
    public List<Libro> findLibroEntities() {
        return findLibroEntities(true, -1, -1);
    }

    //Persistencia para obtener una lista de libros con último resultado y 
    //el primer resultado
    public List<Libro> findLibroEntities(int maxResults, int firstResult) {
        return findLibroEntities(false, maxResults, firstResult);
    }

    private List<Libro> findLibroEntities(boolean all, int maxResults, int firstResult) {
        em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Libro.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    //Persistencia para buscar por id del libro
    public Libro findLibro(long id) {
        em = getEntityManager();
        try {
            return em.find(Libro.class, id);
        } finally {
            em.close();
        }
    }

    //Consultar por título de la entidad Libro
    public List<Libro> findLibroName(String titulo) {
        em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
            Root<Libro> autorRoot = cq.from(Libro.class);
            cq.select(autorRoot);
            cq.where(cb.equal(autorRoot.get("titulo"), titulo));

            Query q = em.createQuery(cq);
            return q.getResultList();

        } finally {
            em.close();
        }
    }

    //Persistencia para consultar por título de la entidad Libro
    public List<Libro> findLibroNameAutor(String nombreAutor) {
        em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
            Root<Libro> libroRoot = cq.from(Libro.class);

            // Paso 1: Realizar un join con la entidad relacionada
            Join<Libro, Autor> autorJoin = libroRoot.join("autor");

            // Paso 2: Agregar el predicado para filtrar por nombre de autor
            Predicate predicado = cb.equal(autorJoin.get("nombre"), nombreAutor);
            cq.where(predicado);

            // Paso 3: Ejecutar la consulta
            Query q = em.createQuery(cq);
            return q.getResultList();

        } finally {
            em.close();
        }
    }
    
    public List<Libro> findLibroNameEditorial(String nombreEditorial) {
        em = getEntityManager();
        try {
            CriteriaBuilder cb = em.getCriteriaBuilder();
            CriteriaQuery<Libro> cq = cb.createQuery(Libro.class);
            Root<Libro> libroRoot = cq.from(Libro.class);

            // Paso 1: Realizar un join con la entidad relacionada
            Join<Libro, Editorial> editorialJoin = libroRoot.join("editorial");

            // Paso 2: Agregar el predicado para filtrar por nombre de la editorial
            Predicate predicado = cb.equal(editorialJoin.get("nombre"), nombreEditorial);
            cq.where(predicado);

            // Paso 3: Ejecutar la consulta
            Query q = em.createQuery(cq);
            return q.getResultList();

        } finally {
            em.close();
        }
    }

    //Persistencia para obtener el contador de los libros
    public int getLibroCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Libro> rt = cq.from(Libro.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

    

}
