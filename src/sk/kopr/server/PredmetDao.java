package sk.kopr.server;

import java.util.UUID;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class PredmetDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public PredmetDao(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}



	public String pridajPredmet(String nazovPredmetu) throws PredmetExistuje_Exception {
		if(getPredmetUUID(nazovPredmetu) != null) {
			throw new PredmetExistuje_Exception("Predmet uz existuje!", new PredmetExistuje());
		}
		String uuid = UUID.randomUUID().toString();
		jdbcTemplate.update("INSERT INTO predmet(UUID, NazovPredmetu)" + "VALUES(?, ?)", new Object[] {uuid, nazovPredmetu});
        return uuid;
	}
	
	public String getPredmetUUID(String nazovPredmetu) {
		String sql = "SELECT UUID FROM predmet WHERE NazovPredmetu = ?;";
		try {
			return (String) jdbcTemplate.queryForObject(sql, new Object[] { nazovPredmetu }, String.class);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}
	
}
