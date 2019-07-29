/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesControle;

import classesEntidade.Contrato_Aluguel;
import classesEntidade.Corretor;
import classesEntidade.Endereco;
import classesEntidade.Imovel;
import classesEntidade.Cliente;
import classesEntidade.Proprietario;
import classesEntidade.Situacao_Contrato;
import classesEntidade.Situacao_Imovel;


/**
 *
 * @author welerson
 */
public class ControleAluguel {
    /**
     * 
     * @param CPF_locatario 
     * @param IdImovel
     * @param CRECI_corretor
     * @param descricoesAdicionais
     * @param precoNegociado \\O valor negociado do imovel pode ser diferente do registrado no imovel e fica salvo em valorAluguel
     * @param dataInicio
     * @param dataFim
     */
    public void aluguelImovel(String CPF_locatario, int IdImovel, String CRECI_corretor, String descricoesAdicionais, String precoNegociado, String dataInicio, String dataFim) 
    {
        Imovel imovel = new Imovel();
        Endereco endereco = new Endereco();
        Proprietario proprietario = new Proprietario();
        Cliente cliente_locatario = new Cliente();
        Corretor corretor = new Corretor();
        
        imovel = imovel.getImovelById(IdImovel);
        
        if (imovel.getSituacao_Imovel() != 0 && imovel.getSituacao_Imovel() != 2) 
        {
            System.out.println("erro, imóvel não disponível para aluguel!");
            //Colocar mensagem na tela
            return;
        }
        
        endereco = imovel.getEndereco();
        proprietario = imovel.getProprietario();
        cliente_locatario = cliente_locatario.buscarLocatario(CPF_locatario);
        corretor = corretor.buscarCorretor(CRECI_corretor);
        
        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        //String dataIniAluguel = dateFormat.format(dataInicio);
        //String dataFimAluguel = dateFormat.format(dataFim);
        
        String dataIniAluguel = dataInicio;
        String dataFimAluguel = dataFim;
        
        Contrato_Aluguel contrato = new Contrato_Aluguel();
        
        String descricao = ""
                + "Contrato de Aluguel de Imóvel\n"
                + "Por este instrumento particular, as partes qualificadas na Cláusula 1ª têm entre si justa e acertada a presente relação contratual por intermédio do Corretor "+ corretor.getNomeCompleto() +", registrado com o CRECI: "+corretor.getCreci()+" .\n"
                + "CLÁUSULA 1ª - QUALIFICAÇÃO DAS PARTES\n"
                + "PROPRIETARIO\n"
                + "Nome Completo: "+proprietario.getNomeCompleto() + "\n"
                + "CPF: " + proprietario.getCpf() + "\n"
                + "\n"
                + "LOCATARIO\n"
                + "Nome Completo: " +cliente_locatario.getNomeCompleto() + "\n"
                + "CPF: " + cliente_locatario.getCpf() +"\n"
                + "As partes acima mencionadas, pelo presente instrumento particular, ajustam a locação de um imóvel residencial, de acordo com as cláusulas que seguem:\n"
                + "\n"
                + "CLÁUSULA 2ª - O objeto deste contrato de locação é o imóvel residencial, situado à:\n"
                +  endereco.toString()+ "\n"
                + "\n"
                + "CLÁUSULA 3ª - O LOCATÁRIO declara, após vistoria realizada no imóvel, que este encontra-se em condições adequadas para o uso ao qual se destina.\n"
                + "\n"
                + "CLÁUSULA 4ª - O prazo da locação tem início em "+ dataIniAluguel +", momento de entrega das chaves do imóvel ao locador, com término em " + dataFimAluguel + ", independentemente de aviso, notificação ou interpelação judicial ou mesmo extrajudicial, no entanto, o contrato poderá ser prorrogado mediante termo aditivo, havendo interesse de ambas as partes\n. "
                + "O valor do aluguel fica acordado em R$: " + precoNegociado + "\n"
                + "CLÁUSULA 5ª - Das descrições adicionais do contrato relativos às condições de devolução do imovel, entre outros \n" + descricoesAdicionais
                + "\n"
                + "\n";
        
        contrato.setLocatario(cliente_locatario);
        contrato.setCorretor(corretor);
        contrato.setImovel(imovel);
        precoNegociado = precoNegociado.replace(',', '.');
        contrato.setValorAluguel(Float.parseFloat(precoNegociado));
        contrato.setDescricaoAluguel(descricao);
        contrato.setDataInicio(dataIniAluguel);
        contrato.setDataFim(dataFimAluguel);
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
