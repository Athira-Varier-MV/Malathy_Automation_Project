package page;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
public class MalathySilks
{
	WebDriver driver;
	By Logo=By.xpath("//*[@id=\"header\"]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[2]/div/a/span/img");
	By Home=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[2]/div[1]/div[3]/nav[1]/ul[1]/li[1]/a[1]");
	By AboutUs=By.xpath("//*[@id=\"menu-menu-1\"]/li[2]");
	By categories=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[3]/nav/ul/li[2]/a");
	By Kaftan=By.xpath("//*[@id=\"menu-menu-1\"]/li[2]/ul/li[4]");
	By selectedkaftan=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[7]/div/div[1]/a/img[2]");
	By addcart=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[7]/div/div[1]/div[2]/a");
	By cart=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[6]/div[3]");
	By view_cart=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[6]/div[2]/div[2]/div[2]/div/div/div/div/p[2]/a[1]");
	By search=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[4]/div[1]/a");
	By itemsearch=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[4]/div[1]/div/form/input");
	By wishlist=By.xpath("/html/body/div[2]/div[2]/div/div/main/div/div/div[2]/div/div[2]/div[2]/div[4]/div/div[1]/div[1]/div/a");
	By shop=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[3]/nav/ul/li[3]/a");
	By selectedItem=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[10]/div/div[1]/a/img[2]");
	By AddBag=By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[3]/div[2]/div[10]/div/div[1]/div[2]");	
	//By remove_item=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div[2]/div[1]/form/table/tbody/tr[2]/td[1]/a/div");
	By contact=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[1]/div/div[3]/nav/ul/li[4]");
	//By page=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/section[1]/nav[1]/ul[1]/li[9]");
	By req_name=By.xpath("//*[@id=\"wpcf7-f43201-p43203-o1\"]/form/div[2]/div[1]/div/p/span/input");
	By req_email=By.xpath("//*[@id=\"wpcf7-f43201-p43203-o1\"]/form/div[2]/div[2]/div/p/span/input");
	By req_phone=By.xpath("//*[@id=\"wpcf7-f43201-p43203-o1\"]/form/div[2]/div[3]/div/p/span/input");
	By req_message=By.xpath("//*[@id=\"wpcf7-f43201-p43203-o1\"]/form/div[2]/div[4]/div/p/span/textarea");
	By req_submit=By.xpath("/html/body/div[2]/div[2]/div/div/section[2]/div/div[2]/div/section[3]/div/div/div/div[3]/div/div/div/form/div[2]/div[5]/div/p/span/input");
	By privacy=By.xpath("/html[1]/body[1]/div[2]/footer[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]");
	By about=By.xpath("/html/body/div[2]/footer/div/section[1]/div/div[1]/div/div[2]/div/ul/li[2]/a");
	By wishClick=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[2]/div[1]/div[5]/a[1]");	
	By payment=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[2]/div[1]/div[6]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/p[2]/a[2]/span[1]");
	By Bill_name=By.id("billing_first_name");
	By Bill_country=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/form/div[1]/div[1]/div/div/p[4]/span/select");
	By Bill_address=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/form/div[1]/div[1]/div/div/p[5]/span/input");
	By Bill_city=By.id("billing_city");
	By Bill_state=By.xpath("//*[@id=\"billing_state\"]");
	By Bill_pin=By.id("billing_postcode");
	By Bill_phone=By.id("billing_phone");
	By Bill_email=By.id("billing_email");
	By Bill_placeorder=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/button[1]");
	By login=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[4]/div[2]/nav/ul/li/a");
	By register=By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]");
	By reg_name=By.id("reg_username");
	By reg_email=By.id("reg_email");
	By reg_pass=By.id("reg_password");
	By reg_button=By.name("register");
	By signin_name=By.id("username");
	By signin_pass=By.id("password");
	By rememberme=By.id("rememberme");
	By login_button=By.name("login");
	By profile=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[4]/div[2]");
	By wish=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/nav[1]/ul[1]/li[6]");
	By AddCart=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/form/table/tbody/tr/td[7]/button");
	By ReturnToShop=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/div/p[2]");
	By accountdetails=By.xpath("/html/body/div[2]/div[2]/div/div/section/div/div/div/div/div/div/nav/ul/li[5]/a");
	By account_fname=By.xpath("//*[@id=\"account_first_name\"]");
	By account_lname=By.xpath("//*[@id=\"account_last_name\"]");
	By current_pass=By.name("password_current");
	By new_pass=By.xpath("//*[@id=\"password_1\"]");
	By confirm_newpass=By.xpath("//*[@id=\"password_2\"]");
	By save_changes=By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/p[5]/button[1]");
	
	By logout=By.xpath("//a[contains(text(),'Log out')]");
	By menus=By.xpath("/html/body/div[2]/div[1]/div/div/section[2]/div/div/div/section/div/div/div/div/div/header[2]/div/div[3]/nav");
	public MalathySilks(WebDriver driver)
	{
		this.driver=driver;
	}
	public void logopresent()
	{
		boolean s=driver.findElement(Logo).isDisplayed();
		if(s)
		{
			System.out.println("Logo present");
		}
		else
		{
			System.out.println("Logo not present");
		}
	}
	public void register(String name,String email,String password)
	{
		driver.findElement(login).click();
		driver.findElement(register).click();
		driver.findElement(reg_name).sendKeys(name);
		driver.findElement(reg_email).sendKeys(email);
		driver.findElement(reg_pass).sendKeys(password);
		driver.findElement(reg_button).click();
	}
	public void login() throws Exception
	{
		driver.findElement(login).click();
		/*driver.findElement(signin_name).sendKeys("aryadas24@yahoo.com");
		driver.findElement(signin_pass).sendKeys("Aryadas@123");
		driver.findElement(rememberme).click();
		driver.findElement(login_button).click();*/
		File f=new File("C:\\Users\\kapil\\OneDrive\\Desktop\\Userdata.xlsx");
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("Sheet1");
		System.out.println(sh.getLastRowNum());
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(username);
			String psswrd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(psswrd);
			driver.findElement(By.id("username"));
			
			driver.findElement(signin_name).clear();
			driver.findElement(signin_name).sendKeys(username);
			driver.findElement(signin_pass).clear();
			driver.findElement(signin_pass).sendKeys(psswrd);
			driver.findElement(rememberme).click();
			driver.findElement(login_button).click();
			driver.findElement(profile).click();
			String actualural=driver.getCurrentUrl();
			System.out.println(actualural);
			String expected="https://malathisilks.com/my-account/";
			if(actualural.equals(expected))
			{
				System.out.println();
				System.out.println();
				System.out.println("Login pass");
				System.out.println();
				System.out.println();
			}
			else
			{
				System.out.println("Login failed");
			}
		}
		
	}
	
	public void categories()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Actions act1=new Actions(driver);
		WebElement catog=driver.findElement(categories);
		act1.moveToElement(catog).build().perform();
		driver.findElement(Kaftan).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Actions act2=new Actions(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)","");
		WebElement skaftan=driver.findElement(selectedkaftan);
		act2.moveToElement(skaftan).build().perform();
	}
	public void Addcart()
	{
		driver.findElement(addcart).click();
		driver.findElement(cart).click();
		driver.findElement(view_cart).click();	
	}
	public void search()
	{
		driver.navigate().refresh();
		driver.findElement(search).click();
		driver.findElement(itemsearch).sendKeys("Fabrics",Keys.ENTER);
		driver.findElement(wishlist).click();
	}
	public void profile()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().refresh();
		driver.findElement(profile).click();
		driver.findElement(wish).click();
		driver.findElement(AddCart).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.navigate().to("https://malathisilks.com/shop/");
		
	}
	public void shop() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.navigate().refresh();
		//driver.findElement(shop).click();
		JavascriptExecutor js1=(JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,1100)", "");
		Actions act4=new Actions(driver);
		WebElement item1=driver.findElement(selectedItem);
		act4.moveToElement(item1).build().perform();
		Actions act5=new Actions(driver);
		WebElement bag=driver.findElement(AddBag);
		act4.moveToElement(bag).build().perform();
		bag.click();
		driver.findElement(cart).click();	
		driver.findElement(view_cart).click();
		JavascriptExecutor js5=(JavascriptExecutor) driver;
		js5.executeScript("window.scrollBy(0,1100)","");
		File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshot, new File("./ScreenShots//full.png"));
	}
	public void contact()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.findElement(contact).click();
		driver.navigate().refresh();
		JavascriptExecutor js3=(JavascriptExecutor) driver;
		js3.executeScript("window.scrollBy(0,5000)", "");
		driver.findElement(req_name).sendKeys("Aradhya P S");
		driver.findElement(req_email).sendKeys("psaradhya@gmail.com");
		driver.findElement(req_phone).sendKeys("8998745214");
		driver.findElement(req_message).sendKeys("I tried to call you in the number provided but didn't pick. How will reach the place?");
		driver.findElement(req_submit).submit();
	}
	public void passwordchange()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	//	driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/header[2]/div[1]/div[4]/div[2]/span[1]/a[1]")).click();
		driver.navigate().to("https://malathisilks.com/my-account/");
		driver.findElement(accountdetails).click();
		driver.findElement(account_fname).clear();
		driver.findElement(account_fname).sendKeys("Arya Sree");
		driver.findElement(account_lname).clear();
		driver.findElement(account_lname).sendKeys("Das");
		driver.findElement(current_pass).sendKeys("Aryadas@123");
		driver.findElement(new_pass).sendKeys("Aryadas@123");
		driver.findElement(confirm_newpass).sendKeys("Aryadas@123");
		driver.findElement(save_changes).sendKeys(Keys.ENTER);
	}
	public void logout()
	{
		driver.findElement(logout).click();
	}
	public void LinkAndMenu()
	{
		List<WebElement> m=driver.findElements(menus);
		for(WebElement men:m)
		{
			String menustr=men.getText();
			System.out.println("Menus");
			System.out.println("--------------");
			System.out.println(menustr );
		}
	}
}
