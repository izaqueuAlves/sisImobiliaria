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
import javax.persistence.Id;

/**
 *
 * @author Izaqueu
 */
@Entity
public class Locatario {
    @Id
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;

    public Locatario() {
    }

    public Locatario(String cpf, String nomeCompleto, String telefone, String email) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    public Locatario buscarLocatario(String cpf_locatario) {
        EntityManager em = new Connect().getConexao();
        Locatario l = new Locatario();
        
        try{
            l = em.find(Locatario.class, cpf_locatario);
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Locatário não encontrado!: "+e);            
        }finally{
            em.close();
        }
    
        return l;
    }

    public boolean cadastrarLocatario(Locatario locatario) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.persist(locatario);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cadastrar locatário!: "+e); 
        }finally{
            em.close();
        }
        
        return retorno;
    }

    public boolean editarLocatario(Locatario locatario) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.merge(locatario);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao editar locatário!: "+e); 
        }finally{
            em.close();
        }
        
        return retorno;
    }
    
    public List<Locatario> getTodosLocatarios() {
	
	EntityManager em = new Connect().getConexao();	
	List<Locatario> locatarios = null;
        
	try {		
               locatarios = em.createQuery("from Locatario p").getResultList();
			 	
	} catch (Exception e) {
		em.getTransaction().rollback();
		
	}finally{
	 	em.close();
	}
        
        return locatarios;
    } 
    
    
}
