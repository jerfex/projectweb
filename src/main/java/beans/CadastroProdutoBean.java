/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;
import model.Produto;


/**
 *
 * @author j
*/
@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private Produto produto;
    
    public CadastroProdutoBean(){
        produto = new Produto();
    }
    public void salvar(){
        
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
   
}
