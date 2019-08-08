package classesControle;

import classesEntidade.Adm;

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
        Adm adm = new Adm();
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

    public boolean Cadastrar(Adm adm) {
        return adm.Cadastrar(adm);
    }

    public boolean Login(String login, String senha) {
        Adm adm = new Adm();
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
