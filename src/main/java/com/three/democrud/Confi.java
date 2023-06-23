package com.three.democrud;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class Confi {
	@SuppressWarnings("rawtypes")
	@Bean(name="h2_db")
	@Profile("h22")
	public javax.sql.DataSource h2Database()
	
	{
		
		//System.out.println("h2 database");
	DataSourceBuilder dsb= DataSourceBuilder.create();
	dsb.driverClassName("org.h2.Driver");
	dsb.url("jdbc:h2:mem:student");
	dsb.username("root");
	dsb.password("");
	
		return dsb.build();
		
	}
	@SuppressWarnings("rawtypes")
	@Bean(name="sql_db")
	@Profile("mysql2")
	//@Primary
	public javax.sql.DataSource sqlDatabase()
	
	{
		//System.out.println("sql database");
	DataSourceBuilder dsb= DataSourceBuilder.create();
	dsb.driverClassName("com.mysql.cj.jdbc.Driver");
	dsb.url("jdbc:mqsql://localhost:3306/userr");
	dsb.username("root");
	dsb.password("1234");
		return dsb.build();
		
	}
}
