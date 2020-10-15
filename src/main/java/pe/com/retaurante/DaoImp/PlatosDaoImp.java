package pe.com.retaurante.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.retaurante.Dao.PlatosDao;
import pe.com.retaurante.entity.Platos;

@Repository
public class PlatosDaoImp implements PlatosDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int crear(Platos pl) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO platos(nombre ,precio , cantidad )values(? , ? , ?)";
		return jdbcTemplate.update( SQL ,  pl.getNombre(), pl.getPrecio() , pl.getCantidad());

	}

	@Override
	public int update(Platos pl) {
		// TODO Auto-generated method stub
		System.out.println( pl.getIdplatos() + '/' + pl.getNombre() + '/'  + pl.getPrecio() + '/'+ pl.getCantidad());
		String SQL ="UPDATE platos SET nombre=? , precio=? , cantidad =? where idplatos=?";
		return jdbcTemplate.update( SQL,pl.getNombre() , pl.getPrecio() , pl.getCantidad() , pl.getIdplatos());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM platos where idplatos=?";
		 return jdbcTemplate.update( SQL,id);
	}

	@Override
	public Platos read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM platos WHERE idplatos=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Platos>(Platos.class));	
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM platos";
		return jdbcTemplate.queryForList(SQL);
	}

}
