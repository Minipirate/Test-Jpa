import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * 
 */

/**
 * @author Ness'ti
 *
 */
public class TestJpa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// ===================== TP01 =========================
		/*
		 * EntityManagerFactory factory =
		 * Persistence.createEntityManagerFactory("pu_essai"); EntityManager em =
		 * factory.createEntityManager();
		 * 
		 * Ville v = em.find(Ville.class, 18); System.out.println(v.getNom());
		 */
		// ====================================================

		// ===================== TP02 =========================
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = factory.createEntityManager();

		// Find simple pour extraire un livre en fonction de son ID
		Livre l1 = em.find(Livre.class, 3);
		System.out.println(l1.getId());

		// Affichage de la liste de tous les livres
		TypedQuery<Livre> query1 = em.createQuery("select l2 from Livre l2", Livre.class);

		List<Livre> listeLivres = query1.getResultList();
		for (int i = 0; i < listeLivres.size(); i++) {
			Livre l = listeLivres.get(i);
			System.out.println(l);
		}

		// ==================== TP03 ===========================
		Emprunt emprunt = em.find(Emprunt.class, 2);
		for (Livre livreEmprunt : emprunt.getLivres()) {
			System.out.println(livreEmprunt.getTitre());
			
		}
	}
}
