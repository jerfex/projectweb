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

public class cadastroPedidoBean {

    private List<Integer> itens;

    public cadastroPedidoBean() {
        itens = new ArrayList<>();
        itens.add(1);
    }

    public List<Integer> getItens() {
        return itens;
    }
}
