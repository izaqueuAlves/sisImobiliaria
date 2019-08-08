package classesEntidade;

import conexao.Connect;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String CEP;
    private String UF;
    private String cidade;
    private String bairro;
    private String logradouro;
    private String numero;
    private String complemento;

    //Construtores
    public Endereco(String CEP, String UF, String cidade, String bairro, String logradouro, String numero, String complemento) {
        this.CEP = CEP;
        this.UF = UF;
        this.cidade = cidade;
        this.bairro = bairro;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    public Endereco() {

    }

    @Override
    public String toString() {
        return "Rua/Av/Rod " + logradouro + " Nº: " + numero + " " + complemento + ", bairro " + bairro + ", " + cidade + " - " + UF + " de CEP: " + CEP;
    }

    //Gets e Sets
    public String getCEP() {
        return CEP;
    }

    public String getUF() {
        return UF;
    }

    public String getCidade() {
        return cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public Endereco Buscar(Integer id_endereco) {

        EntityManager em = new Connect().getConexao();
        Endereco en = null;
        try {
            en = em.find(Endereco.class, id_endereco);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }

        return en;
    }

    public boolean Cadastrar(Endereco endereco) {

        EntityManager em = new Connect().getConexao();
        boolean retorno = false;

        try {
            em.getTransaction().begin();
            em.persist(endereco);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
        }
        return retorno;
    }
}
