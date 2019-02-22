/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author welerson
 */
@Entity
public class Adm {
    @Id
    private String login;
    private String senha;
    private String nomeCompleto;
    private String telefone;
    private String email;
    
    //Construtores
    
    public Adm(String login, String senha, String nomeCompleto, String telefone, String email) {
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }
    public Adm() {
        
    }
    
    //Gets e sets

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
