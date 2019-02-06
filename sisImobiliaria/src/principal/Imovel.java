
package principal;

import java.util.ArrayList;

/**
 *
 * 
 * @author welerson
 * 
 */
public class Imovel {
   private int id;
   private float area;
   private int numQuartos, numBanheiros, numSuites, vagasGaragem;
   private ArrayList<String> fotos;
   private String descricao;
   private float valorCompra;
   private float valorAluguel;
   private String CPF_proprietario;
   //private Situacao_Imovel situacao;

    // Funcoes contrutoras Imovel
   
    public Imovel(){
        
    }
    public Imovel(float area, int numQuartos, int numBanheiros, int numSuites, int vagasGaragem, ArrayList<String> fotos, String descricao, float valorCompra, float valorAluguel, String CPF_proprietario) {
        this.area = area;
        this.numQuartos = numQuartos;
        this.numBanheiros = numBanheiros;
        this.numSuites = numSuites;
        this.vagasGaragem = vagasGaragem;
        this.fotos = fotos;
        this.descricao = descricao;
        this.valorCompra = valorCompra;
        this.valorAluguel = valorAluguel;
        this.CPF_proprietario = CPF_proprietario;
    }
    /*
        Inicio Gets e Sets Gerados Automaticamente
    */
    public int getId() {
        return id;
    }

    public float getArea() {
        return area;
    }

    public int getNumQuartos() {
        return numQuartos;
    }

    public int getNumBanheiros() {
        return numBanheiros;
    }

    public int getNumSuites() {
        return numSuites;
    }

    public int getVagasGaragem() {
        return vagasGaragem;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValorCompra() {
        return valorCompra;
    }

    public float getValorAluguel() {
        return valorAluguel;
    }

    public String getCPF_proprietario() {
        return CPF_proprietario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setNumQuartos(int numQuartos) {
        this.numQuartos = numQuartos;
    }

    public void setNumBanheiros(int numBanheiros) {
        this.numBanheiros = numBanheiros;
    }

    public void setNumSuites(int numSuites) {
        this.numSuites = numSuites;
    }

    public void setVagasGaragem(int vagasGaragem) {
        this.vagasGaragem = vagasGaragem;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorCompra(float valorCompra) {
        this.valorCompra = valorCompra;
    }

    public void setValorAluguel(float valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public void setCPF_proprietario(String CPF_proprietario) {
        this.CPF_proprietario = CPF_proprietario;
    }
   /*
        Fim Gets e Sets Gerados Automaticamente
    */
    
   /*
        Inicio Funções Classe Imovel
    */ 
   
   
}
