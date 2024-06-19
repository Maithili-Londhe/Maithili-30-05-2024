package com.javaInnerClasses;

public class TestClass2 
{

	public static void main(String[] args) 
	{
		//Cannot instantiate the type Department
		//anonymous inner class **
		//anonymous class-which is unnamed , undefined ,can't reuse,
		//When you need to create a class that will only be used once, such as for a specific event handler or a callback
		Department department = new Department(101, "QA")
		{

			@Override
			public void getDepartmentDetails() 
			{
				System.out.println(getDepartmentId());
				System.out.println(getDepartmentName());
				
			}
			
		};
		department.getDepartmentDetails();
		
		//by lambda expression
	}

}
