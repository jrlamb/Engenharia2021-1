/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import pagamento.BoletoBancario;
import pagamento.CartaoCredito;
import pagamento.Pix;
import pedido.Pedido;

/**
 *
 * @author julia
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pedido 1::");
        //vamos criar um pedido que será pago em BOLETO
        Pedido pedido = new Pedido(new Pix());
        pedido.pagar();
        
        System.out.println("Pedido 2::");
        Pedido p2 = new Pedido(new CartaoCredito());
        p2.pagar();
        
        System.out.println("Pedido 3");
        Pedido p3 = new Pedido();
        //pedido.add()
        pedido.setTipoDePagamento(new CartaoCredito());
        pedido.pagar();
        
        
    }
    
}
