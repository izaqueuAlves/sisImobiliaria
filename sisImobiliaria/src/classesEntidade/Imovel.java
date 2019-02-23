
package classesEntidade;


import conexao.Connect;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


/**
 * 
 * @author Izaqueu
 * 
 */
@Entity
public class Imovel {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int id;
   private float area;
   private int numQuartos, numBanheiros, numSuites, vagasGaragem;
   private ArrayList<String> fotos;
   private String descricao;
   private float valorCompra;
   private float valorAluguel;
   // chaves estranheiras
   @ManyToOne
   private Proprietario CPF_proprietario;
   @ManyToOne
   private Situacao_Imovel situacao;
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
    public int getId() {
        return id;
    }

    public float getArea() {
        return area;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public int getNumSuites() {
        return numSuites;
    }

    public int getVagasGaragem() {
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

    public Proprietario getCPF_proprietario() {
        return CPF_proprietario;
    }
    
    public Situacao_Imovel getSituaccao_Imovel() {
        return situacao;
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

    public void setCPF_proprietario(Proprietario CPF_proprietario) {
        this.CPF_proprietario = CPF_proprietario;
    }
    
     public void setSituaccao_Imovel(Situacao_Imovel situacao) {
        this.situacao = situacao;
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

    public void cinserir(Imovel im) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
