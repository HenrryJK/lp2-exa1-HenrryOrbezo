package pe.com.retaurante.DaoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.com.retaurante.Dao.UsuarioDao;
import pe.com.retaurante.entity.Usuario;
@Repository
public class UsuarioDaoImp implements UsuarioDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public int crear(Usuario u) {
		// TODO Auto-generated method stub
				String SQL ="INSERT INTO usuario(nomuser ,clave , idpersonas)values(? , ? , ?)";
				return jdbcTemplate.update( SQL ,u.getNomuser() , u.getClave() , u.getIdpersonas());
	}

	@Override
	public int update(Usuario u) {
		System.out.println( u.getIdusuario() + '/' + u.getNomuser() + '/'  + u.getClave());
		String SQL ="UPDATE usuario SET nomuser=? , clave=? , idpersonas=?  where idusuario=?";
		return jdbcTemplate.update( SQL,u.getNomuser() , u.getClave() , u.getIdpersonas() , u.getIdusuario());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM usuario where idusuario=?";
		 return jdbcTemplate.update( SQL,id);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM usuario WHERE idusuario=?";
		return jdbcTemplate.queryForObject(SQL, new Object[]{id} , new BeanPropertyRowMapper<Usuario>(Usuario.class));	
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="SELECT * FROM usuario";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		String SQL = "select * from usuario where nomuser = ?";
		return jdbcTemplate.queryForObject(SQL, new Object[] {nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

}
