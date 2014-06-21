/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restjpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;
import restjpa.dao.VagaJpaController;

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
       Vaga v = new Vaga();
       
       
       VagaJpaController dao = new VagaJpaController(emf);
       dao.create(v);
       
       
    }
    
}
