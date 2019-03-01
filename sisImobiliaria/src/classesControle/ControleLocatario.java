package classesControle;
import classesEntidade.Locatario;
import classesEntidade.Tipo_Imovel;

/**
 *
 * @author Alline
 */

public class ControleLocatario {
    public Locatario locatario = new Locatario();
        
    public ControleLocatario() {
     locatario = new Locatario();
}
            
    void cadastrarLocatario (String CPF, String nomeCompleto, String email, Tipo_Imovel tipo_imovel)
    {
        
         locatario = new Locatario();
        
        locatario.setCpf(CPF);
        locatario.setNomeCompleto(nomeCompleto);
        locatario.setEmail(email);
        locatario.setTipo_Imovel(tipo_imovel);
        
        
        try {
            locatario.cadastrarLocatario(locatario);
            //Mensagem de Locatario cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }
    void editarLocatario (String novoCPF, String novoNomeCompleto, String novoEmail, Tipo_Imovel novoTipo_imovel)
    {
        
         locatario = new Locatario();
        
        locatario.setCpf(novoCPF);
        locatario.setNomeCompleto(novoNomeCompleto); 
        locatario.setEmail(novoEmail);
        locatario.setTipo_Imovel(novoTipo_imovel);
        
        
        try {
            locatario.cadastrarLocatario(locatario);
            //Mensagem de Locatario cadastrado com sucesso!
        } catch (Error e) {
            e.printStackTrace();
            //Mandar mensagem de erro para a tela
        }
    }
       void excluirLocatario() {
     locatario = new Locatario();
}
}
        
