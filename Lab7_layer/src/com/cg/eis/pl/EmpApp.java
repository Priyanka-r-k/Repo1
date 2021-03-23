package com.cg.eis.pl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;
import com.cg.eis.service.IEmployeeService;



public class EmpApp {

	public static void main(String[] args) {
		IEmployeeService employeeService=new EmployeeServiceImpl();
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("1.Add Employee details \n 2.Get Employee By Insurance Scheme \n 3.Delete Employee");
		System.out.println("Enter you choice");
		
		int a=scanner.nextInt();
		
		switch(a){
		case 1:
		System.out.println("enter the employee id");
		Integer empId=scanner.nextInt();
		
		System.out.println("enter the employee salary");
		double empSalary=scanner.nextInt();
		
		Scanner scanner2 =new Scanner(System.in);
		System.out.println("enter the employee Name");
		String empName=scanner2.nextLine();
		
		System.out.println("enter the employee Designation");
		String empDesignation=scanner2.nextLine();
		
		System.out.println("enter the employee Insurance Scheme");
		String empInsuranceScheme=scanner2.nextLine();
		
		Employee empAdd=new Employee(empId,empName,empSalary,empDesignation,empInsuranceScheme);
		
		
		Map<Integer,Employee> newEmp=employeeService.addEmpDetails(empId, empAdd);
		System.out.println(newEmp);
		
		break;
		case 2:
			scanner.nextLine();
			System.out.println("Enter Insurance scheme");
			String insuranceScheme=scanner.nextLine();
			System.out.println(employeeService.getEmpByInsuraceScheme(insuranceScheme));
		    break;
		case 3:
			scanner.nextLine();
			System.out.println("Enter the Id of the employee to be deleted");
			int id=scanner.nextInt();
			Map<Integer,Employee> dEmp=new HashMap<Integer,Employee>();
			dEmp=employeeService.deleteEmpDetails(id);
		System.out.println(dEmp);
		}
	}

}
