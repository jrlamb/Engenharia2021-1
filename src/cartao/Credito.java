/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartao;

/**
 *
 * @author julia
 */
public class Credito extends Cartao{

    @Override
    public void verificaSaldo() {
        System.out.println("Verificando o limite do cartão de crédito");
    }
    
}
