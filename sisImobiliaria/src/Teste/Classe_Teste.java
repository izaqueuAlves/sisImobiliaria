package Teste;

import classesControle.ControleImovel;
import classesEntidade.Imovel;

/**
 *
 * @author Izaqueu
 */
public class Classe_Teste {  
    public static void main(String[] args){
        // valores que vem da tela
       
        Imovel im = new Imovel();
      /*
        im.setDescricao("ap teste");
        im.setArea(25);
        im.setNumBanheiros(2);
        im.setNumQuartos(4);
        im.setNumSuites(2);
        im.setValorAluguel(700);
        im.setVagasGaragem(2);
        
        im.cadastrarImovel(im);
        */
      //  ControleImovel ctrImovel = new ControleImovel();
      //  im.removerImovel(1);
        
        
        //ctrImovel.cadastrarImovel2(im);
        
        for(Imovel i: im.getTodosImovel()){
            System.out.println("Descrição: "+i.getDescricao());
            System.out.println("Valor: "+i.getValorAluguel());
            System.out.println("Nr Garagens: "+i.getVagasGaragem());
            
        }
               
    }
}
