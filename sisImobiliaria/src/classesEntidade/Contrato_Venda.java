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
// alterar pra int

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
    */
    
    @ManyToOne
    private Comprador comprador;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;
    
    
    
}
