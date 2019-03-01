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
public class Proprietario {
    @Id
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;
    
    
    public Proprietario(){
        
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public String getNomeCompleto(){
        return nomeCompleto;
    }
    
    public String getTelefone(){
        return telefone;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    
    public void setEmail(String email){
        this.email = email;
    }

    //Retorna o objeto proprietario buscado no banco de dados pelo CPF, preenchendo todos os atributos
    public Proprietario buscarProprietario(String CPF_proprietario) {
        //Preenche todos os campos e retorna o objeto this
        return this;
    }

    public void cadastrarProprietario(Proprietario proprietario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
