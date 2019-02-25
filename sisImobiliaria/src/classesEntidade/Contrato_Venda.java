/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Izaqueu
 */
// melhor alterar o dagrama de classe onde id contrato de venda e aluguel esta como string
// alterar pra int: Sim, nao sei pq estava string (Welerson)


@Entity
public class Contrato_Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private float valorVenda;
    private String descricaoVenda;
    private String dataFechamento;
    
    /* TALVEZ SEJA MELHOR COLOCAR SITUACAO_IMOVEL COMO TABELA
    @ManyToOne
    private Situacao_Contrato situacaoContrato;
    Situacao contrato e imovel são enumerations. São 4 valores meio q imutáveis então acho q não precisa estar no banco
    o enumeration é tipo um banco local e vai ficar salvo como um atributo no banco do imovel ou contrato como int
    */
    
    @ManyToOne
    private Comprador comprador;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;

    public Contrato_Venda() {
    }

    public Contrato_Venda(float valorVenda, String descricaoVenda, String dataFechamento) {
        this.valorVenda = valorVenda;
        this.descricaoVenda = descricaoVenda;
        this.dataFechamento = dataFechamento;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setDescricaoVenda(String descricaoVenda) {
        this.descricaoVenda = descricaoVenda;
    }

    public void setDataFechamento(String dataFechamento) {
        this.dataFechamento = dataFechamento;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
    

    public int getIdContrato() {
        return idContrato;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public String getDescricaoVenda() {
        return descricaoVenda;
    }

    public String getDataFechamento() {
        return dataFechamento;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public Corretor getCorretor() {
        return corretor;
    }

    public Imovel getImovel() {
        return imovel;
    }
    
    
    
}
