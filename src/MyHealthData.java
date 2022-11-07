/**
* File Name: MyHealthData.java
* Course: CST8284-OOP
* Author: Sandra Iroakazi
* Modified by: Neeraj Katewa
* Assignment: Assignment1
* Date:6th November 2022
* Professor: Sandra Iroakazi
* Purpose: Declare the vairables and complete the getters and setter for them. Write functions to calcualte and return maximum heart rate and target heart rate.
* @author Neeraj Katewa
* 
*/
public class MyHealthData {
	//22F CST8284
	//Assignment 1: MyHealthData.java

	//This system maintains important health information about a patient.
	//Note: This class assumes values passed to the set methods are correct.
	// REVIEW THIS FILE AND ASSIGNMENT INSTRUCTIONS CAREFULLY BEFORE YOU START OFF!!


	//TO DO 1: INCLUDE YOUR ATTRIBUTES HERE. REMEMBER TO CHECK THE UML CLASS DIAGRAM TO INCLUDE ALL ATTRIBUTES LISTED AND THEIR TYPES.

	private String firstName;
	private String lastName;
	private String gender;
	private int birthYear;
	private int currentYear;
	private double height;
	private double weight;


	/**
	 * Parameterized Constructor for MyHealthData class
	 * @param firstName takes value for first name
	 * @param lastName takes value for last name
	 * @param gender takes value for gender
	 * @param birthYear takes value for birth year
	 * @param currentYear takes value for current yea
	 * @param height takes value for height
	 * @param weight takes value for weight
	 */
	MyHealthData(String firstName,String lastName, String gender, int birthYear, int currentYear, double height, double weight)
	{
		this.firstName= firstName;
		this.lastName= lastName;
		this.gender= gender;
		this.birthYear= birthYear;
		this.currentYear= currentYear;
		this.height= height;
		this.weight= weight;
	}

	//TO DO 3: INCLUDE YOUR SET AND GET METHODS HERE. CHECK THE UML CLASS TO ENSURE ALL ARE COMPLETE. SOME ARE ALREADY PROVIDED FOR YOU BELOW.
	/**
	 * setter function to set the value for firstName.
	 * @param firstName takes value for first name
	 */
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}
	/**
	 * getter function to return the value of firstName
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * setter function to set the value for lastName.
	 * @param lastName takes value for first name
	 */
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	/**
	 * getter function to return the value of lastName
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * setter function to set the value for gender.
	 * @param gender takes value for first name
	 */
	public void setGender(String gender) {
		this.gender= gender;
	}
	/**
	 * getter function to return the value of gender
	 * @return gender
	 */
	public String getGender()
	{
		return gender;
	}
	/**
	 * setter function to set the value for birthYear
	 * @param birthYear takes value for first name
	 */
	public void setBirthYear(int birthYear) {
		this.birthYear= birthYear;
	}
	/**
	 * getter function to return the value of birthYear
	 * @return birthYear
	 */
	public int getBirthYear() {
		return birthYear;
	}
	/**
	 * setter function to set the value for currentYear
	 * @param currentYear takes value for first name
	 */
	public void setCurrentYear(int currentYear) {
		this.currentYear= currentYear;
	}
	/**
	 * getter function to return the value of currentYear.
	 * @return currentYear
	 */
	public int getCurrentYear() {
		return currentYear;
	}
	/**
	 * setter function to set the value for height
	 * @param height takes value for first name
	 */
	public void setHeight(double height) {
		this.height= height;
	}
	/**
	 * getter function to return the value of height
	 * @return height
	 */
	public double getHeight() {
		return height;
	}
	/**
	 * setter function to set the value for weight
	 * @param weight takes value for first name
	 */
	public void setWeight(double weight) {
		this.weight= weight;
	}
	/**
	 * getter function to return the value of weight
	 * @return weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * function to calculate and return the age
	 * @return age
	 */
	public int getAge() {
		int age=currentYear-birthYear;
		return age;
	}
	/**
	 * function to calculate and return the maximum heart rate
	 * @return heartRate
	 */
	public int maximumHeartRate() {
		int heartRate=220-getAge();
		return heartRate;
	}
	/**
	 * function to calculate and return the maximum target heart rate
	 * @return maximumTargetHeartRate
	 */
	public double maximumTargetHeartRate() {
		double maximumTargetHeartRate=0.5*(maximumHeartRate());
		return maximumTargetHeartRate;
	}
	/**
	 * function to calculate and return the minimum target heart rate
	 * @return minimumTargetHeartRate
	 */
	public double minimumTargetHeartRate() {
		double minimumTargetHeartRate=0.85*(maximumHeartRate());
		return minimumTargetHeartRate;
	}
	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!
	/**
	 * function to calculate and return the BMI
	 * @return BMI
	 */
	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION

	/**
	 * Function to generate the report
	 */
	public void displayMyHealthData() 
	{ 

	//TO DO 5: HINT: YOU MUST USE System.out.printf TO SHOW ALL HEALTH DATA. DO NOT MISS ANY ITEM.
	   
		System.out.printf("Hello %s %s. Your Details are:%n",getFirstName(),getLastName());
		System.out.printf("Name: %s %s%n",getFirstName(),getLastName());
		System.out.printf("Gender:%s%n",getGender());
		System.out.printf("Year of Birth:%d%n",getBirthYear());
		System.out.printf("Height(inches):%f%n",getHeight());
		System.out.printf("Weight(pounds):%f%n",getWeight());
		System.out.printf("Age:%d%n",getAge());
		System.out.printf("BMI:%f%n", getBMI());
		System.out.printf("Maximum Heart Rate:%s%n", maximumHeartRate());
		System.out.printf("Target Heart Rate(Min-Max):%f-%f%n",maximumTargetHeartRate(),minimumTargetHeartRate());
	    
	//DO NOT MODIFY THIS PROTION OF CODE. IT SHOULD PRINT AS IT IS - ALREADY PROVIDED FOR YOU!!

	   System.out.println("BMI VALUES");
	   System.out.println("Underweight: less than 18.5");
	   System.out.println("Normal:      between 18.5 and 24.9");
	   System.out.println("Overweight:  between 25 and 29.9");
	   System.out.println("Obese:       30 or greater");
	   
	} 

	} // end class MyHealthData

