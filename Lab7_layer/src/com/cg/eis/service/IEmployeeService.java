package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface IEmployeeService {

	Map<Integer,Employee> addEmpDetails(Integer empId,Employee emp);
	Employee getEmpByInsuraceScheme(String insuranceScheme);
	Map<Integer,Employee> deleteEmpDetails(int id);

	
}
