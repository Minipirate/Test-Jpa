
import java.util.List;

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
@Table(name = "emprunt")
public class Emprunt {

	@Id
	private int id;

	private String date_debut;

	private String date_fin;

	private String delai;

	private int id_client;

	// Relation entre emprunt et livre est n - n car un emprunt peut concerner
	// plusieurs livres
	// Donc ici table d'association entre les 2 tables -> "compo"
	@ManyToMany
	@JoinTable(name = "compo", joinColumns = @JoinColumn(name = "id_emp", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "id_liv", referencedColumnName = "id"))
	private List<Livre> livres;

	public Emprunt() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getDelai() {
		return delai;
	}

	public void setDelai(String delai) {
		this.delai = delai;
	}

	public int getId_client() {
		return id_client;
	}

	public void setId_client(int id_client) {
		this.id_client = id_client;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

}
