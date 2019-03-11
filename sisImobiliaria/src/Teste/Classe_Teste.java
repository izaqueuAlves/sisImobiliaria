package Teste;

import classesControle.ControleImovel;
import classesEntidade.Imovel;
import classesEntidade.Endereco;
import classesEntidade.Proprietario;
import classesEntidade.Situacao_Imovel;
import classesEntidade.Tipo_Imovel;
import classesEntidade.Adm;
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
    
    public static Proprietario proprietarioGenerico(){
        Proprietario p = new Proprietario("100.100.100-08","Adalacio Santos",
        "99999-0008","prop8@hotmail.com");
        return p;
    }
    
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
        im.setSituacao_Imovel(Situacao_Imovel.VENDIDO);
        im.setTipo_imovel(abc());
        im.setVagasGaragem(1);
        im.setValorAluguel(0);
        im.setValorCompra(20000);        
        return im;
    }//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="IMPRIMIR ENTIDADES">
    public static void imprimeProprietario(Proprietario p){
        System.out.println(p.getCpf());
        System.out.println(p.getEmail());
        System.out.println(p.getNomeCompleto());
        System.out.println(p.getTelefone());
        //System.out.println();
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
        //System.out.println();
    }
    
    public static void imprimeTipo(Tipo_Imovel ti){
        System.out.println(ti.getIdTipoImovel());
        System.out.println(ti.getNome());
        System.out.println(ti.isEmCondominio());
        //System.out.println();
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="TESTA PROPRIETARIO">
    public static void testaCadastroProprietario(){
        Proprietario xz = proprietarioGenerico();
        xz.cadastrarProprietario(xz);
    }
    
    public static void testaEditarProprietario(){
        Proprietario xz = new Proprietario();
        xz.editarProprietario(xz);
    }
    
    public static void testaBuscarProprietario(){
        Proprietario xz = new Proprietario();
        xz = xz.buscarProprietario("100.100.100-02");
        imprimeProprietario(xz);
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
        en = en.buscarImovel(23);
        return en;
    }
        
    public static void testaCadastroImovel(){
        Imovel im = imovelGenerico();
        im.cadastrarImovel(im);
    }
    
    public static void testaEditarImovel(){
        Imovel im = imovelGenerico();
        im.editarImovel(im);
    }
    
    public static void testaRemoverImovel(){
        Imovel im = new Imovel();
        im = im.getImovelById(27);
        im.removerImovel(im.getId());
    }
    
    public static void testaGetImovelById(){
        Imovel im = new Imovel();
        im = im.getImovelById(2);
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
    
    public static void main(String[] args){
        /*TO TEST: 
        testaEditarProprietario();
        testaEditarImovel();
        
        ERROR:
        testaGetTodosImoveis(); nenhum imovel encontrado
        Nenhum Imóvel foi encontrado!: java.lang.ArrayIndexOutOfBoundsException: 5
        Exception in thread "main" java.lang.NullPointerException
        
        testaGetImovelById(); não funciona se id igual a 1 ou 2
        Nenhum Imóvel foi encontrado!: java.lang.ArrayIndexOutOfBoundsException: 5
        Exception in thread "main" java.lang.NullPointerException
        
        TO FIX:
        testaGetImoveisAluguel();
        testaGetImoveisVenda();
        
        Situacao_Imovel diferente dos dados no DB
        Ex: em Situacao_Imovel.java, DISPONIVEL_ALUGUEL = 0 ao invés de 1 como no DB
        
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
    }
}