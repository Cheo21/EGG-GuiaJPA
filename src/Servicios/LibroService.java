/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import Percistencia.LibroDAO;
import java.util.List;

/**
 *
 * @author jg211
 */
public class LibroService {
    private final LibroDAO DAO;
    
    
    public LibroService(){
         this.DAO = new LibroDAO();
    }
    
    public void guardar(Libro libro) {
        try{
            if (libro == null) throw new Exception("Libro vacio");
            DAO.guardar(libro);  
        } catch (Exception ex) {
            System.out.println(ex);
        }
            
    }
    
    
    public void eliminar(int isnb){
        try{
            if(isnb == 0) throw new Exception("El valor es igual a 0");
            DAO.eliminar(isnb);
            
        }catch(Exception e){
            System.out.println(e);}
        
    }
    

    public void editar(Libro libro){
    try{
            if (libro == null) throw new Exception("Libro vacio");
            DAO.editar(libro);  
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    
    
    public Libro buscarPorISBN(int isbn){
        Libro libro = null;
        try{
            if (isbn == 0) throw new Exception("Libro vacio");
            libro =  DAO.buscarPorISBN(isbn);  
            return libro;
        } catch (Exception ex) {
            System.out.println(ex);
        }
       return  libro;
        
    }
    
    public Libro buscarPorTitulo(String titulo){
       Libro libro = null;
        try{
            if(titulo.isEmpty()) throw new Exception("Sin titulo");
            DAO.buscarPorTitulo(titulo);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        return libro;
    }
    
    
    public List<Libro> buscarLibrosPorAutor(String nombreAutor){
       List<Libro> libros = null;
        try{
            if(nombreAutor.isEmpty()) throw new Exception("Sin nombre de autor");
             libros = DAO.buscarPorNombreAutor(nombreAutor);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return libros;
    
    }
    
    public List<Libro> buscarLibrosPorEditorial(String nombreEditorial){
       List<Libro> libros = null;
        try{
            if(nombreEditorial.isEmpty()) throw new Exception("Sin nombre de editorial");
             libros = DAO.buscarPorNombreAutor(nombreEditorial);
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        return libros;
    
    }
    
}
