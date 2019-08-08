package classesControle;

import classesEntidade.Administrador;

public class ControleGerenciarAdm {

    /**
     * @param login
     * @param senha
     * @param nomeComp
     * @param telefone
     * @param email
     **/
    public void Cadastrar(String login, String senha, String nomeComp, String telefone, String email) {
        Administrador novoAdm = new Administrador();

        novoAdm.setLogin(login);
        novoAdm.setSenha(senha);
        novoAdm.setNomeCompleto(nomeComp);
        novoAdm.setTelefone(telefone);
        novoAdm.setEmail(email);

        try {
            novoAdm.Cadastrar(novoAdm);
        } catch (Error e) {
            e.printStackTrace();
        }
    }
}
