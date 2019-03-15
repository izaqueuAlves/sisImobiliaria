
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
   private int situacao_Imovel;
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
    
    public int getSituacao_Imovel() {
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
    
     public void setSituacao_Imovel(int i) {
        this.situacao_Imovel = i;
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
   public boolean cadastrarImovel(Imovel imovel) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
        boolean retorno = false; 
        
	try {		
                em.getTransaction().begin();
                em.persist(imovel);
		em.getTransaction().commit();
		retorno = true;
	} catch (Exception e) {
		em.getTransaction().rollback();
            System.out.println("Erro ao cadastrar o imóvel!: "+e);
		
	}finally{
	 	em.close();
	}
        
        return retorno;
    }
     public boolean editarImovel(Imovel imovel) {
	// ABRE A CONEXAO
	EntityManager em = new Connect().getConexao();	
	boolean retorno = false; 
        
	try {		
                em.getTransaction().begin();
                em.merge(imovel);
		em.getTransaction().commit();
		retorno = true;	 		
		// JOptionPane.showMessageDialog(null, "imovel Salvo com Sucesso!", "", 1);
	} catch (Exception e) {
		em.getTransaction().rollback();
             // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao editar o imóvel!: "+e);
		//JOptionPane.showMessageDialog(null, "Ocorreu um erro ao gravar os dados!", "", 0);
	}finally{
	 	em.close();
	}
        
        return retorno;
               
    }   public boolean removerImovel(Integer id_imovel) {
 
        EntityManager em = new Connect().getConexao();
        boolean retorno = false; 
        
        try{    
                em.getTransaction().begin();
                 //procura pelo imovel
                Imovel im = em.find(Imovel.class, id_imovel);
                // remove o imovel
                em.remove(im);                
                em.getTransaction().commit();
                retorno = true; 
                
        }catch(Exception e){
            em.getTransaction().rollback();
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao excluir imóvel!: "+e);
        }finally{
            em.close();
        }
        
        return retorno;
    }  

  
 
   
    public Imovel getImovelById(Integer id_imovel) {
        EntityManager em = new Connect().getConexao();
        Imovel im = null;
        try{
            im = em.find(Imovel.class, id_imovel);   
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Imóvel foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return im;  
    }
    // alterar no diagrama de classe, parametro e retorno
     public List<Imovel> buscarImovel(String nome) {
 
        EntityManager em = new Connect().getConexao();
        List<Imovel> imoveis = null;
        String nomeImovel = "%"+nome+"%";
                
        try{

            Query query = em.createQuery("from Imovel where upper(descricao) like upper(:nomeImovel) order by descricao");
            query.setParameter("nomeImovel", nomeImovel);
            imoveis = query.getResultList();

        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Imóvel foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return imoveis;  
    }
     // retorna uma lista com todos os imoveis disponiveis para venda (situacao: DISPONIVEL_VENDA; DISPONIVEL_VENDA_ALUGUEL)
     public List<Imovel> getImoveisVenda() {
 
        EntityManager em = new Connect().getConexao();
        List<Imovel> imoveis = null;           
        
        try{

            Query query = em.createQuery("from Imovel where situacao_imovel = 1 or situacao_imovel = 2 order by descricao");
            imoveis = query.getResultList();

        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Imóvel foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return imoveis;  
    }
    
     // retorna uma lista com todos os imoveis disponiveis para aluguel (situacao: DISPONIVEL_ALUGUEL; DISPONIVEL_VENDA_ALUGUEL)
     public List<Imovel> getImoveisAluguel() {
 
        EntityManager em = new Connect().getConexao();
        List<Imovel> imoveis = null;           
        
        try{

            Query query = em.createQuery("from Imovel where situacao_imovel = 0 or situacao_imovel = 2 order by descricao");
            imoveis = query.getResultList();

        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Imóvel foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return imoveis;  
    }

     public List<Imovel> getTodosImoveis() {
 
        EntityManager em = new Connect().getConexao();
        List<Imovel> imoveis = null;
        
        try{
            imoveis = em.createQuery("from Imovel i").getResultList();                           
        }catch(Exception e){
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Imóvel foi encontrado!: "+e);
        }finally{
            em.close();
        }
        
        return imoveis;  
    }
     // no diagrama o parametro é um objeto, porem acho q fica melhor colocar como apenas o cpf, ja que o metodo busca o nome proprietatio
     // no banco, caso exista ele substitui; #izaqueu
     public boolean alterarProprietario(String cpf_proprietario, Integer id_imovel){
         Proprietario p = new Proprietario();
         Imovel im = new Imovel();
                  
         p = p.buscarProprietario(cpf_proprietario);
                  
        // proprietario encontrado
         if(p != null){
             im = im.getImovelById(id_imovel);
             im.setProprietario(p);
             im.editarImovel(im);
             return true;
        } else {
              return false;
        } 
     }

}