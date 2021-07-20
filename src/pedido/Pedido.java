/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pedido;

import pagamento.FormaPagamento;

/**
 *
 * @author julia
 */
public class Pedido {    
    FormaPagamento tipoDePagamento;

    public Pedido() {
    }
    
    
    public void setTipoDePagamento(FormaPagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }   
    
    public Pedido(FormaPagamento f) {    
        tipoDePagamento = f;
    }   

    public void pagar() {
        //verificarPendencias();
        //consultarCadastro();
        tipoDePagamento.pagar();
        
    }    
}
