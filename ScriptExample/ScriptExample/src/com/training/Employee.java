package com.training;

public class Employee {
	private int Id;
	private String name;
	private int age;
	Employee(){
		
	}
	public Employee(int id,String name, int age){
		this.Id=id;
		this.name=name;
		this.age=age;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public boolean equals(Object obj) {
	    if (this == obj)
	       return true;
	    if (obj == null)
	       return false;
	    if (getClass() != obj.getClass())
	       return false;
	    Employee emp = (Employee) obj;
	    if (Id != emp.getId())
	       return false;
	    return true;
	}
	
}
