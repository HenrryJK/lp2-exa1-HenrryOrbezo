package pe.com.retaurante.service;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	int crear(Detalle_pedido dp) ;
	int update(Detalle_pedido dp) ;
	int delete (int id);
	Detalle_pedido read(int id);
	List <Map<String , Object>>readAll();
}
