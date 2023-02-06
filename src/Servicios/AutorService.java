/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Autor;
import Percistencia.AutorDAO;
import java.util.List;

/**
 *
 * @author jg211
 */
public class AutorService {
   private final AutorDAO DAO;
    
   public AutorService(){
     this.DAO = new AutorDAO();
   
   }
   
   public void guardarAutor(Autor autor){
       // && DAO.buscarPorNombre(autor.getNombre()) == null
       if (autor != null && !autor.getNombre().isEmpty() ){
        DAO.guardar(autor);
       }
   }
   
   public List<Autor> buscarPorNombre(String nombre){
  
       if(nombre.isEmpty()) return null;
       return DAO.buscarPorNombre(nombre);
    
    }
   
   public void eliminarAutor(int id){
   
       if (id != 0){
           DAO.eliminar(id);
       } 
   }
   
   
    public void editar(Autor autor){
       
       if (autor != null && !autor.getNombre().isEmpty() && DAO.buscarPorNombre(autor.getNombre()) == null){
        DAO.editar(autor);
       }
   }
   
}