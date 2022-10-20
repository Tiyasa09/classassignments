package com.cognizant.tax;

public class EmployeeTax {
	public static void main(String[] args) {
		TaxCalculator p=new TaxCalculator(); //create object of class TaxCalculator
		System.out.println("case 1:");
		p.basicSalary=25000;  //salary 
		p.citizenship=true;
		p.calculateTax();  //invoke 1st method
		p.deductTax(); //invoke 2nd method
		p.validateSalary(); //invoke 3rd method
		TaxCalculator t=new TaxCalculator();  //create another object
		System.out.println("case 2");
		t.basicSalary=125000;
		t.citizenship=true;
		t.calculateTax();
		t.deductTax();
		t.validateSalary();
	}

}
