/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percistencia;

import Entidades.Editorial;
import java.util.List;

/**
 *
 * @author jg211
 */
public class EditorialDAO extends DAO<Editorial>{
    
    
    
    @Override
    public void guardar(Editorial editorial){
    super.guardar(editorial);
    }
    public void eliminar(int id){
        Editorial editorial = buscarPorId(id);
        super.eliminar(editorial);
    }
    public Editorial buscarPorId(int id){
        conectar();
        Editorial autor = em.find(Editorial.class, id);
        desconectar();
        return autor;
    }
        public List<Editorial> buscarPorNombre(String nombre){
        conectar();
        List<Editorial> autores = em.createQuery("SELECT e FROM Editorial e WHERE e.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return autores;
    }
    public List<Editorial> listarTodos(){
        conectar();
        List<Editorial> autores = em.createQuery("SELECT e FROM Editorial e").getResultList();
        desconectar();
        return autores;
        
    }
    
    
    @Override
    public void editar(Editorial editorial){
    super.editar(editorial);
    }
    
}
