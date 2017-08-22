package com.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeDetails {
	public static void main(String args[]){
	List<Employee> employeeList= new ArrayList<Employee>();
	Employee employee= new Employee(2,"subathra",21);
	employeeList.add(employee);
	employee=new Employee(1,"sowbu",21);
	employeeList.add(employee);
	employee=new Employee(3,"abinaya",21);
	employeeList.add(employee);
	employee=new Employee(4,"nivetha",20);
	employeeList.add(employee);
	employee=new Employee(5,"thiru",22);
	employeeList.add(employee);
	employee=new Employee(6,"sathish",21);
	employeeList.add(employee);
	employee=new Employee(7,"jeyaprakash",21);
	employeeList.add(employee);
	employee=new Employee(8,"mayura",22);
	employeeList.add(employee);
	employee=new Employee(9,"gowtham",21);
	employeeList.add(employee);
	employee=new Employee(10,"anand",23);
	employeeList.add(employee);
	Employee emp=new Employee();
	System.out.println("enter the id ");
	Scanner s= new Scanner(System.in);
	int id=s.nextInt();
	emp.setId(id);


if((employeeList.contains(emp))){
	System.out.println("Ëmployee exists");
}
else{
	System.out.println("employee not found");
}
	
/*	System.out.println(employeeList.contains(employee.g));*/
	}
	


}
