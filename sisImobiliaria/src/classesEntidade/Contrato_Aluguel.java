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
@Entity
public class Contrato_Aluguel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrato;
    private float valorAluguel;
    private String descricaoAluguel;
    private String dataFechamento;
    private String dataInicio;
    private String dataFim;
    
    /* TALVEZ SEJA MELHOR COLOCAR SITUACAO_IMOVEL COMO TABELA
    @ManyToOne
    private Situacao_Contrato situacaoContrato;
    */
    
    @ManyToOne
    private Locatario locatario;
    
    @ManyToOne
    private Corretor corretor;    
    
    @ManyToOne
    private Imovel imovel;
    
}
