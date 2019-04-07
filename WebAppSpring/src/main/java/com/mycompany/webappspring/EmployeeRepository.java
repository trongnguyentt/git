/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webappspring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Trong
 */

   
	@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
@Query(value="SELECT p FROM Employee p WHERE p.employeeId=?1")
	List<Employee> getPeronInfoByID(int id);
}


