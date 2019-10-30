package ex12_ManyToMany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main12 {
    public static void main(String[] args) {
        CD cd1 = new CD();
        cd1.setTitle("CD1");

        CD cd2 = new CD();
        cd2.setTitle("CD2");

        List<CD> cds = new ArrayList<>();
        cds.add(cd1);
        cds.add(cd2);

        Artist artist1 = new Artist();
        artist1.setName("artist1");

        Artist artist2 = new Artist();
        artist2.setName("artist2");

        List<Artist> artists = new ArrayList<>();
        artists.add(artist1);
        artists.add(artist2);

        CD cdAdd = new CD();
        cdAdd.setTitle("CD13 Add");
        cdAdd.setCreatedByArtists(artists);

        Artist artistAdd = new Artist();
        artistAdd.setName("Artist Add");
        artistAdd.setAppearsOnCDs(cds);

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("chapter04");
        EntityManager entityManager = managerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        transaction.begin();

        entityManager.persist(artistAdd);
        entityManager.persist(cdAdd);

        transaction.commit();

        entityManager.close();
        managerFactory.close();
    }
}
