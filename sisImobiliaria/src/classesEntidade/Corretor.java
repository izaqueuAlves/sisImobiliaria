package classesEntidade;

import conexao.Connect;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;
import javax.persistence.Query;

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

    public Corretor Buscar(String creci) {

        EntityManager em = new Connect().getConexao();
        Corretor corretor = null;

        try {
            Query query = em.createQuery("from Corretor where creci = :creci");
            query.setParameter("creci", creci);
            corretor = (Corretor) query.getSingleResult();
        } catch (Exception e) {

        } finally {
            em.close();
        }
        return corretor;
    }

    public boolean Cadastrar(Corretor corretor) {

        EntityManager em = new Connect().getConexao();
        boolean retorno = false;

        try {

            em.getTransaction().begin();
            em.persist(corretor);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return retorno;
    }

    public boolean Editar(Corretor corretor) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;

        try {
            em.getTransaction().begin();
            em.merge(corretor);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return retorno;
    }

    public List<Corretor> GetTodos() {

        EntityManager em = new Connect().getConexao();
        List<Corretor> corretores = null;

        try {
            corretores = em.createQuery("from Corretor c").getResultList();
        } catch (Exception e) {

        } finally {
            em.close();
        }

        return corretores;
    }

    public boolean Excluir(String cpf_corretor) {
        boolean retorno = false;
        EntityManager em = new Connect().getConexao();

        try {
            em.getTransaction().begin();
            //procura pelo imovel
            Corretor corretor = em.find(Corretor.class, cpf_corretor);
            // remove o imovel
            em.remove(corretor);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return retorno;
    }
}