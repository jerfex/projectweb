/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author j
 */
@ManagedBean
@RequestScoped
@Named
public class pesquisasProdutosBean {

  

    private List<Integer> produtosFiltrados;

    public pesquisasProdutosBean()
    {
        produtosFiltrados = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            produtosFiltrados.add(i);
        }
    }
      public List<Integer> getProdutosFiltrados() {
        return produtosFiltrados;
    }
    
}