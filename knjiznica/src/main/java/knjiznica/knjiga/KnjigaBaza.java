package knjiznica.knjiga;

import org.springframework.data.repository.CrudRepository;

public interface KnjigaBaza extends CrudRepository<Knjiga, Integer>{
	
}
