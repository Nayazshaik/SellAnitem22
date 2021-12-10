package test;
import org.testng.annotations.BeforeTest;

import com.sellanitem.generic.DriverUtils;



	public class BaseTest {
		@BeforeTest
		public void setUp() {
			DriverUtils.createDriver();
			System.out.println("driver created");
		}
		}

