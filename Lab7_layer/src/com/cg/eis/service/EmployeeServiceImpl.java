package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;
import com.cg.eis.util.CollectionEmp;

public class EmployeeServiceImpl implements IEmployeeService {

	CollectionEmp util= new CollectionEmp();
	@Override
	public Map<Integer,Employee> addEmpDetails(Integer empId, Employee emp) {
		util.employees.put(empId,emp);
		return util.getEmployee();
	}

	@Override
	public Employee getEmpByInsuraceScheme(String insuranceScheme) {
		Map<Integer,Employee> emp=util.getEmployee();
		for(Map.Entry e:emp.entrySet())
		{
			Employee emp2=(Employee) e.getValue();
			if(emp2.getInsuranceScheme().equalsIgnoreCase(insuranceScheme))
				return emp2;
		}
		return null;
	}

	@Override
	public Map<Integer,Employee> deleteEmpDetails(int id) {
		Map<Integer,Employee> emp=util.getEmployee();
		emp.remove(id);
		return emp;
	}

	

}
