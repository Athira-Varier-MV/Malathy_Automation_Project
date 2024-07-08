package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.MalathySilks;
public class MalathyTest 
{
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void get()
	{
		driver.get("https://malathisilks.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void test() throws Exception
	{
		MalathySilks msm1=new MalathySilks(driver);
		msm1.logopresent();
		msm1.register("Arya Das","aryadas24@yahoo.com","Aryadas@123");
		msm1.login();
		msm1.categories();
		msm1.Addcart();
		msm1.search();
		msm1.profile();
		msm1.shop();
	}
	@Test
	public void test2()
	{
		MalathySilks msm1=new MalathySilks(driver);
		msm1.LinkAndMenu();
	}
	@Test
	public void test3()
	{
		MalathySilks msm1=new MalathySilks(driver);
		msm1.passwordchange();
		msm1.logout();
	}
}
