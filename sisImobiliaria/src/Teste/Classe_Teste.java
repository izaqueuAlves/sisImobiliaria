package Teste;

import classesControle.ControleAdm;
import classesEntidade.Adm;


public class Classe_Teste {

    public static void main(String args[]) {
            Adm adm = new Adm("izaqueualves", "12345", "Izaqueu Alves dos Santos",
                "99999-1003", "adm1@hotmail.com");
        ControleAdm ctrAdm = new ControleAdm();
        ctrAdm.Cadastrar(adm);
    }
}
