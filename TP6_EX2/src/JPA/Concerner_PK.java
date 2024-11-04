package JPA;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Concerner_PK implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Column(name="num_commande")
	private int num_commande;
	 @Column(name="code_article")
	private  int code_article;
	 @Column(name="num_facture")
	private  int num_facture;
	 
	 public Concerner_PK(){}	 	 
	public Concerner_PK(int num_commande, int code_aricle, int num_facture) {
		super();
		this.num_commande = num_commande;
		this.code_article = code_aricle;
		this.num_facture = num_facture;
	}

	public int getNum_commande() {
		return num_commande;
	}

	public void setNum_commande(int num_commande) {
		this.num_commande = num_commande;
	}


	public int getCode_article() {
		return code_article;
	}

	public void setCode_article(int code_article) {
		this.code_article = code_article;
	}

	public int getNum_facture() {
		return num_facture;
	}

	public void setNum_facture(int num_facture) {
		this.num_facture = num_facture;
	}
	 
	
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Concerner_PK)) return false;
        Concerner_PK that = (Concerner_PK) o;
        return num_commande == that.num_commande &&
               code_article == that.code_article &&
               num_facture == that.num_facture;
    }

    @Override
    public int hashCode() {
        int result = Integer.hashCode(num_commande);
        result = 31 * result + Integer.hashCode(code_article);
        result = 31 * result + Integer.hashCode(num_facture);
        return result;
    }
	 
	 
	 

	
	
	


}
