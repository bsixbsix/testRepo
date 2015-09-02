package org.bsix.example.spring3;

import java.sql.Connection;
import java.sql.SQLException;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import org.junit.Assert;
import static org.hamcrest.CoreMatchers.*;

public class DataSourceAccessTest extends BaseSpringTest {
	private DataSource jdbcDataSource;
	private DataSource dbcpDataSource;

	public DataSourceAccessTest() {
	}

	@Test
	public void testJDBC() {
		try {
			Connection conn = jdbcDataSource.getConnection();
			conn.createStatement().executeQuery("Select 'Hello MySql!'");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testDBCP() {
		try {
			Connection conn = dbcpDataSource.getConnection();
			conn.createStatement().executeQuery("Select 'Hello MySql!'");
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testJDBCTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(jdbcDataSource);
		String lastName = jdbcTemplate.queryForObject("Select 'Hello World!!!'", String.class);
		Assert.assertThat(lastName, is("Hello World!!!"));
	}

	@Test
	public void testDBCPTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dbcpDataSource);
		String lastName = jdbcTemplate.queryForObject("Select 'Hello World!!!'", String.class);
		Assert.assertThat(lastName, is("Hello World!!!"));
	}

	
	@Resource
	public void setJdbcDataSource(DataSource jdbcDataSource) {
		this.jdbcDataSource = jdbcDataSource;
	}

	@Resource
	public void setDbcpDataSource(DataSource dbcpDataSource) {
		this.dbcpDataSource = dbcpDataSource;
	}

}
