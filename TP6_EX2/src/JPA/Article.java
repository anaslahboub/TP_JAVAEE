package JPA;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Article")
public class Article {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="code_article")
	private  int code_article;
	@Column(name="description_article")
	private  String description_article;
	@Column(name="couleur_aritcle")
	private  String couleur_article;
	@Column(name="pu_article")
	private  String pu_article;
	@Column(name="quantite_article")
	private  int quantite_article;
	
	public Article() {}
	
	public Article( String description_aricle, String couleur_aricle, String pu_aricle,
			int quantite_aricle) {
		super();
		this.description_article = description_aricle;
		this.couleur_article = couleur_aricle;
		this.pu_article = pu_aricle;
		this.quantite_article = quantite_aricle;
	}

	
	public int getCode_article() {
		return code_article;
	}



	public void setCode_article(int code_aricle) {
		this.code_article = code_aricle;
	}

	public String getDescription_article() {
		return description_article;
	}

	public void setDescription_arictle(String description_aricle) {
		this.description_article = description_aricle;
	}

	public String getCouleur_article() {
		return couleur_article;
	}



	public void setCouleur_article(String couleur_aricle) {
		this.couleur_article = couleur_aricle;
	}



	public String getPu_article() {
		return pu_article;
	}



	public void setPu_article(String pu_aricle) {
		this.pu_article = pu_aricle;
	}



	public int getQuantite_article() {
		return quantite_article;
	}



	public void setQuantite_article(int quantite_aricle) {
		this.quantite_article = quantite_aricle;
	}
	
	
	


	

}
