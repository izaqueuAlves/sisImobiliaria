package Teste;

import classesControle.ControleAdm;
import classesControle.ControleCliente;
import classesControle.ControleEndereco;
import classesEntidade.Adm;
import classesEntidade.Cliente;
import classesEntidade.Endereco;
import classesEntidade.Imovel;


public class Classe_Teste {

    public static void main(String args[]) {
        // Teste_Cadastrar_Adm() OK
        // Teste_Cadastrar_Cliente() OK
        Teste_Cadastrar_Endereco();
    }
    
    public static void Teste_Cadastrar_Adm() {
        Adm adm = new Adm();
        adm.setLogin("eike");
        adm.setSenha("123");
        adm.setNomeCompleto("EikE ADM");
        adm.setTelefone("0799999794827");
        adm.setEmail("eike.sousa@hotmail.com");
        
        ControleAdm ctrAdm = new ControleAdm();
        ctrAdm.Cadastrar(adm);
    }
    
    public static void Teste_Cadastrar_Cliente() {
        Cliente cliente = new Cliente();
        cliente.setCpf("000");
        cliente.setNomeCompleto("EikE Proprietario");
        cliente.setTelefone("0799999794827");
        cliente.setEmail("eike.sousa@hotmail.com");
        cliente.setTipoCliente('p');
        
        ControleCliente ctrCliente = new ControleCliente();
        ctrCliente.Cadastrar(cliente);
    }
    
    public static void Teste_Cadastrar_Endereco() {
        Endereco endereco = new Endereco();
        endereco.setCEP("049.048-010");
        endereco.setUF("SE");
        endereco.setCidade("Aracaju");
        endereco.setBairro("SE");
        endereco.setLogradouro("Av. Adelia Franco");
        endereco.setNumero("2850");
        endereco.setComplemento("BL I AP 102");
        
        ControleEndereco ctrEndereco = new ControleEndereco();
        ctrEndereco.Cadastrar(endereco);
    }
    
    public static void Teste_Cadastrar_Imovel() {
        Imovel imovel = new Imovel();
        imovel.setArea(10);
        imovel.setNumQuartos(2);
        imovel.setNumBanheiros(2);
        imovel.setNumSuites(1);
        imovel.setVagasGaragem(1);
        imovel.setDescricao("Proximo do BK");
        imovel.setSituacao_Imovel(2);
        imovel.setValorCompra(100000);
        imovel.setValorAluguel(1000);
        
        Cliente cliente = new Cliente();
        cliente.setCpf("000");
        cliente.setNomeCompleto("EikE Proprietario");
        cliente.setTelefone("0799999794827");
        cliente.setEmail("eike.sousa@hotmail.com");
        cliente.setTipoCliente('p');
        
        Adm adm = new Adm();
        adm.setLogin("eike");
        adm.setSenha("123");
        adm.setNomeCompleto("EikE ADM");
        adm.setTelefone("0799999794827");
        adm.setEmail("eike.sousa@hotmail.com");
        
        
    }
}
