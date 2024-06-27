package FunctionLibrary;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functions {
	//TC001
	//@Test
	
	public void Fun_Launch_Ocart() throws Exception
	{
		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	    
	 
	  driver.get("https://demo.opencart.com/");
	  //String x= driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/h1/a")).getText();
	  FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		Properties p=new Properties();
		p.load(r);
	  String x= driver.findElement(By.xpath(p.getProperty("launch"))).getText();
	  String y="Your Store";
	  if(x.equals(y))
	  {
		  System.out.println("User can able to launch the opencart application in firefox browser.\r\n");
	  }
	  else
	  
		  System.out.println("User is not able to launch the opencart application in firefox browser");
	  
	}
	//TC002
	public void Fun_ViewMyAccount() throws Exception
	{
		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	  driver.get("https://demo.opencart.com/");
	  FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		Properties p=new Properties();
		p.load(r);
	  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		driver.findElement(By.xpath(p.getProperty("myacc"))).click();
	  String str1="Register";
	  //String str2=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).getText();
	  String str2=driver.findElement(By.xpath(p.getProperty("reg"))).getText();
	  String str3="Login";
	 // String str4=driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[2]/a")).getText();
	  String str4=driver.findElement(By.xpath(p.getProperty("login"))).getText();
	  if(str1.equals(str2) && str3.equals(str4))
	  {
		  System.out.println("User can able to get two options Register and Login");
	  }
	  else
		  System.out.println("User not able to get two options Register and Login");
		  
		
	}
	//TC003
	public void Fun_ClickRegister() throws Exception

	{
		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	  driver.get("https://demo.opencart.com/");
	  FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		Properties p=new Properties();
		p.load(r);
	  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click(); //account
		 //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click(); //register
		driver.findElement(By.xpath(p.getProperty("myacc"))).click();
	  
		driver.findElement(By.xpath(p.getProperty("reg"))).click();
	  
	  String s1="Register Account";
	 // String s2=driver.findElement(By.xpath("/html/body/div[2]/div/div/h1")).getText();
	  String s2=driver.findElement(By.xpath(p.getProperty("register2"))).getText();
	  if(s1.equals(s2))
	  {
		  System.out.println("The user can able to click on Register and get the register page");
	  }
	  else
		  
		  System.out.println("unable to get register page");
	  
	  
	  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
	}
	//TC004
	public void Fun_CountInputBox() throws Exception
	{
		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	  driver.get("https://demo.opencart.com/");
	  FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		Properties p=new Properties();
		p.load(r);
	  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
	  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
		driver.findElement(By.xpath(p.getProperty("myacc"))).click();
		  
		driver.findElement(By.xpath(p.getProperty("reg"))).click();
	  
	  List<WebElement> L=driver.findElements(By.tagName("input"));
	  System.out.println("Count of no.of inputs "+L.size());
	  if(L.size()==9)
	  {
	  System.out.println("Test case has passed");
	  }
	  else
	  System.out.println("Test case has failed");
	  
	  
		
	}
	//TC005
	public void Fun_RegisterUser() throws Exception
	{

		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	  driver.get("https://demo.opencart.com/");
	  FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		Properties p=new Properties();
		p.load(r);
	  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
	 // driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath(p.getProperty("myacc"))).click();
	  
		driver.findElement(By.xpath(p.getProperty("reg"))).click();
	  
	  driver.findElement(By.id("input-firstname")).sendKeys("abcde");
	  driver.findElement(By.id("input-lastname")).sendKeys("vvv");
	  driver.findElement(By.id("input-email")).sendKeys("abcde.vvv@gmail.com");
	  driver.findElement(By.id("input-telephone")).sendKeys("1134567890");
	  driver.findElement(By.id("input-password")).sendKeys("blalala");
	  driver.findElement(By.id("input-confirm")).sendKeys("blalala");
	  //driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();// clicking privary policy
	 // driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]")).click();
	  driver.findElement(By.xpath(p.getProperty("policy"))).click();
	  
		driver.findElement(By.xpath(p.getProperty("continue"))).click();
	  
	  
	  /*String a="Continue";
	 // String b= driver.findElement(By.cssSelector("input.btn")).getText();
	 String b=driver.findElement(By.xpath(p.getProperty("continue"))).getText();
	  if(a.equals(b))
	  {
		  System.out.println("User can able to click on continue button  \"Your Account Has Been Created");
	  }
	  else
		  
		  System.out.println("user unable to click onto continue button");*/
	  
	  
	  
	  
	  
		
	}

	
	//TC006
	public void Fun_Login() throws Exception
	{

		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
	  
		  System.setProperty("webdriver.gecko.driver",s);
		driver = new FirefoxDriver();
		FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
		FileReader r1=new FileReader("D:\\CoreJava\\TestData.properties");
		Properties p=new Properties();
		Properties p1=new Properties();
		p.load(r);
		p1.load(r1);
		
		  //driver.get("https://demo.opencart.com/");
		  //driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
		  driver.get("https://demo.opencart.com/index.php?route=account/login");
		  driver.findElement(By.id("input-email")).click(); //able to click and send username
		 // driver.findElement(By.id("input-email")).sendKeys("gayathrisiri1314@gmail.com");
		  driver.findElement(By.id("input-email")).sendKeys(p1.getProperty("email1"));
		  //login functionality
		  driver.findElement(By.id("input-password")).click();//able to click and send password
		  driver.findElement(By.id("input-password")).sendKeys("gggggggg");
		 
		  
		  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
		  //driver.findElement(By.xpath(p.getProperty("login2"))).click();
		 
		 /*String a="Login";
		 // String b= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).getText();
		  String b= driver.findElement(By.xpath(p.getProperty("login2"))).getText();
		  if(a.equals(b))
		  {
			  System.out.println("User can able to click on Login Button ang get account page with My Account string");
		  }
		  else
			 
			  System.out.println("Unable to login");*/
	}
	//TC00_6(2)
	public void Fun_LoginInvalid() throws Exception
	{
		
		String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
		WebDriver driver;
		  
		  System.setProperty("webdriver.gecko.driver",s);
	    driver = new FirefoxDriver();
	    driver.get("https://demo.opencart.com/index.php?route=account/login");
	   // driver.findElement(By.id("input-email")).click();
	    driver.findElement(By.id("input-email")).sendKeys("gayathrisiri1314@gmail.com");
	    //login functionality
	   // driver.findElement(By.id("input-password")).click();
	    driver.findElement(By.id("input-password")).sendKeys("gggggggg");
	    
	    
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
	  
	   
		 
	    // password change
	    driver.findElement(By.xpath("/html/body/div[2]/div/aside/div/a[3]")).click();
	   //driver.findElement(By.xpath(p.getProperty("pwd"))).click();
	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("ssssssss");
	    driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("ssssssss");
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div[2]/input")).click();
	     driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
	     driver.findElement(By.id("input-password")).click();
	    driver.findElement(By.id("input-password")).sendKeys("gggggggg");
	    //driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
	   /* String s1=driver.findElement(By.xpath("/html/body/div[2]/div[1]")).getText();
	    String s2="Warning: No match for E-Mail Address and/or Password.";
	    if(s1.equals(s2))
	    {
	    	System.out.println("User can able to click on Login Button and get the Warning message saying \"Warning : No matches for Email and/or password");
	    }
	    else
	    	System.out.println("Unable to get warning message");
	    // gives incorrect password error and asks for valid password*/
	    
	     
	     
	}
	
	//TC007
	public void Fun_Logout() throws InterruptedException 
	{

	String s= "C:\\Users\\TRNG\\Downloads\\gecko\\geckodriver.exe";
	WebDriver driver;
  
	  System.setProperty("webdriver.gecko.driver",s);
    driver = new FirefoxDriver();
  driver.get("https://demo.opencart.com/index.php?route=account/account");
  driver.findElement(By.id("input-email")).click();
  driver.findElement(By.id("input-email")).sendKeys("gayathrisiri1314@gmail.com");
  driver.findElement(By.id("input-password")).click();
  driver.findElement(By.id("input-password")).sendKeys("gggggggg");
 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();
 Thread.sleep(1000);
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click();
  
  driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).click();
  /*FileReader r=new FileReader("D:\\CoreJava\\Framework.properties");
	Properties p=new Properties();
	p.load(r);
  driver.findElement(By.xpath(p.getProperty("login2"))).click();
  
	driver.findElement(By.xpath(p.getProperty("myacc"))).click();
	driver.findElement(By.xpath(p.getProperty("logout"))).click();*/
	  
 /* String a="Logout";
  String b= driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a")).getText();
  if(a.equals(b))
  {
	  System.out.println("Logedin user can able to logout from Ocart successfully");
  }
  else
  {
	  System.out.println("user couldn't logout properly");
  }*/
  
  String month[] = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };    
  String amPm[] = { "AM", "PM" };
  GregorianCalendar gcal = new GregorianCalendar();
try {
FileWriter fw=new FileWriter("D:\\CoreJava\\HybridFramework\\src\\LogInformation\\log.txt");
  fw.write("Date: "+ month[gcal.get(Calendar.MONTH)] + " "+ gcal.get(Calendar.DATE) + ", "+ gcal.get(Calendar.YEAR) + "\n"
               + "Time: "+ gcal.get(Calendar.HOUR) + ":"+ gcal.get(Calendar.MINUTE) + ":"+ gcal.get(Calendar.SECOND) + " "
               + amPm[gcal.get(Calendar.AM_PM)]);
  fw.close();
}
catch (IOException e) {
  System.out.println("exception occoured"+ e);
}
	
  }
	  

}
