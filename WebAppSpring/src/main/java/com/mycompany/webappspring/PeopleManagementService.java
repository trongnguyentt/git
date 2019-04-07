/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webappspring;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
class PeopleManagementService {
@Autowired
	private EmployeeRepository e;

	public List<Employee> getPersonsInfoByID(int id) {
		return e.getPeronInfoByID(id);
	}
}
