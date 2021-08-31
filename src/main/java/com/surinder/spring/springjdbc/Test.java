package com.surinder.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/surinder/spring/springjdbc/springconfig.xml");
		
		JdbcTemplate  jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		String sql = "insert into Employee values(?,?,?)";
		int result = jdbcTemplate.update(sql,1,"Sunny","singh");
		
		System.out.println(result+" Record updated successfully ");
		
		
		

	}
}
