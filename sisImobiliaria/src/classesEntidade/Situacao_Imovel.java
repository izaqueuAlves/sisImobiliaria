/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

/**
 *
 * @author welerson
 */
public enum Situacao_Imovel {
        DISPONIVEL_ALUGUEL(1), DISPONIVE_VENDA(2), DISPONIVEL_VENDA_ALUGUEL(3), ALUGADO(4), VENDIDO(5), INVALIDO(6);
        
        private final int valor;

    private Situacao_Imovel(int val) {
        this.valor = val;
    }
    public int getValor(){
        return valor;
    }
        
}
