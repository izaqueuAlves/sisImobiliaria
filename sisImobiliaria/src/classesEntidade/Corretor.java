/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesEntidade;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Izaqueu
 */
@Entity
public class Corretor {
    @Id
    private String cpf;
    private String creci;
    private String senha;
    private String nomeCompleto;
    private String telefone;
    private String email;
    
}
