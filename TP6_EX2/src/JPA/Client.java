package JPA;

import javax.persistence.*;

@Entity
@Table(name="Client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_client")
	private int num_client;
	@Column(name="nom_client")
	private String nom_client;
	@Column(name="prenom_client")
	private String prenom_client;
	@Column(name="adresse_client")
	private String adresse_client;
	@Column(name="tel_client")
	private String tel_client;
	
	
	public Client() {}
	public Client(String nom_client, String prenom_client, String adresse_client, String tel_client) {
		super();
		this.nom_client = nom_client;
		this.prenom_client = prenom_client;
		this.adresse_client = adresse_client;
		this.tel_client = tel_client;
	}
	public int getNum_client() {
		return num_client;
	}

	public void setNum_client(int num_client) {
		this.num_client = num_client;
	}

	public String getNom_client() {
		return nom_client;
	}

	public void setNom_client(String nom_client) {
		this.nom_client = nom_client;
	}

	public String getPrenom_client() {
		return prenom_client;
	}

	public void setPrenom_client(String prenom_client) {
		this.prenom_client = prenom_client;
	}

	public String getAdresse_client() {
		return adresse_client;
	}


	public void setAdresse_client(String adresse_client) {
		this.adresse_client = adresse_client;
	}


	public String getTel_client() {
		return tel_client;
	}


	public void setTel_client(String tel_client) {
		this.tel_client = tel_client;
	}
		
	
}
