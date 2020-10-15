package pe.com.retaurante.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.retaurante.entity.Personas;
import pe.com.retaurante.service.PersonasService;

@RestController
@RequestMapping("/personas")
public class PersonasController {
	@Autowired
	private PersonasService personasService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>>lista(){
		return personasService.readAll();
	
	}
@GetMapping("/{id}")
public Personas read (@PathVariable int id) {
	return personasService.read(id);
	
}
@DeleteMapping("/delete/{id}")
public int delete (@PathVariable int id) {
	return personasService.delete(id);
}
@PostMapping("/persona")
public int create (@RequestBody Personas ps) {
	return personasService.crear(ps);
}
//modifica registro segun el id
@PutMapping("/persona/{id}")
 public String edit(@RequestBody Personas ps , @PathVariable int id) {
	Personas personas = personasService.read(id);
	personas.setNombre(ps.getNombre());
	personas.setCorreo(ps.getCorreo());
	personas.setTelefono(ps.getTelefono());
	
	String mensaje = "";
	if (personasService.update(personas)==1) {
		mensaje =	"Persona se modifico correctamente..";
	}else {
		mensaje ="Persona no se modifico..";
	}
	return mensaje;
}
}
