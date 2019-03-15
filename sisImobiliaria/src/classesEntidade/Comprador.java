/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import conexao.Connect;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;

/**
 *
 * @author Izaqueu
 */
@Entity
public class Comprador {
    @Id
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;

    public Comprador() {
    }

    public Comprador(String cpf, String nomeCompleto, String telefone, String email) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }

    //Gets e sets
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

    public boolean cadastrarComprador(Comprador comprador) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            
            em.getTransaction().begin();
            em.persist(comprador);
            em.getTransaction().commit();
            retorno = true;
            
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cadastrar comprador!: "+e);
        }finally{
            em.close();
        }
        
        return retorno;    
    }
    
    public boolean editarComprador(Comprador comprador) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            
            em.getTransaction().begin();
            em.merge(comprador);
            em.getTransaction().commit();
            retorno = true;
            
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao editar comprador!: "+e);
        }finally{
            em.close();
        }
        
        return retorno;    
    }
   
    public Comprador buscarComprador(String cpf_comprador){
        EntityManager em = new Connect().getConexao();
        Comprador c = new Comprador();
        
        try{            
            c = em.find(Comprador.class, cpf_comprador);
            
        }catch(Exception e){
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum comprador encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return c;    
    }
    
    
    
}
