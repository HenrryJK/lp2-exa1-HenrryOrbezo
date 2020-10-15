package pe.com.retaurante.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.retaurante.Dao.Detalle_pedidoDao;
import pe.com.retaurante.entity.Detalle_pedido;
import pe.com.retaurante.service.Detalle_pedidoService;
@Service
public class Detalle_pedidoServiceImp implements Detalle_pedidoService {
	@Autowired
	private Detalle_pedidoDao detalle_pedidoDao;
	@Override
	public int crear(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.crear(dp);
	}

	@Override
	public int update(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.update(dp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.delete(id);
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidoDao.readAll();
	}

}
