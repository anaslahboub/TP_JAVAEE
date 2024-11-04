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
@Table(name="Facture")
public class Facture {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="num_facture")
	private  int num_facture;
	@Column(name="date_facture")
	private  String date_facture;
	@Column(name="montant_facture")
	private  int montant_facture;
	
	@ManyToOne
	@JoinColumn(name="code_utilisateur" , referencedColumnName = "code_utilisateur")
	private Utilisateur utilisateur;
	
	 public Facture() { }
	
	
	public Facture(String date_facture, int montant_facture, Utilisateur utlisateur) {
		super();
		this.date_facture = date_facture;
		this.montant_facture = montant_facture;
		this.utilisateur = utlisateur;
	}




	public Utilisateur getUtlisateur() {
		return utilisateur;
	}




	public void setUtlisateur(Utilisateur utlisateur) {
		this.utilisateur = utlisateur;
	}




	public int getNum_facture() {
		return num_facture;
	}
	public void setNum_facture(int num_facture) {
		this.num_facture = num_facture;
	}
	public String getDate_facture() {
		return date_facture;
	}
	public void setDate_facture(String date_facture) {
		this.date_facture = date_facture;
	}
	public int getMontant_facture() {
		return montant_facture;
	}
	public void setMontant_facture(int montant_facture) {
		this.montant_facture = montant_facture;
	}
	
	
	
	


}
