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

import pe.com.retaurante.entity.Platos;
import pe.com.retaurante.service.PlatosService;

@RestController
@RequestMapping("/platos")
public class PlatosController {
	@Autowired
	private PlatosService platosService;
	@GetMapping("/lista")
	public List<Map<String,Object>>lista(){
		return platosService.readAll();
	
	}
@GetMapping("/{id}")
public Platos read (@PathVariable int id) {
	return platosService.read(id);
	
}
@DeleteMapping("/delete/{id}")
public int delete (@PathVariable int id) {
	return platosService.delete(id);
}
@PostMapping("/plato")
public int create (@RequestBody Platos pl) {
	return platosService.crear(pl);
}
//modifica registro segun el id
@PutMapping("/plato/{id}")
 public String edit(@RequestBody Platos pl , @PathVariable int id) {
	Platos platos = platosService.read(id);
	platos.setNombre(pl.getNombre());
	platos.setPrecio(pl.getPrecio());
	platos.setCantidad(pl.getCantidad());
	String mensaje = "";
	if (platosService.update(platos)==1) {
		mensaje =	"Plato se modifico correctamente..";
	}else {
		mensaje ="Plato no se modifico..";
	}
	return mensaje;
}
}
