package knjiznica.knjiga;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Knjiga {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int intKnjigaID;
	private String strKnjigaNaziv;
	private String strKnjigaOpis;
	
	public Knjiga() {
		super();
	}

	public Knjiga(int intKnjigaID, String strKnjigaNaziv, String strKnjigaOpis) {
		super();
		this.intKnjigaID = intKnjigaID;
		this.strKnjigaNaziv = strKnjigaNaziv;
		this.strKnjigaOpis = strKnjigaOpis;
	}

	public int getIntKnjigaID() {
		return intKnjigaID;
	}

	public void setIntKnjigaID(int intKnjigaID) {
		this.intKnjigaID = intKnjigaID;
	}

	public String getStrKnjigaNaziv() {
		return strKnjigaNaziv;
	}

	public void setStrKnjigaNaziv(String strKnjigaNaziv) {
		this.strKnjigaNaziv = strKnjigaNaziv;
	}

	public String getStrKnjigaOpis() {
		return strKnjigaOpis;
	}

	public void setStrKnjigaOpis(String strKnjigaOpis) {
		this.strKnjigaOpis = strKnjigaOpis;
	}
	
	

}
