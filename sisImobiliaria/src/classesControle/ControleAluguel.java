package classesControle;

import classesEntidade.Contrato_Aluguel;
import classesEntidade.Corretor;
import classesEntidade.Endereco;
import classesEntidade.Imovel;
import classesEntidade.Cliente;
import classesEntidade.Situacao_Contrato;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ControleAluguel {

    /**
     * @param CPF_locatario
     * @param IdImovel
     * @param CRECI_corretor
     * @param descricoesAdicionais
     * @param precoNegociado \\O valor negociado do imovel pode ser diferente do
     * registrado no imovel e fica salvo em valorAluguel
     * @param dataInicio
     * @param dataFim
     **/
    public void Aluguel(String CPF_locatario, int IdImovel, String CRECI_corretor, String descricoesAdicionais, String precoNegociado, String dataInicio, String dataFim) {
        Imovel imovel = new Imovel();
        Endereco endereco = new Endereco();
        Cliente cliente_proprietario = new Cliente();
        Cliente cliente_locatario = new Cliente();
        Corretor corretor = new Corretor();

        imovel = imovel.GetPorId(IdImovel);

        if (imovel.getSituacao_Imovel() != 0 && imovel.getSituacao_Imovel() != 2) {
            System.out.println("erro, imóvel não disponível para aluguel!");
            //Colocar mensagem na tela
            return;
        }

        endereco = imovel.getEndereco();
        cliente_proprietario = imovel.getProprietario();
        cliente_locatario = cliente_locatario.BuscarLocatario(CPF_locatario);
        corretor = corretor.Buscar(CRECI_corretor);

        String dataIniAluguel = dataInicio;
        String dataFimAluguel = dataFim;

        Contrato_Aluguel contrato = new Contrato_Aluguel();

        String descricao = ""
                + "Contrato de Aluguel de Imóvel\n"
                + "Por este instrumento particular, as partes qualificadas na Cláusula 1ª têm entre si justa e acertada a presente relação contratual por intermédio do Corretor " + corretor.getNomeCompleto() + ", registrado com o CRECI: " + corretor.getCreci() + " .\n"
                + "CLÁUSULA 1ª - QUALIFICAÇÃO DAS PARTES\n"
                + "PROPRIETARIO\n"
                + "Nome Completo: " + cliente_proprietario.getNomeCompleto() + "\n"
                + "CPF: " + cliente_proprietario.getCpf() + "\n"
                + "\n"
                + "LOCATARIO\n"
                + "Nome Completo: " + cliente_locatario.getNomeCompleto() + "\n"
                + "CPF: " + cliente_locatario.getCpf() + "\n"
                + "As partes acima mencionadas, pelo presente instrumento particular, ajustam a locação de um imóvel residencial, de acordo com as cláusulas que seguem:\n"
                + "\n"
                + "CLÁUSULA 2ª - O objeto deste contrato de locação é o imóvel residencial, situado à:\n"
                + endereco.toString() + "\n"
                + "\n"
                + "CLÁUSULA 3ª - O LOCATÁRIO declara, após vistoria realizada no imóvel, que este encontra-se em condições adequadas para o uso ao qual se destina.\n"
                + "\n"
                + "CLÁUSULA 4ª - O prazo da locação tem início em " + dataIniAluguel + ", momento de entrega das chaves do imóvel ao locador, com término em " + dataFimAluguel + ", independentemente de aviso, notificação ou interpelação judicial ou mesmo extrajudicial, no entanto, o contrato poderá ser prorrogado mediante termo aditivo, havendo interesse de ambas as partes\n. "
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

        try {
            contrato.Abrir();
            // Mensagem Contrato aberto com sucesso
        } catch (Exception e) {
            e.printStackTrace();
            // Mensagem de erro ao abrir contrato
        }

    }
    
    /**
     *
     * @param id_contrato
     * @param descricoesAdicionais
     * @param precoNegociado
     * @param dataInicio
     * @param dataFim
     * @return true se editar contrato (salvar no banco) com sucesso, false caso
     * contratrio
     */
    public boolean AlterarEmAberto(int id_contrato, String descricoesAdicionais, String precoNegociado, String dataInicio, String dataFim) {
        Contrato_Aluguel contrato = new Contrato_Aluguel();

        contrato = contrato.Consultar(id_contrato);

        Imovel imovel = contrato.getImovel();
        Endereco endereco = contrato.getImovel().getEndereco();
        Cliente cliente_proprietario = contrato.getImovel().getProprietario();
        Cliente cliente_locatario = contrato.getLocatario();
        Corretor corretor = contrato.getCorretor();

        String dataIniAluguel = dataInicio;
        String dataFimAluguel = dataFim;

        String descricao = ""
                + "Por este instrumento particular, as partes qualificadas na Cláusula 1ª têm entre si justa e acertada a presente relação contratual por intermédio do Corretor " + corretor.getNomeCompleto() + ", registrado com o CRECI: " + corretor.getCreci() + " .\n"
                + "CLÁUSULA 1ª - QUALIFICAÇÃO DAS PARTES\n"
                + "PROPRIETARIO\n"
                + "Nome Completo: " + cliente_proprietario.getNomeCompleto() + "\n"
                + "CPF: " + cliente_proprietario.getCpf() + "\n"
                + "\n"
                + "LOCATARIO\n"
                + "Nome Completo: " + cliente_locatario.getNomeCompleto() + "\n"
                + "CPF: " + cliente_locatario.getCpf() + "\n"
                + "As partes acima mencionadas, pelo presente instrumento particular, ajustam a locação de um imóvel residencial, de acordo com as cláusulas que seguem:\n"
                + "\n"
                + "CLÁUSULA 2ª - O objeto deste contrato de locação é o imóvel residencial, situado à:\n"
                + endereco.toString() + "\n"
                + "\n"
                + "CLÁUSULA 3ª - O LOCATÁRIO declara, após vistoria realizada no imóvel, que este encontra-se em condições adequadas para o uso ao qual se destina.\n"
                + "\n"
                + "CLÁUSULA 4ª - O prazo da locação tem início em " + dataIniAluguel + ", momento de entrega das chaves do imóvel ao locador, com término em " + dataFimAluguel + ", independentemente de aviso, notificação ou interpelação judicial ou mesmo extrajudicial, no entanto, o contrato poderá ser prorrogado mediante termo aditivo, havendo interesse de ambas as partes\n. "
                + "O valor do aluguel fica acordado em R$: " + precoNegociado + "\n"
                + "CLÁUSULA 5ª - Das descrições adicionais do contrato relativos às condições de devolução do imovel, entre outros \n" + descricoesAdicionais
                + "\n"
                + "\n";

        precoNegociado = precoNegociado.replace(',', '.');
        contrato.setValorAluguel(Float.parseFloat(precoNegociado));
        contrato.setDescricaoAluguel(descricao);
        contrato.setDataInicio(dataIniAluguel);
        contrato.setDataFim(dataFimAluguel);

        try {
            contrato.AlterarEmAberto();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    /**
     * sem parametros
     * @return Lista de Contratos_Aluguel com os contratos em aberto
     **/
    public List<Contrato_Aluguel> BuscarEmAberto() {
        List<Contrato_Aluguel> contratosList, contratosAbertos = new ArrayList<Contrato_Aluguel>();
        Contrato_Aluguel contratos = new Contrato_Aluguel();

        contratosList = contratos.GetTodos();

        for (int i = 0; i < contratosList.size(); i += 1) {
            Contrato_Aluguel contrato = contratosList.get(i);
            if (contrato.getSituacao_contrato() == Situacao_Contrato.EM_ABERTO) {
                contratosAbertos.add(contrato);
            }
        }

        return contratosAbertos;
    }

    /**
     * @param id_contrato aluguel
     * @return true se fechar contrato (salvar no banco) com sucesso, false caso
     * contratrio
     */
    public boolean FecharEmAberto(int id_contrato) {
        Contrato_Aluguel contrato = new Contrato_Aluguel();

        contrato = contrato.Consultar(id_contrato);

        Imovel imovel = contrato.getImovel();
        imovel.setSituacao_Imovel(3);
        imovel.Editar(imovel);

        Date data = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataFechamento = dateFormat.format(data);
        contrato.setDataFechamento(dataFechamento);
        contrato.setSituacao_contrato(Situacao_Contrato.FECHADO);

        ArrayList<String> a = new ArrayList<String>();
        a.add(contrato.getDescricaoAluguel());
        Relatorios.gerarRelatorio(a, "Contrato Luguel de Imovel nº " + id_contrato);

        try {
            contrato.AlterarEmAberto();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
