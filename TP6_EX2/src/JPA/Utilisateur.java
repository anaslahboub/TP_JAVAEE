package JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Utilisateur")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code_Utilisateur")
	private int code_Utilisateur;
	@Column(name="nom_Utilisateur")
	private String nom_Utilisateur;
	@Column(name="prenom_Utilisateur")
	private String prenom_Utilisateur;
	@Column(name="fonaction_Utilisateur")
	private String fonaction_Utilisateur;
	
	public Utilisateur(){}	
	public Utilisateur( String nom_Utilisateur, String prenom_Utilisateur,
			String fonaction_Utilisateur) {
		super();
		this.nom_Utilisateur = nom_Utilisateur;
		this.prenom_Utilisateur = prenom_Utilisateur;
		this.fonaction_Utilisateur = fonaction_Utilisateur;
	}
	
	public int getCode_Utilisateur() {
		return code_Utilisateur;
	}

	public void setCode_Utilisateur(int code_Utilisateur) {
		this.code_Utilisateur = code_Utilisateur;
	}

	public String getNom_Utilisateur() {
		return nom_Utilisateur;
	}

	public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}

	public String getPrenom_Utilisateur() {
		return prenom_Utilisateur;
	}

	public void setPrenom_Utilisateur(String prenom_Utilisateur) {
		this.prenom_Utilisateur = prenom_Utilisateur;
	}

	public String getFonaction_Utilisateur() {
		return fonaction_Utilisateur;
	}

	public void setFonaction_Utilisateur(String fonaction_Utilisateur) {
		this.fonaction_Utilisateur = fonaction_Utilisateur;
	}
	
	
	
	


}
