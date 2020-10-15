package pe.com.retaurante.Dao;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Personas;

public interface PersonasDao {
	int crear(Personas ps) ;
	int update(Personas ps) ;
	int delete (int id);
	Personas read(int id);
	List <Map<String , Object>>readAll();
}
