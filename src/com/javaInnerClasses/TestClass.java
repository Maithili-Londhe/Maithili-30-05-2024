package com.javaInnerClasses;

public class TestClass {

	public static void main(String[] args) 
	{
		
		Customer customer = new Customer(6789, "Radha", 8989909011L);
		System.out.println(customer.toString());
		
		System.out.println("------------------------------------------------------------------");
		
		Customer.Address address = customer.new Address("Pune");//outerclass.innerclass
		address.getCustomerDetails();
		
		System.out.println("------------------------------------------------------------------");
		//static class do not create object directly call the method by className
		Customer.Qualification.getQualificationDetails();
		
	}

}
