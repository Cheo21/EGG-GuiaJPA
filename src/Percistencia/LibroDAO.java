/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percistencia;

import Entidades.Libro;
import java.util.List;

/**
 *
 * @author jg211
 */
public class LibroDAO extends DAO<Libro>{
    
    
    
    
     @Override
     public void guardar(Libro libro){
        super.guardar(libro);
    }
     
     public void eliminar(int id){
        Libro editorial = buscarPorISBN(id);
        super.eliminar(editorial);
    }
     
     public Libro buscarPorISBN(int id){
        conectar();
        Libro autor = em.find(Libro.class, id);
        desconectar();
        return autor;
    }
     
     public List<Libro> listarTodos(){
        conectar();
        List<Libro> autores = em.createQuery("SELECT l FROM Libro l").getResultList();
        desconectar();
        return autores;
        
    }
     
     @Override
      public void editar(Libro libro){
        super.editar(libro);
    }
      
      public Libro buscarPorTitulo(String titulo){
      conectar();
      Libro libro = (Libro) em.createQuery("Select l from Libro l where l.titulo like :titulo").setParameter("titulo", titulo).getSingleResult();
      desconectar();
      return libro;
      }
      
      public List<Libro> buscarPorNombreAutor(String nombre){
         conectar();
          List<Libro> libros =  em.createQuery("Select l FROM Libro l WHERE l.autor.nombre = :nombre").setParameter("nombre", nombre).getResultList();
         desconectar();
        return libros;
      
      }
      
      public List<Libro> buscarPorEditorial(String nombre){
           conectar();
           List<Libro> libros = em.createQuery("Select l FROM Libro l WHERE l.editorial.nombre  = :nombre").setParameter("nombre", nombre).getResultList();
           desconectar();
           return libros;
      
      }
      
      
}
