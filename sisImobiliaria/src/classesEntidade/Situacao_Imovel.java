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
    DISPONIVEL_ALGUEL(0), DISPONIVEL_VENDA(1), DISPONIVEL_VENDA_ALUGUEL(2), ALUGADO(3), VENDIDO(4);
        
    private final int valor;

    private Situacao_Imovel(int val) {
        this.valor = val;
    }
    public int getValor(){
        return valor;
    }
}
