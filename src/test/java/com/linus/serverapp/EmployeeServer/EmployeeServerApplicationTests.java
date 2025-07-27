package com.linus.serverapp.EmployeeServer;

import com.linus.serverapp.dao.EmployeeDao;
import com.linus.serverapp.model.Employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureMockMvc
class EmployeeServerApplicationTests {

	@Autowired
	private EmployeeDao employeeDao;

//	@Test
//	void addEmployeeTest() {
//		Employee employee = new Employee();
//		employee.setName("Edith Barry");
//		employee.setPhone("9090909091");
//		employee.setEmail("barry.21@gmail.com");
//		employee.setJobTitle("Developer");
//		employee.setAddress("Bangalore");
//		employee.setImageUrl("https://www.google.com");
//		employeeDao.save(employee);
//	}

//	@Test
//	void getAllEmployeesDeleteThem() {
//		employeeDao.getAllEmployees().forEach(employee -> {
//			employeeDao.deleteEmployee(employee);
//		});
//	}

}
