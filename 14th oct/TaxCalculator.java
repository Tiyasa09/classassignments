package com.cognizant.tax;

public class TaxCalculator {
float basicSalary;  //initialize salary as float
float tax; //tax as float
boolean citizenship; //as boolean

 public void calculateTax() { //1st method
	float tax=30*basicSalary/100; //calculate tax
	System.out.println("the tax of the employee for the"+" " +basicSalary+ "is" +" "+tax);
	
}
 public void deductTax() { //2nd method
	 float tax=30*basicSalary/100;
	int nettSalary=((int) (basicSalary)-(int)(tax)); //calculate nettsalary and type casting
	System.out.println("the nett salary of the employee:" +nettSalary);
	
}
 public void validateSalary() { //3rd method
	System.out.println("the salary and citizenship eligibility:");
	if(basicSalary>100000 && citizenship==true) {  //decision making
		System.out.println("true");
	}else {
		System.out.println("false");
	}
}
	
}

