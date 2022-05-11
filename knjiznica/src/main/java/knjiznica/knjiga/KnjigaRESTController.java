package knjiznica.knjiga;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Služi za REST
 * @author Ahilis
 *
 */
@RestController
@RequestMapping("/REST/knjige")
public class KnjigaRESTController {

	@Autowired
	KnjigaService knjigaService;
	
	/**
	 * dohvat svih knjiga
	 * @return json lista knjiga
	 */
	@GetMapping("/sveKnjige")
	public List<Knjiga> getAllKnjigeController() {
		return knjigaService.getAllKnjigeService();
	}
	
	/**
	 * upis nove knjige
	 * @param knjiga koja se dodaje
	 */
	@PostMapping("/novaKnjiga")
	public void addKnjiga(@RequestBody Knjiga knjiga) {
		knjigaService.addKnjiga(knjiga);
	}
	
	/**
	 * brisanje knjige prema id-u
	 */
	@DeleteMapping("/obrisiKnjigu/{strKnjigaID}")
	public void deleteKnjiga(@PathVariable String strKnjigaID) {
		knjigaService.deleteKnjiga(Integer.parseInt(strKnjigaID));		
	}
	
	/**
	 * promjena knjige prema id-u
	 * @param knjiga
	 * @param strKnjigaID
	 */
	@PutMapping("/promijeniKnjigu/{strKnjigaID}")
	public void promijeniKnjigu(@RequestBody Knjiga knjiga) {
		
		knjigaService.updateKnjiga(knjiga);
	}
}
