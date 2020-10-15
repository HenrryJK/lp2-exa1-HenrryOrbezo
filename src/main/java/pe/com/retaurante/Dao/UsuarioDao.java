package pe.com.retaurante.Dao;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Usuario;

public interface UsuarioDao {
	int crear(Usuario u) ;
	int update(Usuario u) ;
	int delete (int id);
	Usuario read(int id);
	List <Map<String , Object>>readAll();
	public Usuario read(String nomuser);
}
