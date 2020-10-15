package pe.com.retaurante.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.retaurante.Dao.PlatosDao;
import pe.com.retaurante.entity.Platos;
import pe.com.retaurante.service.PlatosService;
@Service
public class PlatosServiceImp implements PlatosService {
	@Autowired
	private PlatosDao platosDao ;
	@Override
	public int crear(Platos pl) {
		// TODO Auto-generated method stub
		return platosDao.crear(pl);
	}

	@Override
	public int update(Platos pl) {
		// TODO Auto-generated method stub
		return platosDao.update(pl);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return platosDao.delete(id);
	}

	@Override
	public Platos read(int id) {
		// TODO Auto-generated method stub
		return platosDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return platosDao.readAll();
	}

}
