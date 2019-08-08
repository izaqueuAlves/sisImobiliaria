package classesEntidade;

import conexao.Connect;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Query;

@Entity
public class Administrador {

    @Id
    private String login;
    private String senha;
    private String nomeCompleto;
    private String telefone;
    private String email;

    //Construtores
    public Administrador(String login, String senha, String nomeCompleto, String telefone, String email) {
        this.login = login;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
    }

    public Administrador() {

    }

    //Gets e sets
    public String getLogin() {
        return login;
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

    public void setLogin(String login) {
        this.login = login;
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

    public boolean Cadastrar(Administrador adm) {
        
        // ABRE A CONEXAO
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;

        try {
            em.getTransaction().begin();
            em.persist(adm);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return retorno;
    }

    public Administrador BuscarPorLogin(String login) {

        EntityManager em = new Connect().getConexao();
        Administrador adm = null;
        try {
            Query query = em.createQuery("from Adm where login = :login");
            query.setParameter("login", login);
            adm = (Administrador) query.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return adm;
    }
}
