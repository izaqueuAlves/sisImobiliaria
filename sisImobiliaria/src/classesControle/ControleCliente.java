package classesControle;

import classesEntidade.Cliente;

/**
 *
 * @author Alline
 */
public class ControleCliente {

    public Cliente cliente = new Cliente();
   // public Comprador editarComprador = new Comprador();
    
    public ControleCliente()
    {
        cliente = new Cliente();
    }

    /***
     * 
     * @param CPF
     * @param nomeCompleto
     * @param telefone
     * @param email 
     */
    
    public void cadastrarCliente (String CPF, String nomeCompleto, String telefone, String email)
    {
        
        cliente = new Cliente();
        
        cliente.setCpf(CPF);
        cliente.setNomeCompleto(nomeCompleto);
        cliente.setTelefone(telefone);
        cliente.setEmail(email);       
      
       try {
            cliente.cadastrarCliente(cliente);
            //Mensagem de Adm cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }        
    }
      
    public boolean cadastrarCliente(Cliente cliente){        
        return cliente.cadastrarCliente(cliente);                
    }
    
    /**
     * 
     * @param novoCPF
     * @param novoNomeCompleto
     * @param novoTelefone
     * @param novoEmail 
     */
    
   public void editarCliente(String novoCPF, String novoNomeCompleto, String novoTelefone, String novoEmail){
        
       cliente = new Cliente();
        
        cliente.setCpf(novoCPF);
        cliente.setNomeCompleto(novoNomeCompleto);
        cliente.setTelefone(novoTelefone);
        cliente.setEmail(novoEmail); 
        try {
            cliente.editarCliente(cliente);            
        } catch (Error e) {
            e.printStackTrace();
        }
   }
   
   //FAZER 
   public void excluirCliente(){
        
       cliente = new Cliente();    
   }
 
}

