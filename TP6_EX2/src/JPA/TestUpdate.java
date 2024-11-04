package JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdate {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestion_commande");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        
        try {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            transaction.begin();
            
            int codeAtributToUpdate = 1; 
            Client client = em.find(Client.class, codeAtributToUpdate);
            if (client != null) {
                client.setNom_client("Lahbouuuuub");
                client.setPrenom_client("anaaaaaaaaaaaaaaaaas");
                client.setAdresse_client("Elhoumer");
                System.out.println("Client mis à jour : " + client);
            }
            Commande commande = em.find(Commande.class, codeAtributToUpdate);
            if (commande != null) {
                commande.setDate_commande("02/10/2024");
                commande.setClient(client);
                System.out.println("Commande mise à jour : " + commande);
            }
            Article article = em.find(Article.class, codeAtributToUpdate);
            if (article != null) {
                article.setDescription_arictle("nest pas beauu");
                article.setPu_article("50");
                System.out.println("Article mis à jour : " + article);
            }
            Facture facture = em.find(Facture.class, codeAtributToUpdate);
            if (facture != null) {
                facture.setMontant_facture(5000);
                facture.setDate_facture("02/10/2024");
                System.out.println("Facture mise à jour : " + facture);
            }
            Utilisateur utilisateur = em.find(Utilisateur.class, codeAtributToUpdate);
            if (utilisateur != null) {
                utilisateur.setNom_Utilisateur("ayouuub");
                utilisateur.setFonaction_Utilisateur("chef project");
                System.out.println("Utilisateur mis à jour : " + utilisateur);
            }

            transaction.commit();
            System.out.println("Mises à jour effectuées avec succès !");
            
        } catch(Exception e) {
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
