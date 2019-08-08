package classesControle;

import classesEntidade.Corretor;

public class ControleCorretor {

    public Corretor corretor = new Corretor();

    public ControleCorretor() {
        corretor = new Corretor();
    }

    /**
     * @param CRECI
     * @param CPF
     * @param senha
     * @param nomeCompleto
     * @param telefone
     * @param email 
     * return void
     **/
    void cadastrarCorretor(String CRECI, String CPF, String senha, String nomeCompleto, String telefone, String email) {
        corretor = new Corretor();
        corretor.setCreci(CRECI);
        corretor.setCpf(CPF);
        corretor.setSenha(senha);
        corretor.setNomeCompleto(nomeCompleto);
        corretor.setTelefone(telefone);
        corretor.setEmail(email);

        try {
            corretor.Cadastrar(corretor);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public boolean Cadastrar(Corretor corretor) {
        return corretor.Cadastrar(corretor);
    }

    /**
     * @param novoCRECI
     * @param novoCPF
     * @param novaSenha
     * @param novoNomeCompleto
     * @param novoTelefone
     * @param novoEmail
     **/
    public void Editar(String CRECI, String CPF, String senha, String nomeCompleto, String telefone, String email) {
        corretor = new Corretor();
        corretor.setCreci(CRECI);
        corretor.setCpf(CPF);
        corretor.setSenha(senha);
        corretor.setNomeCompleto(nomeCompleto);
        corretor.setTelefone(telefone);
        corretor.setEmail(email);

        try {
            corretor.Editar(corretor);
        } catch (Error e) {
            e.printStackTrace();
        }

    }

    public void Excluir(String CPF) {
        corretor = new Corretor();
        try {
            corretor.Excluir(CPF);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public boolean Login(String creci, String senha) {

        Corretor corretor = new Corretor();
        corretor = corretor.Buscar(creci);

        if (corretor != null) {
            if (creci.equals(corretor.getCreci()) && senha.equals(corretor.getSenha())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}