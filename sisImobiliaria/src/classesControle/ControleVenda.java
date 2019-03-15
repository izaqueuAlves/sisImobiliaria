/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Comprador;
import classesEntidade.Contrato_Venda;
import classesEntidade.Corretor;
import classesEntidade.Endereco;
import classesEntidade.Imovel;
import classesEntidade.Proprietario;
import classesEntidade.Situacao_Contrato;
import classesEntidade.Situacao_Imovel;

/**
 *
 * @author welerson
 */


public class ControleVenda {
    /**
     * 
     * @param CPF_comprador
     * @param IdImovel
     * @param CPF_corretor
     * @param condicoesPagamento // Descrição em string das condições 
     * @param precoNegociado  (em String mesmo)// Obs: O preço negociado pode ser diferente do preço real do imovel salvo na classe imovel. Por isso dá a opção de preço na hora de cadastrar a venda
     */
    public void vendaImovel(String CPF_comprador, int IdImovel, String CPF_corretor, String condicoesPagamento, String precoNegociado) 
    {
        Imovel imovel = new Imovel();
        Endereco endereco = new Endereco();
        Proprietario proprietario = new Proprietario();
        Comprador comprador = new Comprador();
        Corretor corretor = new Corretor();
        
        imovel = imovel.getImovelById(IdImovel);
        
        if (imovel.getSituacao_Imovel() != 1 && imovel.getSituacao_Imovel() != 2) 
        {
            System.out.println("erro, imóvel não disponível para venda!");
            //Colocar mensagem na tela
            return;
        }
        
        endereco = imovel.getEndereco();
        proprietario = imovel.getProprietario();
        comprador = comprador.buscarComprador(CPF_comprador);
        corretor = corretor.buscarCorretor(CPF_corretor);
        
        Contrato_Venda contrato = new Contrato_Venda();
        
        String descricao = ""
                + "Contrato de Venda de Imóvel!\n"
                + "Por este instrumento particular, as partes qualificadas na Cláusula 1ª têm entre si justa e acertada a presente relação contratual por intermédio do Corretor "+ corretor.getNomeCompleto() +", registrado com o CRECI: "+corretor.getCreci()+" .\n"
                + "CLÁUSULA 1ª - QUALIFICAÇÃO DAS PARTES\n"
                + "Vendedor\n"
                + "Nome Completo: "+proprietario.getNomeCompleto() + "\n"
                + "CPF: " + proprietario.getCpf() + "\n"
                + "\n"
                + "Comprador\n"
                + "Nome Completo: " +comprador.getNomeCompleto() + "\n"
                + "CPF: " + comprador.getCpf() +"\n"
                + "\n"
                + "\n"
                + "CLÁUSULA 2ª - O presente contrato tem por finalidade a comercialização do imóvel descrito a seguir, de propriedade do VENDEDOR:\n"
                + "Endereco do Imovel: " +endereco.toString()+ "\n"
                + "\n"
                + "CLÁUSULA 3ª - Pelo presente instrumento e na melhor forma de direito, o VENDEDOR tem ajustado vender, conforme promete ao COMPRADOR, e esse comprar-lhe, o imóvel descrito e caracterizado na Cláusula 2ª, que possue de forma livre e desembaraçada de quaisquer ônus real, pessoal, fiscal ou extrajudicial, dívidas, arrestos ou seqüestros, ou, ainda, de restrições de qualquer natureza, pelo preço e de conformidade com as cláusulas ora estabelecidas.\n"
                + "\n"
                + "CLÁUSULA 4ª - O preço certo e ajustado da venda ora acertada é de R$ " + precoNegociado +" a título de sinal de negócio e princípio de pagamento, conforme recibo assinado pelo VENDEDOR e que, na época do pagamento, foi entregue aos COMPRADOR e de cujo recebimento dão a mais ampla quitação. \n"
                + "\n"
                + "O valor será pago nas seguintes condicoes: " + condicoesPagamento + "\n"
                + "\n"
                + "CLÁUSULA 5ª - A posse do imóvel objeto deste contrato é transmitida pelo VENDEDOR ao COMPRADOR neste ato, situação essa representada pela entrega das chaves do referido imóvel.\n"
                + "E por estarem assim justas e contratadas as partes assinam o presente contrato em vias de igual teor e forma, na presença de testemunhas."
                + "\n"
                + "\n";
        
        contrato.setComprador(comprador);
        contrato.setCorretor(corretor);
        contrato.setImovel(imovel);
        precoNegociado = precoNegociado.replace(',', '.');
        contrato.setValorVenda(Float.parseFloat(precoNegociado));
        contrato.setDescricaoVenda(descricao);
        contrato.setSituacao_contrato(Situacao_Contrato.EM_ABERTO);
        
        try 
        {
            contrato.abrirContrato();
            // Mensagem Contrato aberto com sucesso
        }catch (Exception e)
        {
            e.printStackTrace();
            // Mensagem de erro ao abrir contrato
        }
        
        
    }
    
}
