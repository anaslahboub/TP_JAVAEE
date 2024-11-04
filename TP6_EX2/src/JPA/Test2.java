package JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_commande");
		EntityManager em = emf.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		try {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		    em.getTransaction().begin();
		    int codeAtributToDelete = 1;
	        Client client = em.find(Client.class, codeAtributToDelete);
	        if (client!=null) {
	        	System.out.println("le client est trouver correctement maintenat on va la suprimmer");
	        	em.remove(client);
			}
	        Commande cmd = em.find(Commande.class,codeAtributToDelete);
	        if (cmd!=null) {
	        	System.out.println("le commande est trouver correctement maintenant on va la suprimmer");
	        	em.remove(cmd);
			}
	        Article article = em.find(Article.class, codeAtributToDelete);
	        if (article != null) {
	        	System.out.println("le article est trouver correctement maintenant on va la suprimmer");
	            em.remove(article); 
	        }
	        Facture fact = em.find(Facture.class, codeAtributToDelete);
	        if (fact!=null) {
	        	System.out.println("le fact est trouver correctement maintenat on va la suprimmer");
	        	em.remove(fact);
			}
	        Utilisateur user = em.find(Utilisateur.class, codeAtributToDelete);
	        if (user!=null) {
	        	System.out.println("le user est trouver correctement maintenat on va la suprimmer");
	        	em.remove(user);
			}
	        
	        
	        em.getTransaction().commit();
	        
		} catch(Exception e){
			 if (transaction.isActive()) {
			        transaction.rollback();
			    }
			    e.printStackTrace(); 
			System.out.println("----------------------------------------------------------------------");
			
		} finally {
			em.close();
			emf.close();
		}
	}

}
