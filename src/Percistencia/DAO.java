
package Percistencia;


import javax.persistence.*;


public abstract class DAO<T> {
    
        protected final EntityManagerFactory EMF = Persistence.createEntityManagerFactory("GuiaJPAPU");
        protected EntityManager em = EMF.createEntityManager();
    
        protected void conectar(){
        if(!em.isOpen()){
            em = EMF.createEntityManager();
        }
        }
        
        protected void desconectar(){
            if (em.isOpen()){
                em.close();
            }
        }
        
        protected void guardar(T objeto){
            conectar();
            em.getTransaction().begin();
            em.persist(objeto);
            em.getTransaction().commit();
            desconectar();
        }
        
        protected void editar(T objeto){
           conectar();
           em.getTransaction().begin();
           em.merge(objeto);
           em.getTransaction().commit();
            desconectar();
        }
        
        protected void eliminar(T objeto){
        conectar();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectar();
    }
        
       
         
}
