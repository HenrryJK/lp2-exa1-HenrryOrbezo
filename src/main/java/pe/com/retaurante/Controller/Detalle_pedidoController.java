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

import pe.com.retaurante.entity.Detalle_pedido;
import pe.com.retaurante.service.Detalle_pedidoService;

@RestController
@RequestMapping("/detalle_pedidos")
public class Detalle_pedidoController {
	@Autowired
	private Detalle_pedidoService detalle_pedidoService;
	
	@GetMapping("/lista")
	public List<Map<String,Object>>lista(){
		return detalle_pedidoService.readAll();
	
	}
@GetMapping("/{id}")
public Detalle_pedido read (@PathVariable int id) {
	return detalle_pedidoService.read(id);
	
}
@DeleteMapping("/delete/{id}")
public int delete (@PathVariable int id) {
	return detalle_pedidoService.delete(id);
}
@PostMapping("/detalle_pedido")
public int create (@RequestBody Detalle_pedido dp) {
	return detalle_pedidoService.crear(dp);
}
//modifica registro segun el id
@PutMapping("/detalle_pedido/{id}")
 public String edit(@RequestBody Detalle_pedido dp , @PathVariable int id) {
	Detalle_pedido detalle = detalle_pedidoService.read(id);
	detalle.setPrecio(dp.getPrecio());
	detalle.setCantidad(dp.getCantidad());
	detalle.setIdplatos(dp.getIdplatos());
	detalle.setIdpedidos(dp.getIdpedidos());
	
	String mensaje = "";
	if (detalle_pedidoService.update(detalle)==1) {
		mensaje =	"Detalle del pedido se modifico correctamente..";
	}else {
		mensaje ="Detalle del pedido no se modifico..";
	}
	return mensaje;
}
}
