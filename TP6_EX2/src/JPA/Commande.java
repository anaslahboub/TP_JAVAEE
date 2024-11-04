package JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Commande")
public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_commande")
	private int num_commande;
	@Column(name="date_commande")
	private String date_commande;
	
	@ManyToOne
	@JoinColumn(name="num_client" , referencedColumnName = "num_client")
	private Client client;
	
	public Commande() {
    }

	
	public Commande(String date_commande, Client client) {
		super();
		this.date_commande = date_commande;
		this.client = client;
	}


	public Client getCilent() {
		return client;
	}


	public void setClient(Client cilent) {
		this.client = cilent;
	}


	public int getNum_commande() {
		return num_commande;
	}
	public void setNum_commande(int num_commande) {
		this.num_commande = num_commande;
	}
	public String getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(String date_commande) {
		this.date_commande = date_commande;
	}
	
	
	

}
