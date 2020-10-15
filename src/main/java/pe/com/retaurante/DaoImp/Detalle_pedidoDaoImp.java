package pe.com.retaurante.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.retaurante.Dao.Detalle_pedidoDao;
import pe.com.retaurante.entity.Detalle_pedido;
@Repository
public class Detalle_pedidoDaoImp implements Detalle_pedidoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int crear(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO detalle_pedido(precio ,cantidad , idplatos , idpedidos )values(? , ? , ? , ?)";
		return jdbcTemplate.update( SQL , dp.getPrecio(), dp.getCantidad() , dp.getIdplatos() , dp.getIdpedidos());
	}

	@Override
	public int update(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		System.out.println( dp.getIddetalle_pedido() + '/' +  dp.getPrecio() + '/' + dp.getCantidad() + '/'  + dp.getIdplatos() + '/'+ dp.getIdpedidos());
		String SQL ="UPDATE detalle_pedido SET precio=? , cantidad=? , idplatos =? , idpedidos=? where iddetalle_pedido=?";
		return jdbcTemplate.update( SQL,dp.getPrecio() , dp.getCantidad() , dp.getIdplatos() , dp.getIdpedidos() , dp.getIddetalle_pedido());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM detalle_pedido where iddetalle_pedido=?";
		 return jdbcTemplate.update( SQL,id);
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM detalle_pedido WHERE iddetalle_pedido=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Detalle_pedido>(Detalle_pedido.class));	
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}

}
