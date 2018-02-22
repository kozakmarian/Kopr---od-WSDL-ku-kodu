package sk.kopr.server;

import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

public enum ObjectFactoryDao {
	INSTANCE;
	
	private JdbcTemplate jdbcTemplate;
	private PredmetDao predmetDao;
	
	public JdbcTemplate getJdbcTemplate() {
        if (jdbcTemplate == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setUrl("jdbc:mysql://localhost/ajs?serverTimezone=UTC");
            dataSource.setUser("kopr");
            dataSource.setPassword("koprkopr");
            jdbcTemplate = new JdbcTemplate(dataSource);
        }
        return jdbcTemplate;        
    }
	
	public PredmetDao getPredmetDao() {
        if (predmetDao == null) {
            predmetDao = new PredmetDao(getJdbcTemplate());            
        }
        return predmetDao;
    }
}
