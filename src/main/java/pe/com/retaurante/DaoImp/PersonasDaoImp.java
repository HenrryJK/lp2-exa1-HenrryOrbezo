package pe.com.retaurante.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.retaurante.Dao.PersonasDao;
import pe.com.retaurante.entity.Personas;
@Repository
public class PersonasDaoImp implements PersonasDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int crear(Personas ps) {
		// TODO Auto-generated method stub
		String SQL ="INSERT INTO personas (nombres ,correo , telefono )values(? , ? , ?)";
		return jdbcTemplate.update( SQL ,ps.getNombre() , ps.getCorreo() , ps.getTelefono());
	}

	@Override
	public int update(Personas ps) {
		// TODO Auto-generated method stub
		System.out.println(ps.getIdpersonas() + '/' + ps.getNombre() + '/'  + ps.getCorreo() + '/'  + ps.getTelefono());
		String SQL ="UPDATE personas SET nombres=? , correo=? , telefono=? where idpersonas=?";
		return jdbcTemplate.update( SQL,ps.getNombre() , ps.getCorreo() , ps.getTelefono() , ps.getIdpersonas());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
				String SQL = "DELETE FROM personas where idpersonas=?";
				 return jdbcTemplate.update( SQL,id);
	}

	@Override
	public Personas read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM personas WHERE idpersonas=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Personas>(Personas.class));	
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
				String SQL ="SELECT * FROM personas";
				return jdbcTemplate.queryForList(SQL);
	}

}
