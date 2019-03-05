/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import conexao.Connect;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
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
    private Integer idTipoImovel;
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

    public Integer getIdTipoImovel() {
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
    
    
    
       public void novoTipo(Tipo_Imovel tipo_imovel) {
	
	EntityManager em = new Connect().getConexao();	
	
	try {		
                em.getTransaction().begin();
                em.persist(tipo_imovel);
		em.getTransaction().commit();
			 	
	} catch (Exception e) {
		em.getTransaction().rollback();
		
	}finally{
	 	em.close();
	}
    }
       // verificar se vai ser preciso buscar apenas um tipo, provavelmente isso estará em uma combo listantos todos. ass izaqueu
    public List<Tipo_Imovel> buscarTipo(){
	
	EntityManager em = new Connect().getConexao();	
	List<Tipo_Imovel> tipos = null;
	
        try {		
                tipos = em.createQuery("from Tipo_Imovel tp").getResultList();
                	 	
	} catch (Exception e) {
		em.getTransaction().rollback();
		
	}finally{
	 	em.close();
	}
    
       return tipos;
       
       }
}
