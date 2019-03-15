package classesControle;

import classesEntidade.Comprador;

/**
 *
 * @author Alline
 */
public class ControleComprador {

    public Comprador comprador = new Comprador();
   // public Comprador editarComprador = new Comprador();
    
    public ControleComprador()
    {
        comprador = new Comprador();
    }

    /***
     * 
     * @param CPF
     * @param nomeCompleto
     * @param telefone
     * @param email 
     */
    
    public void cadastrarComprador (String CPF, String nomeCompleto, String telefone, String email)
    {
        
        comprador= new Comprador();
        
        comprador.setCpf(CPF);
        comprador.setNomeCompleto(nomeCompleto);
        comprador.setTelefone(telefone);
        comprador.setEmail(email);       
      
       try {
            comprador.cadastrarComprador(comprador);
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }        
    }
      
    public boolean cadastrarCorretor(Comprador comprador){        
        return comprador.cadastrarComprador(comprador);                
    }
    
    /**
     * 
     * @param novoCPF
     * @param novoNomeCompleto
     * @param novoTelefone
     * @param novoEmail 
     */
    
   public void editarComprador(String novoCPF, String novoNomeCompleto, String novoTelefone, String novoEmail){
        
       comprador= new Comprador();
        
        comprador.setCpf(novoCPF);
        comprador.setNomeCompleto(novoNomeCompleto);
        comprador.setTelefone(novoTelefone);
        comprador.setEmail(novoEmail); 
        try {
            comprador.editarComprador(comprador);            
        } catch (Error e) {
            e.printStackTrace();
        }
   }
   
   //FAZER 
   public void excluirComprador(){
        
       comprador = new Comprador();    
   }
 
}

