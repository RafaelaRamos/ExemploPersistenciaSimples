/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.edu.br.Livro;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Cliente
 */
public class PersistirEmSGBD implements LivroIF//
{

    private static EntityManager em = Persistence
            .createEntityManagerFactory("DAC")
            .createEntityManager();

    @Override
    public void salvar(Livro livro) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(livro);
        transaction.commit();
    }

}
