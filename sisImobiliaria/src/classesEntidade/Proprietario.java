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
public class Proprietario {
    @Id
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;
    
    
    public Proprietario(){
        
    }
    
    public Proprietario(String cpf, String nomeCompleto, String telefone, String email){
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
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

    
   
       public boolean cadastrarProprietario(Proprietario proprietario) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
	boolean retorno = false;
        
	try {	                
                em.getTransaction().begin();
                em.persist(proprietario);
		em.getTransaction().commit();
                retorno = true;
                
	} catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cadastrar proprietario!: "+e);
            em.getTransaction().rollback();
	}finally{
	 	em.close();
	}
        
        return retorno;
    }
     
       public boolean editarProprietario(Proprietario proprietario) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
	boolean retorno = false;
        
	try {		
                em.getTransaction().begin();
                em.merge(proprietario);
		em.getTransaction().commit();
			 	
	} catch (Exception e) {
		em.getTransaction().rollback();
                // alterar depois para ser mostrado na tela com JOptionPane
                 System.out.println("Erro ao editar proprietario!: "+e);
		
	}finally{
	 	em.close();
	}
        
        return retorno;
    }
     
    
    
    //Retorna o objeto proprietario buscado no banco de dados pelo CPF, preenchendo todos os atributos
    public Proprietario buscarProprietario(String cpf_proprietario) {
        EntityManager em = new Connect().getConexao();	
	Proprietario proprietario = null;
	
        try {		
               proprietario = em.find(Proprietario.class, cpf_proprietario);                
			 	
	} catch (Exception e) {
                // alterar depois para ser mostrado na tela com JOptionPane
                System.out.println("Nenhum proprietário encontrado!: "+e);
		
	}finally{
	 	em.close();
	}
        
        return proprietario;
    }
   

    public List<Proprietario> getTodosProprietarios() {
	
	EntityManager em = new Connect().getConexao();	
	List<Proprietario> proprietarios = null;
        
	try {		
               proprietarios = em.createQuery("from Proprietario p").getResultList();
			 	
	} catch (Exception e) {
		em.getTransaction().rollback();
		
	}finally{
	 	em.close();
	}
        
        return proprietarios;
    } 
      
}
