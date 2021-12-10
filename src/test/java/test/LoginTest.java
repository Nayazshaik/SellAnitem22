package test;

import org.testng.annotations.Test;

import com.sellanitem.generic.PropertyReader;

import pages.LoginPage;




	public class LoginTest extends BaseTest {
		LoginPage ref=new LoginPage();
		//LoginPage ref2=new LoginPage();
		//AdminPage a1=new AdminPage();
		@Test
		public void verifyLogin() throws InterruptedException {
		ref.OpenWebsite();
		PropertyReader.initProperty();
		//ref.Username(PropertyReader.getProperty("add.Email"));
		//ref.Password(PropertyReader.getProperty("add.Password"));
		ref.sellclick();
		ref.createyourListingclick();
		ref.Search(PropertyReader.getProperty("add.telluswhatyouareselling"));
        ref.searchbuttonclick();
       ref.Veiwpossiblematchesclick();
       ref.usedclick();
       ref.Nextclick();
       Thread.sleep(20000);
      //ref.UserNameclick();
       ref.Search(PropertyReader.getProperty("add.Username"));
      ref.passclick();
       Thread.sleep(10000);
       ref.clickcontinue1();
       ref.Search(PropertyReader.getProperty("add.password"));
       Thread.sleep(10000);
       ref.clicksignin();
      		}
	}
