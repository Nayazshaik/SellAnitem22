package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class  LoginPage extends BasePage {


@FindBy(xpath="//*[@id=\"gh-p-2\"]/a")
	private WebElement btnsell;
	
	@FindBy(xpath = "//*[@id=\"image_banner_1\"]/div/div/a")
	private WebElement createyourListing;

	
	//input[@id='s0-0-0-30-9-keyword-box-input-textbox']
	@FindBy(id="s0-0-0-30-9-keyword-box-input-textbox")
	private WebElement telluswhatyouareselling;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div/div[1]/button")
	private WebElement button;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div/div[2]/button")
	private WebElement veiwpossiblematches;

	@FindBy(xpath = "//*[@id=\"s0-0-0-30-14-3-6-condition-3000\"]")
	private WebElement used;

	@FindBy(xpath = "//*[@id=\"mainContent\"]/div/div/div[2]/button")
	private WebElement Next;
	
	
	//@FindBy(xpath="//input[@autocomplete='username']")
	//private WebElement Email;
	@FindBy(id="userid")
	private WebElement unTB;

	@FindBy(id="signin-continue-btn")
	private WebElement signin;
	@FindBy(id="pass")
	private WebElement click2;
	
	
	@FindBy(id="pass")
	private WebElement password;
	
	
	@FindBy(id="sgnBt")
	private WebElement sign_in;
	
	
	public void SelectRole(WebElement userRoleSelect)
	{
		Select slt = new Select(userRoleSelect);
		slt.selectByVisibleText("India");
	}
	
	@FindBy(id="address1")
	private WebElement adress;
	
	@FindBy(id="address2")
	private WebElement adress2;

	public void SelectRole2(WebElement userRoleSelect)
	{
		Select slt2 = new Select(userRoleSelect);
		slt2.selectByVisibleText("Andra Pradesh");
	}
	@FindBy(id="zip")
	private WebElement pincode;
	public void SelectRole3(WebElement userRoleSelect)
	{
		Select slt3 = new Select(userRoleSelect);
		slt3.selectByVisibleText("India +91");
	}
	
	@FindBy(id="phoneFlagComp1")
	private WebElement phone;
	
	@FindBy(id="sbtBtn")
	private WebElement Continue;
	
	@FindBy(id="//*[@id=\"w0-find-product-search-bar-search-field\"]")
	private WebElement search;
	
	@FindBy(id="//*[@id=\"w0-find-product-search-bar-search-button\"]")
	private WebElement Getstarted;
	
	
	@FindBy(id="//*[@id=\"upl-1639033455257\"]")
	private WebElement Addphotos;
	
	
	

	@FindBy(id="//*[@id=\"actionbar\"]/input[1]")
	private WebElement listitem ;


	//Utilization
	public void OpenWebsite()
	{
		//https://vmp.ebay.com/login.aspx
		driver.get("https://www.ebay.com/");
	}
	
	public void sellclick() {
		// TODO Auto-generated method stub
		btnsell.click();
	}
	public void createyourListingclick() {
		// TODO Auto-generated method stub
		createyourListing.click();
	}
	public void Search(String se ) {
		// TODO Auto-generated method stub
	
		telluswhatyouareselling.sendKeys(se);
		}
	public void searchbuttonclick() {
		// TODO Auto-generated method stub
		button.click();
	}
	public void Veiwpossiblematchesclick()  {
		// TODO Auto-generated method stub
	
	 veiwpossiblematches.click();
	}
	public void usedclick()  {
		// TODO Auto-generated method stub
	
	 used.click();
	}
	public void Nextclick()  {
		// TODO Auto-generated method stub
	
	 Next.click();
	}
	//public void UserNameclick()
	//{
		//Email.click();
	//}
	public void Username(String un)
	{
		unTB.sendKeys(un +Keys.ENTER);
	}
	public void clickcontinue1()
	{
		signin.click();
	}
	public void passclick()
	{
		click2.click();
	}

	public void Password(String pw)
	{
	password.sendKeys(pw );
	}

	public void clicksignin()
	{
		sign_in.click();
	}
	

	public void Action(WebElement createyouListing)
	{
	//Actions act = new Actions(driver);
	//act.moveToElement(btnadmin).perform();;
	//act.moveToElement(btnum).perform();;
	btnsell.click();
	createyouListing.click();
	telluswhatyouareselling.click();
	veiwpossiblematches.click();
	//Email.click();
	unTB.click();
	signin.click();
	password.click();
	sign_in.click();
	
	//Getstarted.click();
	//Addphotos.click();
	}
	
	}





