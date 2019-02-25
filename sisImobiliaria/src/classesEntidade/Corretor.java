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
 * @author Izaqueu
 */
@Entity
public class Corretor {
    @Id
    private String cpf;
    private String creci;
    private String senha;
    private String nomeCompleto;
    private String telefone;
    private String email;

    public Corretor() {
    }
    
    public Corretor(String cpf, String creci, String senha, String nomeCompleto, String telefone, String email) {
        this.cpf = cpf;
        this.creci = creci;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setCreci(String creci) {
        this.creci = creci;
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
    
    

    public String getCpf() {
        return cpf;
    }

    public String getCreci() {
        return creci;
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

    public Corretor buscarCorretor(String CPF_corretor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
