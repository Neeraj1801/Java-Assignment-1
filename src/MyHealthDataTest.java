import java.util.Scanner;
/**
* File Name: MyHealthDataTest.java
* Course: CST8284-OOP
* Author: Neeraj Katewa
* Assignment: Assignment1
* Date:6th November 2022
* Professor: Sandra Iroakazi
* Purpose: Test the MyHealthData class to make sure all the functions are executing properl and creating a report.
* @author Neeraj Katewa
* 
*/
public class MyHealthDataTest {
	public static void main(String []args)
	{
		MyHealthData healthData= new MyHealthData("Neeraj","Katewa","Male",2000,2022,70.0,176.0); // creating instance of MyHealthData class
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName=scan.next();  //taking input for firstName
		healthData.setFirstName(firstName); //setting the value for firstName as the input value
		System.out.println("Enter Last Name:");
		String lastName=scan.next(); //taking input for lastName
		healthData.setLastName(lastName); //setting the value for as lastName the input value
		System.out.println("Enter Gender:");
		String gender=scan.next(); //taking input for gender
		healthData.setGender(gender); //setting the value for gender as the input value
		System.out.println("Enter Birth Year:");
		int birthYear= scan.nextInt(); //taking input for birthYear
		healthData.setBirthYear(birthYear); //setting the value for birthYear as the input value
		System.out.println("Enter Current Year:");
		int currentYear= scan.nextInt();//taking input for currentYear
		healthData.setCurrentYear(currentYear); //setting the value for currentYear as the input value
		System.out.println("Enter Height(in inches):");
		double height= scan.nextDouble(); //taking input for height
		healthData.setHeight(height); //setting the value for height as the input value
		System.out.println("Enter Weight(in pounds):");
		double Weight= scan.nextDouble(); //taking input for weight
		healthData.setWeight(Weight); //setting the value for weight as the input value
		healthData.displayMyHealthData(); //calling displayMyHealthData to print the report
		scan.close();
	}

}
