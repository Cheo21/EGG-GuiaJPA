/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percistencia;

import Entidades.Autor;
import java.util.List;

/**
 *
 * @author jg211
 */
public class AutorDAO extends DAO<Autor>{
    
    
    
    
    @Override
    public void guardar(Autor autor){
    super.guardar(autor);
        
    }
    
    public void eliminar(int id){
        Autor autor = buscarPorID(id);
        super.eliminar(autor);
    }
    
    public Autor buscarPorID(int id){
        conectar();
        Autor autor = em.find(Autor.class, id);
        desconectar();
        return autor;
    }
    
    public List<Autor> listarTodos(){
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a").getResultList();
        desconectar();
        return autores;
        
    }
    
    @Override
    public void editar(Autor autor){
    super.editar(autor);
    }
    
    public List<Autor> buscarPorNombre(String nombre){
        conectar();
        List<Autor> autores = em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getResultList();
        desconectar();
        return autores;
    }
    
    
    
}
