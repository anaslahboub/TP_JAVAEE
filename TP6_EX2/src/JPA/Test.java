package JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_commande");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();

		try {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		em.getTransaction().begin();
		
		Client anas = new Client("lahboub","anas","taroudant","0682582461");
		 em.persist(anas);
		Commande cmd1 = new Commande("01/10/2024", anas);
		Commande cmd2 = new Commande("01/11/2024", anas);
		Commande cmd3 = new Commande("01/12/2024", anas);
		 em.persist(cmd1);
		 em.persist(cmd2);
		 em.persist(cmd3);
		
		Utilisateur user1 = new Utilisateur("lahboub", "ayoub", "livreur");
		em.persist(user1);
		Facture fact1 = new Facture("01/10/2024", 1000, user1);
		Facture fact2 = new Facture("01/11/2024", 2000, user1);
		Facture fact3 = new Facture("01/12/2024", 3000, user1);
		em.persist(fact1);
		em.persist(fact2);
		em.persist(fact3);
		
		Article art1 = new Article("bonne", "rouge", "aa", 10);
		Article art2 = new Article("bonnne", "rouge", "bb", 20);
		Article art3 = new Article("bonnnne", "rouge", "cc", 30);
		em.persist(art1);
		em.persist(art2);
		em.persist(art3);
		
		Concerner_PK pk1 = new Concerner_PK(cmd1.getNum_commande(), art1.getCode_article(), fact1.getNum_facture());
		Concerner_PK pk2 = new Concerner_PK(cmd2.getNum_commande(), art2.getCode_article(), fact2.getNum_facture());
		Concerner_PK pk3 = new Concerner_PK(cmd3.getNum_commande(), art3.getCode_article(), fact3.getNum_facture());
		
		Concerner c1 = new Concerner(pk1, 100, cmd1, art1, fact1);
		Concerner c2 = new Concerner(pk2, 200, cmd2, art2, fact2);
		Concerner c3 = new Concerner(pk3, 300, cmd3, art3, fact3);
		em.persist(c1);
		em.persist(c2);
		em.persist(c3);
		em.getTransaction().commit();
		
		}catch(Exception e){
			 if (transaction.isActive()) {
			        transaction.rollback();
			    }
			    e.printStackTrace(); 
			System.out.println("----------------------------------------------------------------------");
			
		}
		finally {
			em.close();
			emf.close();
		}
	

		



	}

}
