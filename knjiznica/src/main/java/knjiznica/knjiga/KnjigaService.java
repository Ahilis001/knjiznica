package knjiznica.knjiga;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnjigaService {
	
	@Autowired
	KnjigaBaza knjigaBaza;
	
	/**
	 * dohvaća sve knjige iz baze
	 * @return lista svih knjiga
	 */
	public List<Knjiga> getAllKnjigeService() {
		
		List<Knjiga> lstKnjiga = new ArrayList<>();
		
		for (Knjiga knjiga : knjigaBaza.findAll()) {
			lstKnjiga.add(knjiga);
		}
		
		return lstKnjiga;
	}

	/**
	 * metoda za dodavanje nove knjige
	 * @param knjiga
	 * @return poruka uspjesnosti
	 */
	public void addKnjiga(Knjiga knjiga) {
			knjigaBaza.save(knjiga);
	}
	
	/**
	 * metoda za brisanje knjige po id-u
	 */
	public void deleteKnjiga(int intKnjigaID) {
		knjigaBaza.deleteById(intKnjigaID);
	}
	
	public void updateKnjiga(Knjiga knjiga) {
		knjigaBaza.save(knjiga);
	}
}
