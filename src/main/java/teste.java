

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.cliente;
import model.tipoPessoa;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author j
 */
public class teste {
    
     public static void main(String[] args) {
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ProdPU");
        EntityManager manager = factory.createEntityManager();
        
         EntityTransaction trx = manager.getTransaction();
         trx.begin();
         cliente cliente = new cliente();
         cliente.setNome("teste");
         cliente.setEmail("teste@teste");
         cliente.setDocumentoReceitaFederal("11111111");
         cliente.setTipo(tipoPessoa.FISICA);
         
         manager.persist(cliente);
         trx.commit();
    }
    
}
