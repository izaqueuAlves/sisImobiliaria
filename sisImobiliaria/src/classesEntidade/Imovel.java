
package classesEntidade;


import conexao.Connect;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Query;


/**
 * 
 * @author Izaqueu
 * 
 */
@Entity
public class Imovel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   private float area;
   private Integer numQuartos, numBanheiros, numSuites, vagasGaragem;
   private ArrayList<String> fotos;
   private String descricao;
   private float valorCompra;
   private float valorAluguel;
   private Situacao_Imovel situacao_Imovel;
   // chaves estranheiras
   @ManyToOne
   private Proprietario proprietario;
   @ManyToOne
   private Tipo_Imovel tipo_imovel;
   @OneToOne 
   private Endereco endereco;
   @ManyToOne
   private Adm adm;   

    // Funcoes contrutoras Imovel
    //Construtor Vazio
    public Imovel(){
        
    }
    /*Construtor Completo; obs: Lembrar que o id quem define é o banco de dados, por isso não está no construtor
    public Imovel(float area, int numQuartos, int numBanheiros, int numSuites, int vagasGaragem, ArrayList<String> fotos, String descricao, float valorCompra, float valorAluguel, String CPF_proprietario, Situacao_Imovel situacao_Imovel) {
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.numSuites = numSuites;
        this.vagasGaragem = vagasGaragem;
        this.fotos = fotos;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorAluguel = valorAluguel;
        this.CPF_proprietario = CPF_proprietario;
        this.situacao = situacao_Imovel;
    } */
    /*
        Inicio Gets e Sets Gerados Automaticamente
    */

    public Tipo_Imovel getTipo_imovel() {
        return tipo_imovel;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    
    public Integer getId() {
        return id;
    }

    public float getArea() {
        return area;
    }

    public Integer getNumQuartos() {
        return numQuartos;
    }

    public Integer getNumBanheiros() {
        return numBanheiros;
    }

    public Integer getNumSuites() {
        return numSuites;
    }

    public Integer getVagasGaragem() {
        return vagasGaragem;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public Proprietario getProprietario() {
        return proprietario;
    }
    
    public Situacao_Imovel getSituacao_Imovel() {
        return this.situacao_Imovel;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public void setNumSuites(int numSuites) {
        this.numSuites = numSuites;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setProprietario(Proprietario proprietario) {
        this.proprietario = proprietario;
    }
    
     public void setSituacao_Imovel(Situacao_Imovel situacao_Imovel) {
        this.situacao_Imovel = situacao_Imovel;
    }  
     
    public void setTipo_imovel(Tipo_Imovel tipo_imovel) {
        this.tipo_imovel = tipo_imovel;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setAdm(Adm adm) {
        this.adm = adm;
    }
   
     
   /*
        Fim Gets e Sets Gerados Automaticamente
    */
    
   /*
        Inicio Funções Classe Imovel
    */ 
   public void cadastrarImovel(Imovel imovel) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
	
	try {		
                em.getTransaction().begin();
                em.persist(imovel);
		em.getTransaction().commit();
			 		
		// JOptionPane.showMessageDialog(null, "imovel Salvo com Sucesso!", "", 1);
	} catch (Exception e) {
		em.getTransaction().rollback();
		//JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar os dados!", "", 0);
	}finally{
	 	em.close();
	}
    }
     public void editarImovel(Imovel imovel) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
	
	try {		
                em.getTransaction().begin();
                em.merge(imovel);
		em.getTransaction().commit();
			 		
		// JOptionPane.showMessageDialog(null, "imovel Salvo com Sucesso!", "", 1);
	} catch (Exception e) {
		em.getTransaction().rollback();
		//JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar os dados!", "", 0);
	}finally{
	 	em.close();
	}
    }

    public void removerImovel(Integer id_imovel) {
 
        EntityManager em = new Connect().getConexao();
        
        try{    
                em.getTransaction().begin();
                 //procura pelo imovel
                Imovel im = em.find(Imovel.class, id_imovel);
                // remove o imovel
                em.remove(im);                
                em.getTransaction().commit();
                
        }catch(Exception e){
            em.getTransaction().rollback();
        }finally{
            em.close();
        }
        
        
    }
   
   
   
   
   
    public Imovel buscarImovel(Integer id_imovel) {
 
        EntityManager em = new Connect().getConexao();
        Imovel im = null;
        try{
            im = em.find(Imovel.class, id_imovel);   
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            em.close();
        }
        
        return im;  
    }
    
      public List<Imovel> getTodosImoveis() {
 
        EntityManager em = new Connect().getConexao();
        List<Imovel> imoveis = null;
        
        try{
            imoveis = em.createQuery("from Imovel i").getResultList();                           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            em.close();
        }
        
        return imoveis;  
    }
    
    
}