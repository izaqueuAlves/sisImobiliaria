/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Contrato_Venda;
import classesEntidade.Situacao_Contrato;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author welerson
 */
public class ControleConsultarContratoVenda {
    public List<Contrato_Venda> buscarContratosEmAberto() {
        List<Contrato_Venda> contratosList, contratosAbertos = new ArrayList<Contrato_Venda>();
        Contrato_Venda contratos = new Contrato_Venda();
        
        contratosList = contratos.getTodosContratos();
        
        for (int i = 0; i < contratosList.size(); i+=1) {
            Contrato_Venda contrato = contratosList.get(i);
            if (contrato.getSituacao_contrato() == Situacao_Contrato.EM_ABERTO) {
                contratosAbertos.add(contrato);
            }
        }

        return contratosAbertos;
    }
}
