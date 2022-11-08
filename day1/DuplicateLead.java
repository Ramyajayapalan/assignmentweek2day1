package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		//Download the ChromeDriver and set its path
		WebDriverManager.chromedriver().setup();
		//Launch a browser
		ChromeDriver driver=new ChromeDriver();
		//Launch a URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Adding Implicit Wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Maximize the browser
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get tittle page
		driver.getTitle();
		System.out.println("title");
		//clickcrmsfa
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click on lead button
		driver.findElement(By.linkText("Leads")).click();
		//creat lead
		driver.findElement(By.linkText("Create Lead")).click();
		//enter compnay name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TESTLEAF");
		//enter firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramya");
		//enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jayapalan");
		//creat local name
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RJ");
		//create department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("marketing");
		//create describtion
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description field");
		//create gmail
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ramyasri381@gmail.com");
		//submit button
		driver.findElement(By.name("submitButton")).click();
		//get the title resulting page
		System.out.println("view Lead | opentaps CRM");
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("rams");
		driver.findElement(By.name("submitButton")).click();
		

	}

}
