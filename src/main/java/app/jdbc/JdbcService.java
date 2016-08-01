package app.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import app.jdbc.JdbcDao;

@Service
@Transactional
public class JdbcService {
	@Autowired
	public JdbcDao jdbcDao;

}
