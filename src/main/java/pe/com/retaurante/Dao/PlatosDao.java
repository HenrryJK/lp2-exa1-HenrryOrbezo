package pe.com.retaurante.Dao;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Platos;

public interface PlatosDao {
	int crear(Platos pl) ;
	int update(Platos pl) ;
	int delete (int id);
	Platos read(int id);
	List <Map<String , Object>>readAll();

}
