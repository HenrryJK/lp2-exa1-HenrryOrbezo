package pe.com.retaurante.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.retaurante.Dao.PersonasDao;
import pe.com.retaurante.entity.Personas;
import pe.com.retaurante.service.PersonasService;
@Service
public class PersonasServiceImp implements PersonasService {
	@Autowired
	private PersonasDao personasDao ;
	@Override
	public int crear(Personas ps) {
		// TODO Auto-generated method stub
		return personasDao.crear(ps);
	}

	@Override
	public int update(Personas ps) {
		// TODO Auto-generated method stub
		return personasDao.update(ps);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return personasDao.delete(id);
	}

	@Override
	public Personas read(int id) {
		// TODO Auto-generated method stub
		return personasDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return personasDao.readAll();
	}

}
