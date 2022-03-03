

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import model.Cliente;
import model.Endereco;
import model.TipoPessoa;

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
         Cliente cliente = new Cliente();
         cliente.setNome("teste");
         cliente.setEmail("teste@teste");
         cliente.setDocumentoReceitaFederal("11111111");
         cliente.setTipo(TipoPessoa.FISICA);
         
         Endereco endereco = new Endereco();
         endereco.setLogradouro("Rua dos teste");
         endereco.setNumero("111");
         endereco.setCidade("Goianai");
         endereco.setUf("GO");
         endereco.setCep("888-888");
         endereco.setCliente(cliente);
         
         cliente.getEnderecos().add(endereco);
         
         manager.persist(cliente);
         trx.commit();
    }
    
}
