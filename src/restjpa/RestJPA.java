/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restjpa;

import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import restjpa.dao.VagaJpaController;
import restjpa.entidades.Contato;
import restjpa.entidades.Vaga;

/**
 *
 * @author Michelet
 */
public class RestJPA {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("RestJPAPU");
       VagaJpaController dao = new VagaJpaController(emf);
       Contato c = new Contato();
       Vaga v = new Vaga();
       v.setContato(c);
       c.setId((long)5);
       c.setEmail("mddsds@gasd.com");
       c.setNome("mich");
       c.setTelefone("2323233");
       v.setAtivo(true);
       v.setBairro("Rio pequeno");
       v.setCusto("333");
       v.setDataCadastro(Calendar.getInstance());
       dao.create(v);
       
       System.out.println(dao.getVagaCount());
       
    }
    
}
