package Teste;

import classesControle.ControleAdm;
import classesControle.ControleAluguel;
import classesControle.ControleCliente;
import classesControle.ControleConsultarContratoAluguel;
import classesControle.ControleConsultarContratoVenda;
import classesControle.ControleCorretor;
import classesControle.ControleVenda;
import classesEntidade.Contrato_Venda;
import classesEntidade.Contrato_Aluguel;
import classesEntidade.Corretor;
import classesEntidade.Cliente;
import classesEntidade.Imovel;
import classesEntidade.Endereco;
import classesEntidade.Situacao_Imovel;
import classesEntidade.Tipo_Imovel;
import classesEntidade.Adm;
import classesEntidade.Situacao_Contrato;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Thome
 */
public class Classe_Teste 
{
    public static void main(String args[]){
        Adm adm = new Adm("izaqueualves","12345","Izaqueu Alves dos Santos",
            "99999-1003","adm1@hotmail.com");
        ControleAdm ctrAdm = new ControleAdm();
        ctrAdm.cadastrarAdm(adm);
    }
}
   
    