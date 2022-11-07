import org.junit.Assert;
import org.junit.Test;
/**
* File Name: MyHealthDataTest2.java
* Course: CST8284-OOP
* Author: Neeraj Katewa
* Assignment: Assignment1
* Date:6th November 2022
* Professor: Sandra Iroakazi
* Purpose: JUnit test class to test the functions of MyHealthData class. Target to get a successful test and a failed test
* @author Neeraj Katewa
*/
public class MyHealthDataTest2 {
	static double delta=0.000001;
	/**
	 * Test case to test the getBMI() function successfully.  
	 */
	@Test
	public void testGetBMI() {
		MyHealthData health= new MyHealthData("Neeraj","Katewa","Male",2000,2022,67.0,120.0);
		double actualBMI=20; //actual value of BMI
		double expectedBMI=health.getBMI(); //expected value of BMI
		Assert.assertEquals(actualBMI,expectedBMI,delta);
	}
}
