/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Comprador;
import classesEntidade.Contrato_Venda;
import classesEntidade.Imovel;
import classesEntidade.Proprietario;
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
public class ControleConsultarContratoVenda {
    
    /**
     * sem parametros
     * @return Lista de Contratos_Venda com os contratos em aberto
     */
    
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
    
    /**
     * 
     * @param id_contrato (O id do contrato escolhido na tela)
     * @return True se o contrato for fechado(alterado no banco) com sucesso, False caso contrário
     */
    public boolean fecharContratoEmAberto(int id_contrato) {
        Contrato_Venda contrato = new Contrato_Venda();
        Imovel imovel;
        
        contrato = contrato.consultarContrato(id_contrato);
        imovel = contrato.getImovel();
        Proprietario novoProprietario = new Proprietario();
        Comprador comprador;
        comprador = contrato.getComprador();
                
        novoProprietario.setCpf(comprador.getCpf());
        novoProprietario.setEmail(comprador.getEmail());
        novoProprietario.setNomeCompleto(comprador.getNomeCompleto());
        novoProprietario.setTelefone(comprador.getTelefone());
        
        novoProprietario.cadastrarProprietario(novoProprietario);
        
        novoProprietario = novoProprietario.buscarProprietario(novoProprietario.getCpf());
        
        imovel.setProprietario(novoProprietario);
        imovel.editarImovel(imovel);
        
        Date data = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFechamento = dateFormat.format(data);
        contrato.setDataFechamento(dataFechamento);
        contrato.setSituacao_contrato(Situacao_Contrato.FECHADO);
        
        try {
            contrato.alterarContratoEmAberto();
            return true;
        } catch (Exception e){
            return false;
        }
    }
    
    
    
}
