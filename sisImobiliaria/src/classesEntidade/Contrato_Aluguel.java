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
import javax.persistence.ManyToOne;

/**
 *
 * @author Izaqueu
 */
@Entity
public class Contrato_Aluguel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private float valorAluguel;
    private String descricaoAluguel;
    private String dataFechamento;
    private String dataInicio;
    private String dataFim;
    private Situacao_Contrato situacao_contrato;
    
    
    /* TALVEZ SEJA MELHOR COLOCAR SITUACAO_IMOVEL COMO TABELA
    @ManyToOne
    private Situacao_Contrato situacaoContrato;
    */
    
    @ManyToOne
    private Locatario locatario;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;

    public Contrato_Aluguel() {
    }

    public Contrato_Aluguel(float valorAluguel, String descricaoAluguel, String dataFechamento, String dataInicio, String dataFim) {
        this.valorAluguel = valorAluguel;
        this.descricaoAluguel = descricaoAluguel;
        this.dataFechamento = dataFechamento;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setDescricaoAluguel(String descricaoAluguel) {
        this.descricaoAluguel = descricaoAluguel;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public void setLocatario(Locatario locatario) {
        this.locatario = locatario;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }

    
    
    public int getIdContrato() {
        return idContrato;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public String getDescricaoAluguel() {
        return descricaoAluguel;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public Locatario getLocatario() {
        return locatario;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }

    public Situacao_Contrato getSituacao_contrato() {
        return situacao_contrato;
    }

    public void setSituacao_contrato(Situacao_Contrato situacao_contrato) {
        this.situacao_contrato = situacao_contrato;
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
            System.out.println("Erro ao abrir contrato de aluguel!: "+e);   
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
            System.out.println("Erro ao fechar contrato de aluguel!: "+e);   
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
            System.out.println("Erro ao alterar contrato de aluguel!: "+e);   
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
            System.out.println("Erro ao cancelar contrato de aluguel!: "+e);   
        }finally{
            em.close();
        }
        
        return retorno;
    }
   
    public List<Contrato_Aluguel> getContratosAluguel(){
        EntityManager em = new Connect().getConexao();
        List<Contrato_Aluguel> contratos_aluguel = null;
        
        try{
            contratos_aluguel = em.createQuery("from Contrato_Aluguel ca").getResultList();
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum contrato de aluguel encontrado!: "+e);   
        }finally{
            em.close();
        }
        
        return contratos_aluguel;
    }
  
   // contratos virgentes são os contratos que estao em aberto e tem a data final do contrato maior que a data atual, ou seja ainda vai vencer. #izaqueu
   // PS: as datas devem estar no formato DD/MM/AAAA . para o metodo abaixo funcionar.
    public List<Contrato_Aluguel> getContratosVigentes(){
        EntityManager em = new Connect().getConexao();
        List<Contrato_Aluguel> contratos_vigentes = null;
        
        try{
            contratos_vigentes = em.createQuery("from Contrato_Aluguel where datafim > TO_CHAR(current_date, 'DD/MM/YYYY') and situacao_contrato = 0").getResultList();
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum contrato de aluguel virgente encontrado!: "+e);   
        }finally{
            em.close();
        }
        
        return contratos_vigentes;
    }
  
    public Contrato_Aluguel consultarContrato(int id_contrato){
        EntityManager em = new Connect().getConexao();
        Contrato_Aluguel contrato = null;
        
        try{
            contrato = em.find(Contrato_Aluguel.class, id_contrato);
        }catch(Exception e){
            System.out.println("Nenhum contrato de aluguel encontrado!: "+e);   
        }finally{
            em.close();
        }
        
        return contrato;
    }
     
}
