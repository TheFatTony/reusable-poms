package com.chieftain.db4j.pool;

import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;

public class EmbeddedDbcpDatabaseBuilder extends EmbeddedDatabaseBuilder {

	public EmbeddedDbcpDatabaseBuilder() {
		setDataSourceFactory(new DbcpDataSourceFactory());
	}
}
