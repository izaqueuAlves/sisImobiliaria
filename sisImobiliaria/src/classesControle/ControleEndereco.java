/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Endereco;

/**
 *
 * @author Izaqueu
 */

public class ControleEndereco {
    
    public Endereco endereco = new Endereco();
        
    public ControleEndereco(){  
        endereco = new Endereco();
    }
    
  /**
   * 
   * @param cep
   * @param uf
   * @param bairro
   * @param complemento
   * @param logradouro
   * @param numero 
   * @param cidade
   * return void
   */  
  void cadastrarCorretor (String cep, String uf, String bairro, String complemento, String logradouro, String numero, String cidade)
  {
      endereco = new Endereco();      
      
      endereco.setCEP(cep);
      endereco.setUF(uf);
      endereco.setCidade(cidade);
      endereco.setBairro(bairro);
      endereco.setComplemento(complemento);
      endereco.setLogradouro(logradouro);
      endereco.setNumero(numero);
      
       try {
            endereco.cadastrarEndereco(endereco);
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }        
    }
      
    public boolean cadastrarEndereco(Endereco endereco){        
        return endereco.cadastrarEndereco(endereco);                
    }
       
        
  /***
   * 
   * @param novoCep
   * @param novoUf
   * @param novoBairro
   * @param novoComplemento
   * @param novoLogradouro
   * @param novoNumero
   * @param novaCidade
   */
  
  //DEVE EDITAR E N CADASTRAR, CONSERTAR
  public void editarCorretor (String novoCep, String novoUf, String novoBairro, String novoComplemento, String novoLogradouro, String novoNumero, String novaCidade)
  {
      endereco = new Endereco();
      
      
      endereco.setCEP(novoCep);
      endereco.setUF(novoUf);
      endereco.setCidade(novaCidade);
      endereco.setBairro(novoBairro);
      endereco.setComplemento(novoComplemento);
      endereco.setLogradouro(novoLogradouro);
      endereco.setNumero(novoNumero);
      
       
        try {
            //corretor.cadastrarCorretor(corretor);
            //Mensagem de corretor cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    } 
 
}
