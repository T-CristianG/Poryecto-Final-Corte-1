package chicasmagicas.persistencia;

import chicasmagicas.logica.Chica;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class ChicaJpaController implements Serializable {
    private EntityManagerFactory emf = null;

    public ChicaJpaController() {
        this.emf = Persistence.createEntityManagerFactory("ChicasMagicasPU");
    }
   

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Chica chica) {
        EntityManager em = getEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(chica);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
    public List<Chica> findChicaEntitis() {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Chica> query = em.createQuery("SELECT c FROM Chica c", Chica.class);
            return query.getResultList();
        } finally {
            em.close();
        }
}

}

