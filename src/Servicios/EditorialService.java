/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


import Entidades.Editorial;
import Percistencia.EditorialDAO;
import java.util.List;

/**
 *
 * @author jg211
 */
public class EditorialService {
    private final EditorialDAO DAO;
    
   public EditorialService(){
     this.DAO = new EditorialDAO();
   
   }
   
   public void guardarEditorial(Editorial editorial){
       try{
           if(editorial == null) throw new Exception("Objeto vacio");
           DAO.guardar(editorial);
           
           
       }
       catch (Exception e){
           System.out.println(e);}
   
   }
   
   public List<Editorial> buscarPorNombre(String nombre){
  
       if(nombre.isEmpty()) return null;
       return DAO.buscarPorNombre(nombre);
    
    }
   
   public void eliminar(int id){
   
       if (id != 0){
           DAO.eliminar(id);
       } 
   }
   
   public void editar(Editorial editorial){
       
       if (editorial != null && !editorial.getNombre().isEmpty() && DAO.buscarPorNombre(editorial.getNombre()) == null){
        DAO.editar(editorial);
       }
   }
   
   
   
}
