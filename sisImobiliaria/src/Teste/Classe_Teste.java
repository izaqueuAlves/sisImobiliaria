package Teste;

import classesEntidade.Imovel;

/**
 *
 * @author Izaqueu
 */
public class Classe_Teste {  
    public static void main(String[] args){
        
        Imovel im = new Imovel();
        im.setDescricao("Casa 2");
        im.setArea(5);
        im.setNumBanheiros(3);
        im.setNumQuartos(4);
        im.setNumSuites(0);
        im.setValorAluguel(500);
        
        im.inserir(im);
        
        System.out.println("hello World!");
    }
}
