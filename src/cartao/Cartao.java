/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartao;

import pagamento.FormaPagamento;

/**
 *
 * @author julia
 */
public abstract class Cartao implements FormaPagamento {

    public abstract void verificaSaldo();
    
    @Override
    public final void pagar() {
        passarCartao();
        conectarBandeira();
        verificaSaldo();
        imprimirRecibo();
    }
    
    public void passarCartao(){
        System.out.println("Passando o cartão na máquina e enviando os dados da "
                + "venda para a credenciadora;");
    }
    
    public void conectarBandeira(){
        System.out.println("Conectando à bandeira para identificar o Emissor do "
                + "Cartão e checar se a transação é possível;");
    }
    
    public void imprimirRecibo(){
        System.out.println("Simprimindo o recibo e concluíndo a venda");
    }
    
}
