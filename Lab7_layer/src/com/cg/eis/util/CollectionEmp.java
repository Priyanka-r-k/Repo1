package com.cg.eis.util;

import java.util.HashMap;
import java.util.Map;

import com.cg.eis.bean.Employee;



public class CollectionEmp {


	public static Map<Integer,Employee> employees =new HashMap<Integer,Employee>();

	static
	{
		employees.put(100, new Employee(100,"Ram",50000.00,"Manager","Scheme A"));
		employees.put(104, new Employee(104,"Sham",25000.00,"Programmer","Scheme B"));
		employees.put(105, new Employee(105,"Krishna",10000.00,"System Associate","Scheme C"));
		employees.put(101, new Employee(101,"Patil",4500.00,"Clerk","No Scheme"));
		
		

	}
	
	public static Map<Integer,Employee> getEmployee()
	{
		return employees;
	}
}
