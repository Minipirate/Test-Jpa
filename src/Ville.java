import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * @author Ness'ti
 *
 */

@Entity
@Table(name = "villes")
public class Ville {
	

	@Id
	private int id;

	private String nom;

	public Ville() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
