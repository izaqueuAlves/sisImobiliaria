package classesControle;

import classesEntidade.Endereco;

public class ControleEndereco {

    public Endereco endereco = new Endereco();

    public ControleEndereco() {
        endereco = new Endereco();
    }

    /**
     * @param cep
     * @param uf
     * @param bairro
     * @param complemento
     * @param logradouro
     * @param numero
     * @param cidade return void
     **/
    void Cadastrar(String cep, String uf, String bairro, String complemento, String logradouro, String numero, String cidade) {
        endereco = new Endereco();

        endereco.setCEP(cep);
        endereco.setUF(uf);
        endereco.setCidade(cidade);
        endereco.setBairro(bairro);
        endereco.setComplemento(complemento);
        endereco.setLogradouro(logradouro);
        endereco.setNumero(numero);

        try {
            endereco.Cadastrar(endereco);
        } catch (Error e) {
            e.printStackTrace();
        }
    }

    public boolean Cadastrar(Endereco endereco) {
        return endereco.Cadastrar(endereco);
    }
}
