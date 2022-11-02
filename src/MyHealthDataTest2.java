import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MyHealthDataTest2 {
	static double delta=0.000001;
	@Test
	public void testGetBMI() {
		MyHealthData health= new MyHealthData("Neeraj","Katewa","Male",2000,2022,67.0,120.0);
		double actualBMI=18.792604;
		double expectedBMI=health.getBMI();
		Assert.assertEquals(actualBMI,expectedBMI,delta);
	}

}
