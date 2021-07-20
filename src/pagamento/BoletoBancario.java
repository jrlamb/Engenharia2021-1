/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagamento;

/**
 *
 * @author julia
 */
public class BoletoBancario implements FormaPagamento {

    @Override
    public void pagar() {
        System.out.println("Imprimindo o boleto..."); 
    }
    
}
