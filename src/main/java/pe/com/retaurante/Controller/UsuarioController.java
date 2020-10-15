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

import pe.com.retaurante.entity.Usuario;
import pe.com.retaurante.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
	@Autowired
	private UsuarioService usuarioService;
	@GetMapping("/lista")
	public List<Map<String,Object>>lista(){
		return usuarioService.readAll();
	
	}
@GetMapping("/{id}")
public Usuario read (@PathVariable int id) {
	return usuarioService.read(id);
	
}
@DeleteMapping("/delete/{id}")
public int delete (@PathVariable int id) {
	return usuarioService.delete(id);
}
@PostMapping("/usuario")
public int create (@RequestBody Usuario u) {
	return usuarioService.crear(u);
}
//modifica registro segun el id
@PutMapping("/usuario/{id}")
 public String edit(@RequestBody Usuario u , @PathVariable int id) {
	Usuario usuario = usuarioService.read(id);
	usuario.setNomuser(u.getNomuser());
	usuario.setClave(u.getClave());
	usuario.setIdpersonas(u.getIdpersonas());
	String mensaje = "";
	if (usuarioService.update(usuario)==1) {
		mensaje =	"Usuario se modifico correctamente..";
	}else {
		mensaje ="Usuario no se modifico..";
	}
	return mensaje;
}
}
