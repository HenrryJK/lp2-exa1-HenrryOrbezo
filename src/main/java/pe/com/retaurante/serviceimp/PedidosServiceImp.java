package pe.com.retaurante.serviceimp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.com.retaurante.Dao.PedidosDao;
import pe.com.retaurante.entity.Pedidos;
import pe.com.retaurante.service.PedidosService;
@Service
public class PedidosServiceImp implements PedidosService {
	@Autowired
	private PedidosDao pedidosDao;
	@Override
	public int crear(Pedidos pd) {
		// TODO Auto-generated method stub
		return pedidosDao.crear(pd);
	}

	@Override
	public int update(Pedidos pd) {
		// TODO Auto-generated method stub
		return pedidosDao.update(pd);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return pedidosDao.delete(id);
	}

	@Override
	public Pedidos read(int id) {
		// TODO Auto-generated method stub
		return pedidosDao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pedidosDao.readAll();
	}

}
