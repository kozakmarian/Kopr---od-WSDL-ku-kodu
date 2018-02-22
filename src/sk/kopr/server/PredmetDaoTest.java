package sk.kopr.server;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.jdbc.core.JdbcTemplate;

class PredmetDaoTest {

	@Test
	void pridajPredmetTest() throws PredmetExistuje_Exception {
		JdbcTemplate jdbc = ObjectFactoryDao.INSTANCE.getJdbcTemplate();
		PredmetDao predmetDao = new PredmetDao(jdbc);
		int pocetPred = jdbc.queryForInt("SELECT count(*) FROM predmet;");
		String uuid = predmetDao.pridajPredmet("Statistika");
		int pocetPo = jdbc.queryForInt("SELECT count(*) FROM predmet;");
		Assert.assertTrue(pocetPred + 1 == pocetPo);
		jdbc.update("DELETE FROM predmet WHERE UUID = ?", new Object[] {uuid});
	}

}
