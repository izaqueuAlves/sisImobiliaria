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

    
     void cadastrarComprador (String CPF, String nomeCompleto, String telefone, String email)
    {
        
        comprador= new Comprador();
        
        comprador.setCpf(CPF);
        comprador.setNomeCompleto(nomeCompleto);
        comprador.setTelefone(telefone);
        comprador.setEmail(email);       
        
        try {
            comprador.cadastrarComprador(comprador);
            //Mensagem de Comprador cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }

   void editarComprador(String novoCPF, String novoNomeCompleto, String novoTelefone, String novoEmail){
        
       comprador= new Comprador();
        
        comprador.setCpf(novoCPF);
        comprador.setNomeCompleto(novoNomeCompleto);
        comprador.setTelefone(novoTelefone);
        comprador.setEmail(novoEmail);       
//        System.out.println("Novo CPF: "+novoCPF);
//        System.out.println("Novo Nome: "+novoNomeCompleto);
//        System.out.println("Novo Telefone: "+novoTelefone);
//        System.out.println("Novo email: "+novoEmail);
        try {
            comprador.cadastrarComprador(comprador);
            //Mensagem de Comprador cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
   }
   
   void excluirComprador(){
        
       comprador = new Comprador();    
   }
 
}

