package knjiznica.knjiga;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * služi za pozivanje grafičkog prikaza
 * @author Ahilis
 *
 */
@Controller
//@RequestMapping("/prikaz/knjige")
public class KnjigaController {
	
	@Autowired
	KnjigaService knjigaService;
	

	
	/**
	 * prikaz index
	 */
	@GetMapping("/prikaz/knjige")
	public String prikaziIndex(){	

		return "index";
	}
	
	/**
	 * prikaz svih knjiga
	 */
	@GetMapping("/prikaz/knjige/sveKnjige")
	public String getAllKnjigePrikaz(Model model) {	
		model.addAttribute("knjige", knjigaService.getAllKnjigeService());
		return "sveKnjige";
	}
	
	/**
	 * prikaz upisa nove knjige
	 */
	@GetMapping("/prikaz/knjige/novaKnjiga")
	public String prikaziNovuKnjigu(Model model) {	
		model.addAttribute("knjiga", new Knjiga());
		return "novaKnjiga";
	}
	
	/**
	 * upis nove knjige
	 * @param knjiga koja se dodaje
	 */
	@PostMapping("/prikaz/knjige/novaKnjiga")
	public String addKnjiga(@ModelAttribute Knjiga knjiga) {
		knjigaService.addKnjiga(knjiga);
		return "novaKnjiga";
	}
	
	/**
	 * prikaz upisa nove knjige
	 */
	@GetMapping("/prikaz/knjige/obrisiKnjigu")
	public String obrisiKnjigu(Model model) {	
		model.addAttribute("knjige", knjigaService.getAllKnjigeService());	
		return "obrisiKnjigu";
	}

	/**
	 * brisanje knjige s ID-em
	 * @param knjiga
	 * @return 
	 */
	@GetMapping("/prikaz/knjige/obrisiKnjigu/{strKnjigaID}")
	public String deleteKnjiga(@PathVariable String strKnjigaID) {
		knjigaService.deleteKnjiga(Integer.parseInt(strKnjigaID));
		return "obrisiKnjigu";
	}
	
}
