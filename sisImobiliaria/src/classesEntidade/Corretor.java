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
        
        EntityManager em = new Connect().getConexao();
        Corretor corretor = null;
        
        try{
           corretor = em.find(Corretor.class, CPF_corretor);
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Corretor não encontrado!: "+e);
        }finally{
            em.close();
        }
        return corretor; 
    }

    public boolean cadastrarCorretor(Corretor corretor) {
        
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            
            em.getTransaction().begin();
            em.persist(corretor);
            em.getTransaction().commit();
            
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cadastrar corretor!: "+e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return retorno;
    }
    
     public boolean editarCorretor(Corretor corretor) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            
            em.getTransaction().begin();
            em.merge(corretor);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao editar corretor!: "+e);
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        return retorno;
    }
    
      public List<Corretor> getTodosCorretores() {
 
        EntityManager em = new Connect().getConexao();
        List<Corretor> corretores = null;
        
        try{
            corretores = em.createQuery("from Corretor c").getResultList();                           
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum corretor foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return corretores;  
    }
      
       public boolean excluirCorretor(String cpf_corretor) {
        boolean retorno = false;
        EntityManager em = new Connect().getConexao();
        
        try{    
                em.getTransaction().begin();
                 //procura pelo imovel
                Corretor corretor = em.find(Corretor.class, cpf_corretor);
                // remove o imovel
                em.remove(corretor);                
                em.getTransaction().commit();
                retorno = true;
        }catch(Exception e){
            em.getTransaction().rollback();
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao excluir corretor!: "+e);
        }finally{
            em.close();
        }
        
        return retorno;
     }

    public boolean fazerLogin(String creci, String senha) {
        
        // implementar metodo
        
        return true;
    }
}
