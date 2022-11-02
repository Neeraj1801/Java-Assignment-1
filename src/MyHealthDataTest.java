import java.util.Scanner;

public class MyHealthDataTest {
	public static void main(String []args)
	{
		MyHealthData healthData= new MyHealthData("Neeraj","Katewa","Male",2000,2022,70.0,176.0);
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String firstName=scan.next();
		healthData.setFirstName(firstName);
		System.out.println("Enter Last Name:");
		String lastName=scan.next();
		healthData.setLastName(lastName);
		System.out.println("Enter Gender:");
		String gender=scan.next();
		healthData.setGender(gender);
		System.out.println("Enter Birth Year:");
		int birthYear= scan.nextInt();
		healthData.setBirthYear(birthYear);
		System.out.println("Enter Current Year:");
		int currentYear= scan.nextInt();
		healthData.setCurrentYear(currentYear);
		System.out.println("Enter Height(in inches):");
		double height= scan.nextDouble();
		healthData.setHeight(height);
		System.out.println("Enter Weight(in pounds):");
		double Weight= scan.nextDouble();
		healthData.setWeight(Weight);
		healthData.displayMyHealthData();
		scan.close();
	}

}
