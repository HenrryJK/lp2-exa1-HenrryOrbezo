package pe.com.retaurante.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.retaurante.Dao.PedidosDao;
import pe.com.retaurante.entity.Pedidos;

@Repository
public class PedidosDaoImp implements PedidosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int crear(Pedidos pd) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO pedidos(fecha ,direccion_entrega , idusuario )values(? , ? , ?)";
		return jdbcTemplate.update( SQL ,  pd.getFecha(), pd.getDireccion_entrega() ,pd.getIdusuario());
	}

	@Override
	public int update(Pedidos pd) {
		// TODO Auto-generated method stub
		System.out.println( pd.getIdpedidos() + '/' +pd.getFecha() + '/'  + pd.getDireccion_entrega() + '/'+ pd.getIdusuario());
		String SQL ="UPDATE pedidos SET fecha=? , direccion_entrega=? , idusuario =? where idpedidos=?";
		return jdbcTemplate.update( SQL,pd.getFecha() , pd.getDireccion_entrega() , pd.getIdusuario() ,  pd.getIdpedidos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM pedidos where idpedidos=?";
		 return jdbcTemplate.update( SQL,id);
	}

	@Override
	public Pedidos read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM pedidos WHERE idpedidos=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Pedidos>(Pedidos.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM pedidos";
		return jdbcTemplate.queryForList(SQL);
	}

}
