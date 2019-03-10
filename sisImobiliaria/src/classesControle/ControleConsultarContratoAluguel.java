/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Contrato_Aluguel;
import classesEntidade.Situacao_Contrato;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author welerson
 */
public class ControleConsultarContratoAluguel {
    
    /**
     * sem parametros
     * @return Lista de Contratos_Aluguel com os contratos em aberto
     */
    
    public List<Contrato_Aluguel> buscarContratosEmAberto() {
        List<Contrato_Aluguel> contratosList, contratosAbertos = new ArrayList<Contrato_Aluguel>();
        Contrato_Aluguel contratos = new Contrato_Aluguel();
        
     /*   contratosList = contratos.getTodosContratos();
        
        for (int i = 0; i < contratosList.size(); i+=1) {
            Contrato_Aluguel contrato = contratosList.get(i);
            if (contrato.getSituacao_contrato() == Situacao_Contrato.EM_ABERTO) {
                contratosAbertos.add(contrato);
            }
        }*/

        return contratosAbertos;
    }

    /**
     * 
     * @param id_contrato aluguel
     * @return true se fechar contrato (salvar no banco) com sucesso, false caso contratrio
     */
    
    public boolean fecharContratoEmAberto(int id_contrato) {
        Contrato_Aluguel contrato = new Contrato_Aluguel();
        
  //      contrato = contrato.consultarContrato(id_contrato);
        
        Date data = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFechamento = dateFormat.format(data);
        contrato.setDataFechamento(dataFechamento);
        contrato.setSituacao_contrato(Situacao_Contrato.FECHADO);
        
        try {
         //   contrato.alterarContratoEmAberto();
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
