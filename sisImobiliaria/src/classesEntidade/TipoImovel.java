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
public class TipoImovel {
    @Id 
    private int idTipoImovel;
    private String nome;
    private boolean emCondominio;
    
    // Funcoes contrutoras Imovel
    public TipoImovel(){
        
    }

    public TipoImovel(String nome, boolean emCondominio) {
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
