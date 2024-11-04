package JPA;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
@Entity
@Table(name="Concerner")
public class Concerner {
	@EmbeddedId
	@Column(name="pk")
	private Concerner_PK pk;
	 @Column(name="qte_commande")
	private int qte_commande;
	 
	 
	 @ManyToOne
	    @MapsId("num_commande")
	    @JoinColumn(name="num_commande", insertable = false, updatable = false)
	    private Commande commande;

	    @ManyToOne
	    @MapsId("code_article")
	    @JoinColumn(name="code_article", insertable = false, updatable = false)
	    private Article article;

	    @ManyToOne
	    @MapsId("num_facture")
	    @JoinColumn(name="num_facture", insertable = false, updatable = false)
	    private Facture facture;
	 
	 
	public Concerner() {} 
	
	public Concerner(Concerner_PK pk, int qte_commande, Commande commande, Article article, Facture facture) {
			super();
			this.pk = pk;
			this.qte_commande = qte_commande;
			this.commande = commande;
			this.article = article;
			this.facture = facture;
		}
	public Concerner_PK getPk() {
		return pk;
	}
	public void setPk(Concerner_PK pk) {
		this.pk = pk;
	}
	public int getQte_commande() {
		return qte_commande;
	}
	public void setQte_commande(int qte_commande) {
		this.qte_commande = qte_commande;
	}
	 
	 
	
		

}
