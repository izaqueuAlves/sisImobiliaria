package Teste;

import classesControle.ControleAluguel;
import classesControle.ControleCliente;
import classesControle.ControleConsultarContratoAluguel;
import classesControle.ControleConsultarContratoVenda;
import classesControle.ControleCorretor;
import classesControle.ControleVenda;
import classesEntidade.Contrato_Venda;
import classesEntidade.Contrato_Aluguel;
import classesEntidade.Corretor;
import classesEntidade.Cliente;
import classesEntidade.Imovel;
import classesEntidade.Endereco;
import classesEntidade.Situacao_Imovel;
import classesEntidade.Tipo_Imovel;
import classesEntidade.Adm;
import classesEntidade.Situacao_Contrato;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Thome
 */
public class Classe_Teste 
{
    public static void testaCadastroAdm(){
        Adm xz = new Adm("Belarmino_Adm","batata012","Belarmino Ferreira",
            "99999-1003","adm3@hotmail.com");
        xz.cadastrarAdm(xz);
    }
    
    //<editor-fold defaultstate="collapsed" desc="ENTIDADES GENERICAS">
    public static Endereco enderecoGenerico(){
        Endereco en = new Endereco("99000-022","AC","fimdomundo","centro",
        "cafundedosjudas","0",null);
        return en;
    }
    
    public static Tipo_Imovel tipoImovelGenerico(){
        Tipo_Imovel ti = new Tipo_Imovel("tipoteste",false);
        return ti;
    }
    
  
    
    public static Corretor corretorGenerico(){
        Corretor c = new Corretor("200.200.200-06",null,"caneca","Camarao Prado",
        "99999-2006","corret6@hotmail.com");
        return c;
    }
    
    public static Cliente ClienteGenerico(){
        Cliente comp = new Cliente("300.300.300-05","Daiane Costa",
        "99999-3005","comprad5@hotmail.com");
        return comp;
    }
    
    
      /* 
    public static Imovel imovelGenerico(){
        Imovel im = new Imovel();
        im.setArea(25);
        im.setDescricao("imovel teste");
        im.setEndereco(testaBuscarImovel());
        im.setFotos(null);
        im.setNumBanheiros(1);
        im.setNumQuartos(1);
        im.setNumSuites(1);        
        im.setProprietario(proprietarioGenerico());
        im.setSituacao_Imovel(4);
        im.setTipo_imovel(abc());
        im.setVagasGaragem(1);
        im.setValorAluguel(0);
        im.setValorCompra(20000);        
        return im;
    }
    
    public static Contrato_Venda contratoVendaGenerico(){
        Contrato_Venda cv = new Contrato_Venda(200000,"venda teste","00/00/0000");
        Imovel im = new Imovel();
        cv.setSituacao_contrato(Situacao_Contrato.EM_ABERTO);
        cv.setCliente(testaBuscarCliente());
        cv.setCorretor(testaBuscarCorretor());
        cv.setImovel(im.getImovelById(28));
        return cv;
    }
    
    public static Contrato_Aluguel contratoAluguelGenerico(){
        Contrato_Aluguel ca = new Contrato_Aluguel(300,"aluguel teste","00/00/0000",
        "11/11/1111","22/22/2222");
        Imovel im = new Imovel();
        ca.setSituacao_contrato(Situacao_Contrato.EM_ABERTO);
        ca.setLocatario(testaBuscarLocatario());
        ca.setCorretor(testaBuscarCorretor());
        ca.setImovel(im.getImovelById(28));
        return ca;
    }

    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="IMPRIMIR ENTIDADES">
    public static void imprimeProprietario(Proprietario p){
        System.out.println(p.getCpf());
        System.out.println(p.getEmail());
        System.out.println(p.getNomeCompleto());
        System.out.println(p.getTelefone());
    }
    
    public static void imprimeImovel(Imovel im){
        System.out.println(im.getArea());
        System.out.println(im.getDescricao());
        System.out.println(im.getEndereco());
        System.out.println(im.getFotos());
        System.out.println(im.getId());
        System.out.println(im.getNumBanheiros());
        System.out.println(im.getNumQuartos());
        System.out.println(im.getNumSuites());
        imprimeProprietario(im.getProprietario());
        System.out.println(im.getSituacao_Imovel());
        imprimeTipo(im.getTipo_imovel());
        System.out.println(im.getVagasGaragem());
    }
    
    public static void imprimeTipo(Tipo_Imovel ti){
        System.out.println(ti.getIdTipoImovel());
        System.out.println(ti.getNome());
        System.out.println(ti.isEmCondominio());
    }
    
    public static void imprimeCorretor(Corretor c){
        System.out.println(c.getCpf());
        System.out.println(c.getCreci());
        System.out.println(c.getEmail());
        System.out.println(c.getNomeCompleto());
        System.out.println(c.getSenha());
        System.out.println(c.getTelefone());
    }
    
    public static void imprimeCliente(Cliente comp){
        System.out.println(comp.getCpf());
        System.out.println(comp.getEmail());
        System.out.println(comp.getNomeCompleto());
        System.out.println(comp.getTelefone());
    }
    
    public static void imprimeLocatario(Locatario lo){
        System.out.println(lo.getCpf());
        System.out.println(lo.getEmail());
        System.out.println(lo.getNomeCompleto());
        System.out.println(lo.getTelefone());
    }
    
    public static void imprimeContratoVenda(Contrato_Venda cv){
        System.out.println(cv.getValorVenda());
        System.out.println(cv.getDescricaoVenda());
        System.out.println(cv.getDataFechamento());
        System.out.println(cv.getSituacao_contrato().getValor());
    }
    
    public static void imprimeContratoAluguel(Contrato_Aluguel ca){
        System.out.println(ca.getValorAluguel());
        System.out.println(ca.getDescricaoAluguel());
        System.out.println(ca.getDataFechamento());
        System.out.println(ca.getDataInicio());
        System.out.println(ca.getDataFim());
        //System.out.println(ca.getSituacao_contrato().getValor());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA PROPRIETARIO">
    public static void testaCadastroProprietario(){
        Proprietario xz = proprietarioGenerico();
        xz.cadastrarProprietario(xz);
    }
    
    public static void testaEditarProprietario(Proprietario p){
        p.editarProprietario(p);
    }
    
    public static Proprietario testaBuscarProprietario(){
        Proprietario xz = new Proprietario();
        xz = xz.buscarProprietario("100.100.100-08");
        return xz;
    }
    
    public static void testaGetTodosProprietarios(){
        Proprietario xz = new Proprietario();
        List<Proprietario> props = xz.getTodosProprietarios();
        for (Proprietario p : props) {
            imprimeProprietario(p);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA IMOVEL">
    public static Endereco testaBuscarImovel(){
        Endereco en = new Endereco();
        en = en.buscarEndereco(28);
        return en;
    }
        
    public static void testaCadastroImovel(){
        Imovel im = imovelGenerico();
        im.cadastrarImovel(im);
    }
    
    public static void testaEditarImovel(Imovel im){
        im.editarImovel(im);
    }
    
    public static void testaRemoverImovel(){
        Imovel im = new Imovel();
        im = im.getImovelById(27);
        im.removerImovel(im.getId());
    }
    
    public static void testaGetImovelById(){
        Imovel im = new Imovel();
        im = im.getImovelById(1);
        imprimeImovel(im);
    }
    
    public static void testaGetImoveisAluguel(){
        Imovel im = new Imovel();
        List<Imovel> imoveis = im.getImoveisAluguel();
        for (Imovel imo : imoveis){
            imprimeImovel(imo);
        }
    }
    
    public static void testaGetImoveisVenda(){
        Imovel im = new Imovel();
        List<Imovel> imoveis = im.getImoveisVenda();
        for (Imovel imo : imoveis){
            imprimeImovel(imo);
        }
    }
    
    public static void testaGetTodosImoveis(){
        Imovel im = new Imovel();
        List<Imovel> imoveis = im.getTodosImoveis();
        for (Imovel imo : imoveis){
            imprimeImovel(imo);
        }
    }//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA TIPO_IMOVEL">
    public static void testaCadastraTipo(){
        Tipo_Imovel ti = new Tipo_Imovel();
        ti.CadastrarTipo("tipoteste", false);
    }
    
    public static void testaBuscarTipo(){
        Tipo_Imovel ti = new Tipo_Imovel();
        List<Tipo_Imovel> tiList = ti.buscarTipo();
        for (Tipo_Imovel t_i : tiList) {
            imprimeTipo(t_i);
        }
    }//</editor-fold>
    
    public static Tipo_Imovel abc(){
        Tipo_Imovel ti = new Tipo_Imovel();
        List<Tipo_Imovel> tiList = ti.buscarTipo();
        Tipo_Imovel a = tiList.get(7);
        return a;
    }
    
    //<editor-fold defaultstate="collapsed" desc="TESTA CORRETOR">
    public static Corretor testaBuscarCorretor(){
        Corretor c = new Corretor();
        c = c.buscarCorretor("200.200.200-05");
        return c;
    }
    
    public static void testaCadastrarCorretor(){
        Corretor c = corretorGenerico();
        c.cadastrarCorretor(c);
    }
    
    public static void testaEditarCorretor(Corretor c){
        c.editarCorretor(c);
    }
    
    public static void testaGetTodosCorretores(){
        Corretor c = new Corretor();
        List<Corretor> corlist = c.getTodosCorretores();
        for (Corretor co : corlist) {
            imprimeCorretor(co);
        }
    }
    
    public static void testaExcluirCorretor(){
        Corretor c = new Corretor();
        c.excluirCorretor("200.200.200-06");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA COMPRADOR">
    public static void testaCadastrarComprador(){
        Cliente comp = clienteGenerico();
        comp.cadastrarCliente(comp);
    }
    
    public static void testaEditarComprador(Cliente comp){
        comp.editarCliente(comp);
    }
    
    public static Cliente testaBuscarComprador(){
        Cliente comp = new Cliente();
        comp = comp.buscarClientes("300.300.300-05");
        return comp;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA LOCATARIO">
    public static Locatario testaBuscarLocatario(){
        Locatario lo = new Locatario();
        lo = lo.buscarLocatario("400.400.400-03");
        return lo;
    }
    
    public static void testaCadastrarLocatario(){
        Locatario lo = locatarioGenerico();
        lo.cadastrarLocatario(lo);
    }
    
    public static void testaEditarLocatario(Locatario lo){
        lo.editarLocatario(lo);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA CONTRATO_VENDA">
    public static Contrato_Venda testaAbrirContratoVenda(){
        Contrato_Venda cv = contratoVendaGenerico();
        cv.abrirContrato();
        return cv;
    }
    
    public static void testaFecharContratoVenda(Contrato_Venda cv){
        cv.fecharContrato();
    }
    
    public static void testaAlterarContratoVendaAberto(Contrato_Venda cv){
        cv.alterarContratoEmAberto();
    }
    
    public static void testaCancelarContratoVendaAberto(Contrato_Venda cv){
        cv.cancelarContratoEmAberto();
    }
    
    public static void testaGetTodosContratos(){
        Contrato_Venda cv = new Contrato_Venda();
        List<Contrato_Venda> cvlist = cv.getTodosContratos();
        for (Contrato_Venda c : cvlist){
            imprimeContratoVenda(c);
        }
    }
    
    public static Contrato_Venda testaConsultarContratoVenda(){
        Contrato_Venda cv = new Contrato_Venda();
        cv = cv.consultarContrato(26);
        return cv;
    }
    
    public static void testaNegociantes(Contrato_Venda cv){
        List<Object> negociantes = cv.negociantes(cv);
        for (Object obj : negociantes){
            if (obj instanceof Comprador)
                imprimeComprador((Comprador) obj);
            if (obj instanceof Corretor)
                imprimeCorretor((Corretor) obj);
        }
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA CONTRATO ALUGUEL">
    public static Contrato_Aluguel testaAbrirContratoAluguel(){
        Contrato_Aluguel ca = contratoAluguelGenerico();
        ca.abrirContrato();
        return ca;
    }
    
    public static void testaFecharContratoAluguel(Contrato_Aluguel ca){
        ca.fecharContrato();
    }
    
    public static void testaAlterarContratoEmAberto(Contrato_Aluguel ca){
        ca.alterarContratoEmAberto();
    }
    
    public static void testaCancelarContratoEmAberto(Contrato_Aluguel ca){
        ca.cancelarContratoEmAberto();
    }
    
    public static void testaGetContratosAluguel(){
        Contrato_Aluguel ca = new Contrato_Aluguel();
        List<Contrato_Aluguel> calist = ca.getContratosAluguel();
        for (Contrato_Aluguel c : calist){
            imprimeContratoAluguel(c);
        }
    }
    
    public static void testaGetContratosVigentes(){
        Contrato_Aluguel ca = new Contrato_Aluguel();
        List<Contrato_Aluguel> calist = ca.getContratosVigentes();
        for (Contrato_Aluguel c : calist){
            imprimeContratoAluguel(c);
        }
    }
    
    public static Contrato_Aluguel testaConsultarContratoAluguel(){
        Contrato_Aluguel ca = new Contrato_Aluguel();
        ca = ca.consultarContrato(16);
        return ca;
    }
    //</editor-fold>
    
    public static void main(String[] args){
        
        /*        
        ERRO:
        testaGetTodosContratos();
        Nenhum contrato de venda encontrado!: java.lang.ArrayIndexOutOfBoundsException: 5
        Exception in thread "main" java.lang.NullPointerException
                at Teste.Classe_Teste.testaGetTodosContratos(Classe_Teste.java:358)
                at Teste.Classe_Teste.main(Classe_Teste.java:499)
        <= erro apesar de existirem 6 contratos de venda cadastrados        
        ========================================================================
        
        testaCadastrarCorretor(); <=funciona
        testaCadastrarProprietario(); <=funciona
        testaCadastroImovel(); <=funciona, se nao funcionar altere os IDs
        das linhas 92 e 202 pra ficarem corretos
        
        ------------------------------------------------------------------------
        testaCadastrarComprador(); <=funciona                
        Contrato_Venda cv = testaConsultarContratoVenda(); <= funciona se rodar
        as linhas acima
        testaCancelarContratoVendaAberto(cv); <== Não aconteceu nada ao rodar,
        o contrato permaneceu aberto, a linha inalterada
        testaFecharContratoVenda(cv); <== Também não aconceceu nada ao rodar,
        contrato continua inalterado, e em aberto
        ------------------------------------------------------------------------
        testaCadastrarLocatario(); <= funciona
        Contrato_Aluguel ca = testaAbrirContratoAluguel(); <= funciona se rodar
        as linhas acima
        testaCancelarContratoEmAberto(ca); <== Não aconteceu nada ao rodar,
        o contrato permaneceu aberto, a linha inalterada
        
        NOTEWORTHY:
        testaCadastroImovel(); necessita endereco e tipo_imovel já cadastrados
        necessário usar testaCadastraTipo(), 
        e manualmente cadastrar o endereco generico no postgre,
        para utilizar testaCadastroImovel() corretamente
        
        abc() é uma função auxiliar para pegar o tipo_imovel já cadastrado,
        não funciona sem antes usar testaCadastraTipo()
        
        imovelGenerico() necessita dos endereços e tipo_imovel já cadastrados,
        devido a testaCadastroImovel()
        
        testaRemoverImovel() necessita do Id correto do imovel cadastrado
        com testaCadastroImovel();
        */
        
        //Working:
        //testaCadastroAdm();
        //System.out.println(enderecoGenerico());
        //imprimeProprietario(proprietarioGenerico());
        //imprimeTipo(tipoImovelGenerico());
        //imprimeImovel(imovelGenerico());
        //testaGetTodosProprietarios();
        //testaCadastroProprietario();
        //testaBuscarProprietario();
        //testaBuscarImovel();
        //testaCadastraTipo();        
        //testaBuscarTipo();
        //testaCadastroImovel();
        //testaRemoverImovel();
        //testaGetImovelById();
        //testaGetTodosImoveis();
        //testaGetImoveisAluguel();
        //testaGetImoveisVenda();
        //imprimeCorretor(testaBuscarCorretor());
        //testaCadastrarCorretor();
        //testaGetTodosCorretores();
        //testaExcluirCorretor();
        //testaCadastrarComprador();
        //imprimeComprador(testaBuscarComprador());
        //imprimeLocatario(testaBuscarLocatario());
        //testaCadastrarLocatario();
        //testaEditarProprietario();
        //testaEditarCorretor();
        //testaEditarComprador();
        //testaEditarLocatario();
        //testaEditarImovel();
        //Contrato_Venda cv = testaAbrirContratoVenda();
        //testaConsultarContratoVenda();
        //testaNegociantes(cv);
        //testaAlterarContratoVendaAberto(cv);
        //Contrato_Aluguel ca = testaAbrirContratoAluguel();
        //testaFecharContratoAluguel(ca);
        //testaAlterarContratoEmAberto(ca);
        //testaGetContratosAluguel();
        //testaGetContratosVigentes();

        //Contrato_Aluguel ca = testaConsultarContratoAluguel();
        //imprimeContratoAluguel(ca);
        
        // Testes Classes de Controle
        //System.out.print("Teste Controle Corretor"); testeCadastroCorretorControle();
        //System.out.print("Teste Controle Comprador");  testeCadastroCompradorControle();

        //#####Testes Classes de Controle######
        
        //System.out.print("Teste Controle Corretor"); testeCadastroCorretorControle();
        //System.out.print("Teste Controle Comprador");  testeCadastroCompradorControle();
        //System.out.print("Teste Controle Proprietario");  testeCadastroProprietarioControle();
        //System.out.print("Teste Controle Locatario");  testeCadastroLocatarioControle();
        
        //System.out.print("Teste Controle Venda");  testeAberturaContratoVendaControle();
        //System.out.println("\n\n");
        //testeBuscaContratoAberto();
        //System.out.print("Teste Controle Aluguel");  testeAberturaContratoAluguelControle();
        //testeBuscaContratoAberto(); */
       Adm adm = new Adm();
       /*
       adm.setEmail("adm@gmail.com");
       adm.setNomeCompleto("Izaqueu Alves");
       adm.setLogin("admteste");
       adm.setSenha("adm123");
       adm.setTelefone("3338848732");
       
       adm.cadastrarAdm(adm);
        
        System.out.print("Teste Controle fechamentoContrato");  
       
   */
    }    
    /*
    //<editor-fold defaultstate="collapsed" desc="TESTA CLASSES CONTROLE">    
    private static void testeCadastroCorretorControle() {
        ControleCorretor ctCorretor = new ControleCorretor();
        String CRECI = "1234-SE";
        String CPF = "200.200.200-12";
        String senha = "testeWel";
        String nomeCompleto = "Welerson Melo";
        String telefone = "98839-0895";
        String email = "welerson.a.melo@gmail.com";
        
      //  ctCorretor.cadastrarCorretor(CRECI, CPF, senha, nomeCompleto, telefone, email);
    }

    private static void testeCadastroCompradorControle() {
        ControleCliente ctComprador = new ControleCliente();
        String CPF = "200.200.200-24";
        String nomeCompleto = "Valmirnio Junior Jr";
        String telefone = "98839-0000";
        String email = "valmirnio@gmail.com";
        
        ctComprador.cadastrarComprador(CPF, nomeCompleto, telefone, email);
    }

    private static void testeCadastroProprietarioControle() {
        ControleProprietario ctProprietario = new ControleProprietario();
        String CPF = "200.200.200-20";
        String nomeCompleto = "Thôme Leite";
        String telefone = "99999-1111";
        String email = "thome@gmail.com";
        
        ctProprietario.cadastrarProprietario(CPF, nomeCompleto, telefone, email);
    }

    private static void testeCadastroLocatarioControle() {
        ControleLocatario ctLocatario = new ControleLocatario();
        String CPF = "200.200.200-11";
        String nomeCompleto = "Joao Jose Santos";
        String telefone = "91991-9999";
        String email = "jjs@gmail.com";
        
        ctLocatario.cadastrarLocatario(CPF, nomeCompleto, telefone, email);
    }

    private static void testeAberturaContratoVendaControle() {
        ControleVenda ctVenda = new ControleVenda();
        
        String CPF_comprador = "300.300.300-00";
        String CPF_corretor = "200.200.200-00";
        String condicoesPagamento = "O comprador irá pagar em 100 vezes de R$ 2000,00 mensais.";
        String precoNegociado = "1,50";
        int codImovel = 9;
        
        ctVenda.vendaImovel(CPF_comprador, codImovel, CPF_corretor, condicoesPagamento, precoNegociado);

    }

    private static void testeBuscaContratoAberto() {
        ControleConsultarContratoAluguel ctCCA = new ControleConsultarContratoAluguel();
        
        List<Contrato_Aluguel> contratosAbertos;
                
        contratosAbertos = ctCCA.buscarContratosEmAberto();
        
        for (int i = 0; i < contratosAbertos.size(); i++) {
            Contrato_Aluguel cv = contratosAbertos.get(i);
            
            System.out.println("Contrato de número:" +cv.getIdContrato()+"\n\nNo que segue:\n"+cv.getDescricaoAluguel());
        }
    }

    private static void testeAberturaContratoAluguelControle() {
        
        ControleAluguel ctAluguel = new ControleAluguel();
        
        String CPF_locatario = "400.400.400-00";
        String CPF_corretor = "200.200.200-00";
        String descricoesAdicionais = "O comprador irá pagar a cada dia 15 de cada mês o valor acordado. Ao final do período total, o locatario deve devolver a casa pintada na cor Branca, que é a cor atual, e deve devolver com todos os 21322 telhaados inteiros.";
        String precoNegociado = "11,50";
        int codImovel = 3;
        
        String dataInicio = "05/02/2019";
        String dataFim = "05/02/2020";
        
        ctAluguel.aluguelImovel(CPF_locatario, codImovel, CPF_corretor, descricoesAdicionais, precoNegociado, dataInicio, dataFim);
    }

    private static void testeFechamentoContratoVendaControle() {
        ControleConsultarContratoVenda ctCCV = new ControleConsultarContratoVenda();
        
        ctCCV.fecharContratoEmAberto(6);
    }

    private static void testeFechamentoContratoAluguelControle() {
        ControleConsultarContratoAluguel ctCCA = new ControleConsultarContratoAluguel();
        
        ctCCA.fecharContratoEmAberto(4);
    }
    //</editor-fold>
    
} */