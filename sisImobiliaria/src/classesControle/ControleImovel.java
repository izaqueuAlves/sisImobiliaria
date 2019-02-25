/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Adm;
import classesEntidade.Endereco;
import classesEntidade.Imovel;
import classesEntidade.Proprietario;
import classesEntidade.Situacao_Imovel;
import classesEntidade.Tipo_Imovel;

/**
 *
 * @author welerson
 */
public class ControleImovel {

    public ControleImovel() {
    }
    
    void cadastrarImovel(String CPF_proprietario, float area, int numQuartos, int numBanheiros, int numSuites, int vagasGaragem, String descricao, float valorCompra, float valorAluguel, Situacao_Imovel situacao_Imovel, Tipo_Imovel tipo_imovel, Endereco endereco, Adm admLogado)
    {
        Proprietario proprietario = new Proprietario();
        
        proprietario = proprietario.buscarProprietario(CPF_proprietario);

        Imovel novoImovel = new Imovel();
        novoImovel.setArea(area);
        novoImovel.setNumBanheiros(numBanheiros);
        novoImovel.setNumQuartos(numQuartos);
        novoImovel.setNumSuites(numSuites);
        novoImovel.setVagasGaragem(vagasGaragem);
        novoImovel.setDescricao(descricao);
        novoImovel.setValorAluguel(valorAluguel);
        novoImovel.setValorCompra(valorCompra);
        novoImovel.setSituacao_Imovel(situacao_Imovel);
        novoImovel.setProprietario(proprietario);
        novoImovel.setEndereco(endereco);
        novoImovel.setAdm(admLogado);
        novoImovel.setSituacao_Imovel(situacao_Imovel);
        novoImovel.setTipo_imovel(tipo_imovel);
        
        
        try {
            novoImovel.cadastrarImovel(novoImovel);
            //Mensagem de Imovel cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
        
    }
    
}
