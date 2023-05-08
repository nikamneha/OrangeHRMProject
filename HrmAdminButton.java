package com.orangehrm.project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HrmAdminButton {
	WebDriver driver;
    @BeforeClass
	public void beforeTestExecution() {
    	driver =new ChromeDriver();
    	driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
	void afterTestExecution() {
     	driver.quit();
	}
    @Test(priority=1) 
	public void TestCase1() {
		try {

			driver.findElement(By.name("username")).sendKeys("Admin");  //Username
			Thread.sleep(3000);
			driver.findElement(By.name("password")).sendKeys("admin123");   //Password
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();  //Login
			Thread.sleep(4000);
	     	driver.switchTo().alert().accept();
			Thread.sleep(3000);
			
			//Click on Admin Button
//	        driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
//	        Thread.sleep(3000);
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
    @Test(priority=2)
	public void Testcase2()
	{
		try {
		//Click on Admin Button
	     driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
	     Thread.sleep(3000);
	        
		//Enter Nationalities details
		driver.findElement(By.xpath("//a[@class='oxd-topbar-body-nav-tab-item']")).click();
		
		//Click on Add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		//Enter Country name
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'] )[2]")).sendKeys("USA");
		Thread.sleep(3000);
		
		//click on save button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
		
		}catch(Exception e) {
			
		}
	}
    @Test(priority=3)
	public void Testcase3()
	{
		try {
		
		//Click on Edit Button
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[3]/div/div/div[32]/div/div/div/div[2]/div/div/button[2]/i")).click();
		Thread.sleep(2000);
		
		//Edit Country name
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Africa");
		Thread.sleep(3000);
		
		//Click on save
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
		
			
			
		}catch(Exception e) {
			
		}
	}
    @Test(priority=4)
   	public void Testcase4()
   	{
   		try {
   		//Delete button
   		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
   		Thread.sleep(2000);
   		//Click on yes delete button
   		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
   		Thread.sleep(2000);
   		   		
   		
   			
   			
   		}catch(Exception e) {
   			
   		}
   	}
    @Test(priority=5)
    public void TestCase5()
    {
    	try {
    		//Click on Job Button
    		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
    		Thread.sleep(3000);
    		
    		//Select Job title
    		driver.findElement(By.linkText("Job Titles")).click();
    		Thread.sleep(3000);
    		
    		//Click on Add Button
    		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus oxd-button-icon']")).click();
    		Thread.sleep(3000);
    	    
    		//Enter Job Title
    		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Project Manager");
    		Thread.sleep(3000);
    		
    		//Job Description
    		driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("achieving a company's goals and achieving their vision.");
    		Thread.sleep(3000);
    		
    		//Enter Note
    		driver.findElement(By.xpath("//textarea[@placeholder='Add note']")).sendKeys("A project manager is accountable for planning and allocating resources,");
    		Thread.sleep(3000);
    		
    		//Click on Save Button
    		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
    		Thread.sleep(3000);
    		
    		
    		
    	}catch(Exception e) {
    		
    	}
    }
    @Test(priority=6)
   	public void Testcase6()
   	{
   		try {
   		//Delete button
   		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
   		Thread.sleep(2000);
   		//Click on yes delete button
   		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
   		Thread.sleep(2000);
   		   		
   		
   			
   			
   		}catch(Exception e) {
   			
   		}
   	}
    @Test(priority=7)
	public void Testcase7()
	{
		try {
				
		//Click on Edit Button
		driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[2]")).click();
		Thread.sleep(2000);
		
	     //Edit Job Title
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("IT Manager");
		Thread.sleep(3000);
		
		//Click on save
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
		Thread.sleep(3000);
		
		
			
		}catch(Exception e) {
			
		}
	}
    @Test(priority=8)
	public void Testcase8()
	{
		try {
			//Click on Job Button
    		driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
    		Thread.sleep(3000);
    		
    		//Select Pay Grades
    		driver.findElement(By.linkText("Pay Grades")).click();
    		Thread.sleep(3000);
    		
    		//Click on Add Button
    		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
    		Thread.sleep(3000);
    		
    		//Enter Grade
    		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Grade D");
    		Thread.sleep(3000);
    		
    		//Click on Save
    		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
    		Thread.sleep(3000);
    		
		   }catch(Exception e) {
			
		}
	}
    @Test(priority=9)
   	public void TestCase9() {
   		try {
   		//Click on Job Button
    	driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[2]")).click();
    	Thread.sleep(3000);
    		
    	//Select Employment Status
    	driver.findElement(By.linkText("Employment Status")).click();
   		Thread.sleep(3000);
   		
   		//Click on Add Button
   		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
   		Thread.sleep(3000);
   		
   		//Enter Employment status
   		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Private Employee");
    	Thread.sleep(3000);
    	
    	//Click on Save button
    	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
   		Thread.sleep(3000);
   	
   	
   	}catch(Exception e) {
   			
   		}
   	}
    @Test(priority=10)
    void TestCase10()
    {
      try {

       //click on UserManagement
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/span/i")).click();
      Thread.sleep(3000);
     
      //Select User from dropdown
      driver.findElement(By.linkText("Users")).click();
      Thread.sleep(3000);
     
      //Enter details to search User
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
	  Thread.sleep(3000);
		
	  
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
}
    @Test(priority=11)
	public void TestCase11() {
		try {
	//Enter details to Reset User
	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).sendKeys("Paul  Collings");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--ghost']")).click();
	Thread.sleep(3000);
	
	}catch(Exception e) {
			
		}
	}
    @Test(priority=12)
	public void TestCase12()
	{
		try {
	//Click on Add button		
	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	Thread.sleep(3000);
	

	//Enter Employee Name
	driver.findElement(By.xpath("//div[@class='oxd-autocomplete-text-input oxd-autocomplete-text-input--active']")).sendKeys("Petter");
	Thread.sleep(3000);
	
	//Enter username
	driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Michael J");
	Thread.sleep(3000);
		
	//Enter Password
	driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("Admin@23");
	driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Admin@23");
	Thread.sleep(3000);
		

	
	//Select User Role
	String Optionofrole ="Admin";
	driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
	List<WebElement>Userrole=driver.findElements(By.xpath("//div[@role='listbox']"));
 	for(WebElement option:Userrole) {
		String CurrentOption = option.getText();
  		if(CurrentOption.contains(Optionofrole))
  		{
  			option.click();
 			break;
  		}
  	}
  	
	Thread.sleep(3000);
	
	//Select Status
	String Optionofstatus ="Enabled";
	driver.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
	List<WebElement>Status=driver.findElements(By.xpath("//div[@role='listbox']"));
      for(WebElement option:Status) {
		String GivenOption = option.getText();
		  	if(GivenOption.contains(Optionofstatus))
		  		{
		  			option.click();
		  			break;
		  		}
		  	}	  	
	Thread.sleep(3000);
	
	//Click on Save button
	driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	
	}catch(Exception e) {
			
		}
	}
    @Test(priority=13)
   	public void TestCase13()
   	{
   		try {
   		//Click on Qualification 
   	      driver.findElement(By.xpath("(//span[@class='oxd-topbar-body-nav-tab-item'])[4]")).click();
   	      Thread.sleep(3000);
   	     
   	      //Select from dropdown
   	      driver.findElement(By.linkText("Skills")).click();
   	      Thread.sleep(3000);	
   	      
   	      //Click on Add Button
   	      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
   	      Thread.sleep(3000);
   	      
   	      //Enter Skill Name in text box
   	      driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Core Java");
	      Thread.sleep(3000);
   		
	      //Enter Description in the text box
	      driver.findElement(By.xpath("//textarea[@placeholder='Type description here']")).sendKeys("Java programming language");
	      Thread.sleep(2000);
	      
	      //Click on Save Button
	      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	      Thread.sleep(2000);
	      
	      //Click on Delete Button
	      driver.findElement(By.xpath("(//i[@class='oxd-icon bi-trash'])[1]")).click();
   	      Thread.sleep(3000);
   	      
   	      //Click on Yes Delete button
   	      driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
   	      Thread.sleep(3000);
	      
   			
   		}catch(Exception e) {
   			
   		}
    
	
    
		}
    
}
		
		


