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
public class Tipo_Imovel {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoImovel;
    private String nome;
    private boolean emCondominio;
    
    // Funcoes contrutoras Imovel
    public Tipo_Imovel(){
        
    }

    public Tipo_Imovel(String nome, boolean emCondominio) {
        this.nome = nome;
        this.emCondominio = emCondominio;
    }
    
    //Gets e sets

    public int getIdTipoImovel() {
        return idTipoImovel;
    }

    public String getNome() {
        return nome;
    }

    public boolean isEmCondominio() {
        return emCondominio;
    }

    public void setIdTipoImovel(int idTipoImovel) {
        this.idTipoImovel = idTipoImovel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmCondominio(boolean emCondominio) {
        this.emCondominio = emCondominio;
    }
    
}
