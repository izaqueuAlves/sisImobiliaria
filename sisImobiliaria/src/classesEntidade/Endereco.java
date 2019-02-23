/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author welerson
 */
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEndereco;
    private String CEP;
    private String UF;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;
    
    //Construtores

    public Endereco(String CEP, String UF, String cidade, String bairro, String logradouro, String numero, String complemento) {
        this.CEP = CEP;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
    
    public Endereco(){
        
    }
    
    //Gets e Sets

    public String getCEP() {
        return CEP;
    }

    public String getUF() {
        return UF;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    
    
    
}
