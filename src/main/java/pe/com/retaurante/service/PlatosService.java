package pe.com.retaurante.service;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Platos;

public interface PlatosService {
	int crear(Platos pl) ;
	int update(Platos pl) ;
	int delete (int id);
	Platos read(int id);
	List <Map<String , Object>>readAll();
}
