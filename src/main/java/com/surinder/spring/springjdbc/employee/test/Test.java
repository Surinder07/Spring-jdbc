package com.surinder.spring.springjdbc.employee.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.surinder.spring.springjdbc.employee.dao.EmployeeDao;
import com.surinder.spring.springjdbc.employee.dto.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/surinder/spring/springjdbc/employee/test/springconfig.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("employeeDao");
		Employee employee = new Employee();
		employee.setId(103);
		employee.setFirstName("Bob");
		employee.setLastName("Mathew");
		
		// CRUD below is commented, uncoment one by one to check the operation
		
		int result = dao.create(employee);
		 //int result = dao.update(employee);
		//int result = dao.delete(101);
		//Employee result = dao.read(103);
		System.out.println(result + " EmployRecord   ");

	}
}
