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

import pe.com.retaurante.entity.Pedidos;
import pe.com.retaurante.service.PedidosService;

@RestController
@RequestMapping("/pedidos")
public class PedidosController {

	@Autowired
	private PedidosService pedidosService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>>lista(){
		return pedidosService.readAll();
	
	}
@GetMapping("/{id}")
public Pedidos read (@PathVariable int id) {
	return pedidosService.read(id);
	
}
@DeleteMapping("/delete/{id}")
public int delete (@PathVariable int id) {
	return pedidosService.delete(id);
}
@PostMapping("/pedido")
public int create (@RequestBody Pedidos pd) {
	return pedidosService.crear(pd);
}
//modifica registro segun el id
@PutMapping("/pedido/{id}")
 public String edit(@RequestBody Pedidos pd, @PathVariable int id) {
	Pedidos pedidos = pedidosService.read(id);
	pedidos.setFecha(pd.getFecha());
	pedidos.setDireccion_entrega(pd.getDireccion_entrega());
	pedidos.setIdusuario(pd.getIdusuario());
	String mensaje = "";
	if (pedidosService.update(pedidos)==1) {
		mensaje =	"Pedido se modifico correctamente..";
	}else {
		mensaje ="Pedido no se modifico..";
	}
	return mensaje;
}
}
