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
public class Pix implements FormaPagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento via pix, rápido e fácil....");
    }
    
}
