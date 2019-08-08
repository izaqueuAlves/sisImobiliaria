package Teste;

import classesControle.ControleAdm;
import classesEntidade.Administrador;


public class Classe_Teste {

    public static void main(String args[]) {
        Administrador adm = new Administrador("izaqueualves", "12345", "Izaqueu Alves dos Santos",
                "99999-1003", "adm1@hotmail.com");
        ControleAdm ctrAdm = new ControleAdm();
        ctrAdm.Cadastrar(adm);
    }
}
