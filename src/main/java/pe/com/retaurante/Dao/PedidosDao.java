package pe.com.retaurante.Dao;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Pedidos;

public interface PedidosDao {
	int crear(Pedidos pd) ;
	int update(Pedidos pd) ;
	int delete (int id);
	Pedidos read(int id);
	List <Map<String , Object>>readAll();
}
