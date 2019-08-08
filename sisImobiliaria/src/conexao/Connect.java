package conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Connect {

    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("meuPU");

    // retorna a conexao
    public EntityManager getConexao() {
        return emf.createEntityManager();
    }
}
