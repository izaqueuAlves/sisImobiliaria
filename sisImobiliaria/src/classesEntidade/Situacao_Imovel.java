/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;


/**
 *
 * @author izaqueu
 */

public enum Situacao_Imovel {
    DISPONIVEL_ALGUEL(1), DISPONIVEL_VENDA(2), DISPONIVEL_VENDA_ALUGUEL(3), ALUGADO(4), VENDIDO(5);
        
    private final int valor;

    private Situacao_Imovel(int val) {
        this.valor = val;
    }
    public int getValor(){
        return valor;
    }
}
