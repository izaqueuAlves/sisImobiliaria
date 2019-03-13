package classesControle;
import classesEntidade.Corretor;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Alline
 */
public class ControleCorretor {
    
    public Corretor corretor = new Corretor();
        
    public ControleCorretor(){  
        corretor = new Corretor();
    }
    
  /**
   * 
   * @param CRECI
   * @param CPF
   * @param senha
   * @param nomeCompleto
   * @param telefone
   * @param email 
   * return void
   */  
  public void cadastrarCorretor (String CRECI, String CPF, String senha, String nomeCompleto, String telefone, String email)
  {
      corretor = new Corretor();
      
      
      corretor.setCreci (CRECI);
      corretor.setCpf (CPF);
      corretor.setSenha (senha);
      corretor.setNomeCompleto (nomeCompleto);
      corretor.setTelefone (telefone);
      corretor.setEmail (email);
      
       
        final JFrame frame = new JFrame();
        
        if (corretor.cadastrarCorretor(corretor)) {
            //Corretor Cadastrado 
            System.out.print("Corretor Cadastrado Com sucesso");
            JOptionPane.showMessageDialog(frame.getContentPane() ,"cadastrado com sucesso.");
        } else {
            //Erro
            System.out.print("Erro ao cadastrar corretor!");
            JOptionPane.showMessageDialog(frame.getContentPane() ,"cadastrado com sucesso.");
        }
  }
  
  /***
   * 
   * @param novoCRECI
   * @param novoCPF
   * @param novaSenha
   * @param novoNomeCompleto
   * @param novoTelefone
   * @param novoEmail 
   */
  
  //DEVE EDITAR E N CADASTRAR, CONSERTAR
  public void editarCorretor (String novoCRECI, String novoCPF, String novaSenha, String novoNomeCompleto, String novoTelefone, String novoEmail)
  {
      corretor = new Corretor();
      
      
      corretor.setCreci (novoCRECI);
      corretor.setCpf (novoCPF);
      corretor.setSenha (novaSenha);
      corretor.setNomeCompleto (novoNomeCompleto);
      corretor.setTelefone (novoTelefone);
      corretor.setEmail (novoEmail);
      
       
        try {
            //corretor.cadastrarCorretor(corretor);
            //Mensagem de corretor cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
         
  }
  
  
   public void excluirCorretor(){  
        corretor = new Corretor();
    }  
}

