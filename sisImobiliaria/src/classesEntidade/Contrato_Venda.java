/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import conexao.Connect;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Izaqueu
 */
// melhor alterar o dagrama de classe onde id contrato de venda e aluguel esta como string
// alterar pra int: Sim, nao sei pq estava string (Welerson)


@Entity
public class Contrato_Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private float valorVenda;
    private String descricaoVenda;
    private String dataFechamento;
    private Situacao_Contrato situacao_contrato;

    
    /* TALVEZ SEJA MELHOR COLOCAR SITUACAO_IMOVEL COMO TABELA
    @ManyToOne
    private Situacao_Contrato situacaoContrato;
    Situacao contrato e imovel são enumerations. São 4 valores meio q imutáveis então acho q não precisa estar no banco
    o enumeration é tipo um banco local e vai ficar salvo como um atributo no banco do imovel ou contrato como int
    */
    
    @ManyToOne
    private Comprador comprador;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;

    public Contrato_Venda() {
    }

    public Contrato_Venda(float valorVenda, String descricaoVenda, String dataFechamento) {
        this.valorVenda = valorVenda;
        this.descricaoVenda = descricaoVenda;
        this.dataFechamento = dataFechamento;
    }
    
    public void setSituacao_contrato(Situacao_Contrato situacao_contrato) {
        this.situacao_contrato = situacao_contrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    public Situacao_Contrato getSituacao_contrato() {
        return situacao_contrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }
    
    //O objeto é a ser tratado nas func abaixo é próprio contrato (this)

    public boolean abrirContrato() {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.persist(this);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao abrir contrato de venda!: "+e);   
        }finally{
            em.close();
        }
        
        return retorno;
    }
    // fechar contrato, alterar contato e cancelar contrato os metodos sao iguais a alteração sera apenas na situação do contrato
    // onde será feita no na classe controle. #izaqueu
    public boolean fecharContrato() {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.merge(this);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao fechar contrato de venda!: "+e);   
        }finally{
            em.close();
        }
        
        return retorno;
    }

    public boolean alterarContratoEmAberto() {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.merge(this);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao alterar contrato de venda!: "+e);   
        }finally{
            em.close();
        }
        
        return retorno;
    }
    
    public boolean cancelarContratoEmAberto() {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        
        try{
            em.getTransaction().begin();
            em.merge(this);
            em.getTransaction().commit();
            retorno = true;
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cancelar contrato de venda!: "+e);   
        }finally{
            em.close();
        }
        
        return retorno;
    }
   
    public List<Contrato_Venda> getTodosContratos(){
        EntityManager em = new Connect().getConexao();
        List<Contrato_Venda> contratos_venda = null;
        
        try{
            contratos_venda = em.createQuery("from Contrato_Venda cv").getResultList();
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum contrato de venda encontrado!: "+e);   
        }finally{
            em.close();
        }
        
        return contratos_venda;
    }
  
    public Contrato_Venda consultarContrato(int id_contrato){
        EntityManager em = new Connect().getConexao();
        Contrato_Venda contrato = null;
        
        try{
            contrato = em.find(Contrato_Venda.class, id_contrato);
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum contrato de venda encontrado!: "+e);   
        }finally{
            em.close();
        }
        
        return contrato;
    }
   
    public List<Object> negociantes(Contrato_Venda contrato){
        
        List<Object> negociantes = new ArrayList<>();
        
        negociantes.add(contrato.comprador);
        negociantes.add(contrato.corretor);
        
        return negociantes;
    }
    
}
