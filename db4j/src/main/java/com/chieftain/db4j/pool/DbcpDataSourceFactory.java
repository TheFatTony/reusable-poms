package com.chieftain.db4j.pool;

import java.sql.Driver;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.datasource.embedded.ConnectionProperties;
import org.springframework.jdbc.datasource.embedded.DataSourceFactory;

public class DbcpDataSourceFactory implements DataSourceFactory, ConnectionProperties {
	private final BasicDataSource dataSource;

	public DbcpDataSourceFactory() {
		this(DbcpUtils.newDefaultDS());
	}

	public DbcpDataSourceFactory(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public ConnectionProperties getConnectionProperties() {
		return this;
	}

	public BasicDataSource getDataSource() {
		return dataSource;
	}

	public void setUsername(String username) {
		dataSource.setUsername(username);
	}

	public void setPassword(String password) {
		dataSource.setPassword(password);
	}

	public void setUrl(String url) {
		dataSource.setUrl(url);
	}

	public void setDriverClass(Class<? extends Driver> driverClass) {
		dataSource.setDriverClassName(driverClass.getName());
	}
}
