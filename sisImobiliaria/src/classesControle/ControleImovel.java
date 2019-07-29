/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Adm;
import classesEntidade.Endereco;
import classesEntidade.Imovel;
import classesEntidade.Cliente;
import classesEntidade.Situacao_Imovel;
import classesEntidade.Tipo_Imovel;

/**
 *
 * @author welerson
 */
public class ControleImovel {

    public ControleImovel() {
    }
    
    /**
     * 
     * @param CPF_proprietario
     * @param area
     * @param numQuartos
     * @param numBanheiros
     * @param numSuites
     * @param vagasGaragem
     * @param descricao
     * @param valorCompra
     * @param valorAluguel
     * @param situacao_Imovel
     * @param tipo_imovel
     * @param endereco
     * @param admLogado 
     */
    void cadastrarImovel(String CPF_proprietario, float area, int numQuartos, int numBanheiros, int numSuites, int vagasGaragem, String descricao, float valorCompra, float valorAluguel, int situacao_Imovel, Tipo_Imovel tipo_imovel, Endereco endereco, Adm admLogado)
    {
        Cliente cliente_proprietario = new Cliente();
        
        cliente_proprietario = cliente_proprietario.buscarProprietario(CPF_proprietario);

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
        novoImovel.setProprietario(cliente_proprietario);
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
      
    public void cadastrarImovel2(Imovel i){
        // castra imovel
        i.cadastrarImovel(i);
        
        
    }
    
}
