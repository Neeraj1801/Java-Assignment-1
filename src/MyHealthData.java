
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


	// TO DO 2: INCLUDE YOUR CONSTRUCTOR HERE 
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
	public void setFirstName(String firstName) {
		this.firstName= firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setLastName(String lastName) {
		this.lastName= lastName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setGender(String gender) {
		this.gender= gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setBirthYear(int birthYear) {
		this.birthYear= birthYear;
	}
	public int getBirthYear() {
		return birthYear;
	}
	public void setCurrentYear(int currentYear) {
		this.currentYear= currentYear;
	}
	public int getCurrentYear() {
		return currentYear;
	}
	public void setHeight(double height) {
		this.height= height;
	}
	public double getHeight() {
		return height;
	}
	public void setWeight(double weight) {
		this.weight= weight;
	}
	public double getWeight() {
		return weight;
	}
	public int getAge() {
		int age=currentYear-birthYear;
		return age;
	}
	public int maximumHeartRate() {
		int heartRate=220-getAge();
		return heartRate;
	}
	public double maximumTargetHeartRate() {
		double maximumTargetHeartRate=0.5*(maximumHeartRate());
		return maximumTargetHeartRate;
	}
	public double minimumTargetHeartRate() {
		double minimumTargetHeartRate=0.85*(maximumHeartRate());
		return minimumTargetHeartRate;
	}
	// THIS RETURNS THE PATIENT'S Body Mass Index (BMI) AND IT IS PROVIDED HERE FOR YOU. DO NOT CHANGE THIS PIECE OF CODE!

	public double getBMI() {
	   return (getWeight() * 703) / (getHeight() * getHeight());
	} 

	// TO DO 4: THIS PORTION OF CODE SHOULD DISPLAY ALL THE PATIENT'S HEALTH DATA. DO NOT MISS ANY DATA / INFORMATION


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

