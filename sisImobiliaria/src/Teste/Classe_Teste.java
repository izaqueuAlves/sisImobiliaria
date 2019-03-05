package Teste;

import classesControle.ControleImovel;
import classesEntidade.Imovel;
import classesEntidade.Proprietario;
import classesEntidade.Tipo_Imovel;


/**
 *
 * @author Izaqueu
 */
public class Classe_Teste {  
    public static void main(String[] args){
        // valores que vem da tela
       
        Imovel im = new Imovel();
        Proprietario p = new Proprietario();
        Tipo_Imovel tp = new Tipo_Imovel();
      /*
        im.setDescricao("ap teste");
        im.setArea(25);
        im.setNumBanheiros(2);
        im.setNumQuartos(4);
        im.setNumSuites(2);
        im.setValorAluguel(700);
        im.setVagasGaragem(2);
        
        im.cadastrarImovel(im);
       
       
        for(Imovel i: im.getTodosImoveis()){
            System.out.println("Descrição: "+i.getDescricao());
            System.out.println("Valor: "+i.getValorAluguel());
            System.out.println("Nr Garagens: "+i.getVagasGaragem());
            
        }  
      
      p.setCpf("02046970001");
      p.setNomeCompleto("Maria Aparecida");
      p.setEmail("maria@gmail.com");
      p.setTelefone("9999985454");
               
      p.editarProprietario(p);
      
       
      
        for(Proprietario pr: p.getTodosProprietarios()){
            System.out.println("Nome: "+pr.getNomeCompleto());
            System.out.println("Email: "+pr.getEmail());
            System.out.println("Telefone: "+pr.getTelefone());
            
        } */
         for(Tipo_Imovel ti: tp.buscarTipo()){
            System.out.println("Nome: "+ti.getNome());
            System.out.println("Email: "+ti.isEmCondominio());
            
        }
      
    
    }
}
