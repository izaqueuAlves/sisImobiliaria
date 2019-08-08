package classesEntidade;

import conexao.Connect;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Id;

@Entity
public class Cliente {

    @Id
    private String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;
    private char tipo_cliente;

    public Cliente() {
    }

    public Cliente(String cpf, String nomeCompleto, String telefone, String email, char tipo_cliente) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.telefone = telefone;
        this.email = email;
        this.tipo_cliente = tipo_cliente;
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

    public void setTipoCliente(char tipo) {
        this.tipo_cliente = tipo;
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

    public char getTipoCliente() {
        return tipo_cliente;
    }

    public boolean Cadastrar(Cliente cliente) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;

        try {
            em.getTransaction().begin();
            em.persist(cliente);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao cadastrar Cliente!: " + e);
        } finally {
            em.close();
        }

        return retorno;
    }

    public boolean Editar(Cliente cliente) {
        EntityManager em = new Connect().getConexao();
        boolean retorno = false;
        try {

            em.getTransaction().begin();
            em.merge(cliente);
            em.getTransaction().commit();
            retorno = true;
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Erro ao editar Cliente!: " + e);
        } finally {
            em.close();
        }

        return retorno;
    }

    public Cliente Buscar(String cpf_cliente) {
        EntityManager em = new Connect().getConexao();
        Cliente c = new Cliente();

        try {
            c = em.find(Cliente.class, cpf_cliente);
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Cliente encontrado!: " + e);
        } finally {
            em.close();
        }

        return c;
    }

    public Cliente BuscarLocatario(String cpf_locatario) {
        EntityManager em = new Connect().getConexao();
        Cliente c = new Cliente();

        try {
            c = em.find(Cliente.class, cpf_locatario);
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Locatario encontrado!: " + e);
        } finally {
            em.close();
        }

        return c;
    }

    public Cliente BuscarProprietario(String cpf_proprietario) {
        EntityManager em = new Connect().getConexao();
        Cliente c = new Cliente();

        try {
            c = em.find(Cliente.class, cpf_proprietario);
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Proprietário encontrado!: " + e);
        } finally {
            em.close();
        }

        return c;
    }

    public List<Cliente> GetTodos() {

        EntityManager em = new Connect().getConexao();
        List<Cliente> clientes = null;

        try {
            clientes = em.createQuery("from Cliente c").getResultList();
        } catch (Exception e) {
            // alterar depois para ser mostrado na tela com JOptionPane
            System.out.println("Nenhum Cliente foi encontrado!: " + e);
        } finally {
            em.close();
        }

        return clientes;
    }

    public List<Cliente> getTodosProprietarios() {
        List<Cliente> clientes_proprietarios = null;

        return clientes_proprietarios;
    }

    public List<Cliente> getTodosLocatarios() {
        List<Cliente> clientes_locatarios = null;

        return clientes_locatarios;
    }

}
