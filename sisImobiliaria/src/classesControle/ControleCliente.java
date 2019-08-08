package classesControle;

import classesEntidade.Cliente;

public class ControleCliente {

    public ControleCliente() {
        
    }

    /**
    * @param CPF
    * @param nomeCompleto
    * @param telefone
    * @param email
    **/
    public boolean Cadastrar(String CPF, String nomeCompleto, String telefone, String email) {
        Cliente cliente = new Cliente();
        cliente = new Cliente();
        boolean retorno = false;

        cliente.setCpf(CPF);
        cliente.setNomeCompleto(nomeCompleto);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);

        try {
            cliente.Cadastrar(cliente);
            retorno = true;
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
        
        return retorno;
    }

    public boolean Cadastrar(Cliente cliente) {
        return Cadastrar(cliente.getCpf(), cliente.getNomeCompleto(),cliente.getTelefone(),cliente.getEmail());
    }

    /**
     * @param novoCPF
     * @param novoNomeCompleto
     * @param novoTelefone
     * @param novoEmail
     **/
    public void Editar(String novoCPF, String novoNomeCompleto, String novoTelefone, String novoEmail) {
        Cliente cliente = new Cliente();
        cliente = new Cliente();

        cliente.setCpf(novoCPF);
        cliente.setNomeCompleto(novoNomeCompleto);
        cliente.setTelefone(novoTelefone);
        cliente.setEmail(novoEmail);
        try {
            cliente.Editar(cliente);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    //FAZER 
    public void Excluir() {

        
    }

    public Cliente BuscarProprietario(String cpf) {
        Cliente p = new Cliente();
        return p.BuscarProprietario(cpf);
    }
}
