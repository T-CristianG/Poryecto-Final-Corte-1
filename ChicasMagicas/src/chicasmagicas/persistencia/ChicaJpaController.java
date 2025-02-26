package chicasmagicas.persistencia;

import chicasmagicas.logica.Chica;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

    List<Chica> findChicaEntitis() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

