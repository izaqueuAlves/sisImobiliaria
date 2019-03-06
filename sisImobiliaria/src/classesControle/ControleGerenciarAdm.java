/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Adm;

/**
 *
 * @author welerson
 */
public class ControleGerenciarAdm {
    
    void CadastrarAdm(String login, String senha, String nomeComp, String telefone, String email){
        Adm novoAdm = new Adm();
        
        novoAdm.setLogin(login);
        novoAdm.setSenha(senha);
        novoAdm.setNomeCompleto(nomeComp);
        novoAdm.setTelefone(telefone);
        novoAdm.setEmail(email);
        
        try {
            novoAdm.cadastrarAdm(novoAdm);
            //Mensagem de Imovel cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }
}
