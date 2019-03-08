/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;
import classesEntidade.Proprietario;
/**
 *
 * @author Alline
 */

public class ControleProprietario {
     public Proprietario proprietario = new Proprietario();
   
     public ControleProprietario(){
         proprietario = new Proprietario();
}
    

    public void cadastrarProprietario(String CPF, String nomeCompleto, String telefone, String email)
    {
         proprietario = new Proprietario();
         
       
        proprietario.setCpf(CPF);
        proprietario.setNomeCompleto(nomeCompleto);
        proprietario.setTelefone(telefone);
        proprietario.setEmail(email);
        
        
        
        try {
            proprietario.cadastrarProprietario(proprietario);
            //Mensagem de proprietario cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }
    public void editarProprietario(String novoCPF, String novoNomeCompleto, String novoTelefone, String novoEmail)
    {
         proprietario = new Proprietario();
         
       
        proprietario.setCpf(novoCPF);
        proprietario.setNomeCompleto(novoNomeCompleto);
        proprietario.setTelefone(novoTelefone);
        proprietario.setEmail(novoEmail);
        
        
        
        try {
            proprietario.cadastrarProprietario(proprietario);
            //Mensagem de proprietario cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }
    
    //FAZER
    public void excluirProprietario(){
         proprietario = new Proprietario();
}
}


