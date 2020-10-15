package pe.com.retaurante.service;

import java.util.List;
import java.util.Map;

import pe.com.retaurante.entity.Usuario;

public interface UsuarioService {
	int crear(Usuario u) ;
	int update(Usuario u) ;
	int delete (int id);
	Usuario read(int id);
	List <Map<String , Object>>readAll();
	
}
