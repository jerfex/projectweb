/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author j
 */

public class PesquisasProdutosBean {

  

    private List<Integer> produtosFiltrados;

    public PesquisasProdutosBean()
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
