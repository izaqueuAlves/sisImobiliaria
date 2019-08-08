package classesEntidade;

import conexao.Connect;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Query;

@Entity
public class Tipo_Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoImovel;
    private String nome;
    private boolean emCondominio;

    // Funcoes contrutoras Imovel
    public Tipo_Imovel() {

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

    public void Cadastrar(String nome, boolean emCondominio) {
        Tipo_Imovel type = new Tipo_Imovel();

        type.setNome(nome);
        type.setEmCondominio(emCondominio);

        try {
            type.Novo(type);
            //Mensagem de Imovel cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }

    public void Novo(Tipo_Imovel tipo_imovel) {

        EntityManager em = new Connect().getConexao();

        try {
            em.getTransaction().begin();
            em.persist(tipo_imovel);
            em.getTransaction().commit();

        } catch (Exception e) {
            em.getTransaction().rollback();

        } finally {
            em.close();
        }
    }

    // verificar se vai ser preciso buscar apenas um tipo, provavelmente isso estará em uma combo listantos todos. ass izaqueu

    public List<Tipo_Imovel> Buscar() {

        EntityManager em = new Connect().getConexao();
        List<Tipo_Imovel> tipos = null;

        try {
            tipos = em.createQuery("from Tipo_Imovel tp").getResultList();

        } catch (Exception e) {
            em.getTransaction().rollback();

        } finally {
            em.close();
        }

        return tipos;

    }

    public Tipo_Imovel BuscarPorNome(String str) {

        EntityManager em = new Connect().getConexao();
        Tipo_Imovel ti = null;
        String nome = "%" + str + "%";

        try {
            Query query = em.createQuery("from Tipo_Imovel where upper(nome) like upper(:nome)");
            query.setParameter("nome", nome);
            ti = (Tipo_Imovel) query.getSingleResult();

        } catch (Exception e) {
            System.out.println("Tipo de imóvel não encontrado!: " + e);
        } finally {
            em.close();
        }
        return ti;
    }
}
