package ConfRegs;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageBeanFactory.ConfRegsPageBean;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef {
	
	WebDriver driver;
	private ConfRegsPageBean factory;
	
	
	@Given("^User is on registration page$")
	public void user_is_on_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver=new FirefoxDriver();
		 Thread.sleep(1000);
		 factory= new ConfRegsPageBean(driver);
		 driver.get("file:///D:/Module%203/BDD%20MPT%20case%20study/ConferenceRegistartion.html#");
	}

	@Then("^check the heading of page$")
	public void check_the_heading_of_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		String heading=driver.findElement(By.xpath("html/body/h2")).getText();
		if(heading.equals("Conference Registration")) {
			System.out.println("Heading matched");
		}
		else
			System.out.println("Heading does not matched");
	}

	@When("^User does not enter firstname$")
	public void user_does_not_enter_firstname_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("");
		factory.setNext();
		
		Thread.sleep(1000);
		
		
	}

	@Then("^prompt user to fill in details$")
	public void prompt_user_to_fill_in_details() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setfName("Shruti");
		Thread.sleep(1000);
	}

	@When("^User does not enter  lastname$")
	public void user_does_not_enter_lastname() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setlName("");
		Thread.sleep(1000);
	
	
	}
	@Then("^prompt user to fill last name$")
	public void prompt_user_to_fill_last_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setlName("Shukla");
		
	}


	@When("^User does not enter email in correct format$")
	public void user_does_not_enter_email_in_correct_format() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti");Thread.sleep(1000);
		factory.setlName("Shukla");Thread.sleep(1000);
		factory.setEmail("");Thread.sleep(1000);
		factory.setNext();
	
	}

	@Then("^prompt user to write email correctly$")
	public void prompt_user_to_write_email_correctly() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com");
		
	}

	@When("^User does not enter contact number$")
	public void user_does_not_enter_contact_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti");Thread.sleep(1000);
		factory.setlName("Shukla");Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com");
		Thread.sleep(1000);
		factory.setPhone("");
		Thread.sleep(1000);
		factory.setNext();
	}

	@Then("^prompt user to enter contact number$")
	public void prompt_user_to_enter_contact_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    factory.setPhone("9568624212");
	}

	@When("^User enters invalid contactNo format and clicks the button$")
	public void user_enters_invalid_contactNo_format_and_clicks_the_button(DataTable arg1) throws Throwable {
	   
		factory.setfName("Shruti"); Thread.sleep(1000);
		factory.setlName("Shukla"); Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com"); Thread.sleep(1000);
		
		List<String> objList = arg1.asList(String.class);
		
		
		
		for(int i=0; i<objList.size();i++) {
			
			factory.getPhone().clear();
			factory.setPhone(objList.get(i)); Thread.sleep(1000);
			
			
			driver.switchTo().alert();
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			if(Pattern.matches("^[7-9]{1}[0-9]{9}$", objList.get(i))) {
				System.out.println("*******MATCHED "+ objList.get(i)+" **************");
			}else {
				System.out.println("*******NOT MATCHED "+ objList.get(i)+" **************");
			}
				}
		factory.setNext();
	
		
		
		
		
		
		
		
		
		
	}

	@Then("^display alert msg$")
	public void display_alert_msg() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		factory.setPhone("9568624212");
		
	}
	
	

	@When("^User does not address$")
	public void user_does_not_address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti"); Thread.sleep(1000);
		factory.setlName("Shukla"); Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com"); Thread.sleep(1000);
		factory.setBuidroom("");Thread.sleep(1000);
		factory.setNext();
		
	}
	

	@Then("^prompt user to fill in the building & room no$")
	public void prompt_user_to_fill_in_the_building_room_no() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    factory.setBuidroom("Sunshine Building room no-200");
	    factory.setNext();
		
	}
	
	@When("^User does not fill area name$")
	public void user_does_not_fill_area_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti"); Thread.sleep(1000);
		factory.setlName("Shukla"); Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com"); Thread.sleep(1000);
		factory.setBuidroom("Sunshine Building room no-200");
		factory.setArea("");Thread.sleep(1000);
		factory.setNext();
		
	}
	

	@Then("^prompt user to fill in the area name$")
	public void prompt_user_to_fill_in_the_area_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setArea("Hinjewadi");
	}

	@When("^User does not select city$")
	public void user_does_not_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti"); Thread.sleep(1000);
		factory.setlName("Shukla"); Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com"); Thread.sleep(1000);
		factory.setBuidroom("Sunshine Building room no-200");Thread.sleep(1000);
		factory.setUcity("Select City");
		factory.setNext();
		
		//next 
	}
	

	@Then("^prompt user to select city$")
	public void prompt_user_to_select_city() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setUcity("Pune");
	}

	@When("^User does not select state$")
	public void user_does_not_select_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   //throw new PendingException();
		driver.manage().window().maximize();
		factory.setfName("Shruti"); Thread.sleep(1000);
		factory.setlName("Shukla"); Thread.sleep(1000);
		factory.setEmail("shruti.shukla@gmail.com"); Thread.sleep(1000);
		factory.setBuidroom("Sunshine Building room no-200");Thread.sleep(1000);
		factory.setUcity("Pune");
		Thread.sleep(1000);
		factory.setUstate("Select State");
		factory.setNext();
		
		//next
	}

	@Then("^prompt user to select state$")
	public void prompt_user_to_select_state() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		Thread.sleep(1000);
		factory.setUstate("Maharashtra");
	}
	
	

}
