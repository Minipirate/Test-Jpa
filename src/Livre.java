
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * 
 */

/**
 * @author Ness'ti
 *
 */

@Entity
@Table(name = "livre")
public class Livre {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "titre")
	private String titre;

	@Column(name = "auteur")
	private String auteur;

	// Relation entre livre et emprunt est n - n car un livre peut être emprunté
	// plusieurs fois et un emprunt peut concerner plusieurs livres
	// Donc ici table d'association entre les 2 tables -> "compo"
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "id_liv", referencedColumnName = "id"), 
	inverseJoinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "id"))
	private List<Emprunt> emprunts;

	public Livre() {

	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", auteur=" + auteur + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

}
