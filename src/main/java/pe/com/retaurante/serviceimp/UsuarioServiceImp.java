package pe.com.retaurante.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.retaurante.Dao.UsuarioDao;
import pe.com.retaurante.entity.Usuario;
import pe.com.retaurante.service.UsuarioService;
@Service
public class UsuarioServiceImp implements UsuarioService {
	@Autowired
	private UsuarioDao usuarioDao ;
	@Override
	public int crear(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.crear(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.delete(id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}

}
