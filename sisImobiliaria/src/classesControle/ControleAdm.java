package classesControle;

import classesEntidade.Administrador;

public class ControleAdm {

    public ControleAdm() {
    }

    /**
     * @param login
     * @param email
     * @param nomeCompleto
     * @param senha
     * @param telefone
     **/
    void Cadastrar(String login, String email, String nome, String telefone) {
        Administrador adm = new Administrador();
        adm.setLogin(login);
        adm.setEmail(email);
        adm.setNomeCompleto(nome);
        adm.setTelefone(telefone);

        try {
            adm.Cadastrar(adm);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public boolean Cadastrar(Administrador adm) {
        return adm.Cadastrar(adm);
    }

    public boolean Login(String login, String senha) {

        Administrador adm = new Administrador();
        adm = adm.BuscarPorLogin(login);

        if (adm != null) {
            if (login.equals(adm.getLogin()) && senha.equals(adm.getSenha())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
