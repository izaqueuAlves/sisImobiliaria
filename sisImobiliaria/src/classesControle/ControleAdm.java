/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Adm;

/**
 *
 * @author Izaqueu Alves
 */
public class ControleAdm {

    public ControleAdm() {
    }
    
    /**
     * 
     * @param login
     * @param email
     * @param nomeCompleto
     * @param senha
     * @param telefone
     */
    void cadastrarAdm(String login, String email, String nome, String telefone)
    {
        Adm adm = new Adm();
        adm.setLogin(login);
        adm.setEmail(email);
        adm.setNomeCompleto(nome);
        adm.setTelefone(telefone);
        
        try {
            adm.cadastrarAdm(adm);
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }        
    }
      
    public boolean cadastrarAdm(Adm adm){        
        return adm.cadastrarAdm(adm);                
    }
    
    
    public boolean fazerLogin(String login, String senha){
        
        Adm adm = new Adm();        
        adm = adm.buscarAdmPorLogin(login);
       
        if(adm != null)
            if(login.equals(adm.getLogin()) && senha.equals(adm.getSenha())){
                return true;
            }else{
                return false;
            }
        else
           return false;
      }
}