package PaymentDetails;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import PageBeanFactory.PaymentPageFactory;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PaymentStepDef {
	WebDriver driver;
	private PaymentPageFactory pfact;
	
	@Given("^User is on payment page$")
	public void user_is_on_registration_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver=new FirefoxDriver();
		 Thread.sleep(1000);
		 pfact= new PaymentPageFactory(driver);
		 driver.get("file:///D:/Module%203/BDD%20MPT%20case%20study/PaymentDetails.html");
	}
	
	@When("^User does not enter card holder name$")
	public void user_does_not_enter_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //How new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("");
		Thread.sleep(1000);
		pfact.setPayment();
		Thread.sleep(1000); 
	}

	@Then("^prompt user to fill in card holder name$")
	public void prompt_user_to_fill_in_card_holder_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
			pfact.setCardHoldName("Shruti Shukla");
	}

	@When("^User does not enter debit card number$")
	public void user_does_not_enter_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("Shruti Shukla");
		Thread.sleep(1000);
		pfact.setDebit("");
		Thread.sleep(1000);
		pfact.setPayment();
	}

	@Then("^prompt user to enter debit card number$")
	public void prompt_user_to_enter_debit_card_number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    Thread.sleep(1000);
	    pfact.setDebit("7896542315664");
	}

	@When("^User does not enter card cvv$")
	public void user_does_not_enter_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("Shruti Shukla");
	    pfact.setDebit("7896542315664");
	    pfact.setCvv("");
	    pfact.setPayment();
	    
	}
	@Then("^prompt user to enter card cvv$")
	public void prompt_user_to_enter_card_cvv() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    pfact.setCvv("322");
	}

	
	
	@Given("^User is on registration card expiration month$")
	public void user_is_on_registration_card_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("Shruti Shukla");
	    pfact.setDebit("7896542315664");
	    pfact.setCvv("322");
	    pfact.setMonth("");
	    pfact.setPayment();
	}

	@Then("^prompt user to enter card expiration month$")
	public void prompt_user_to_enter_card_expiration_month() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    pfact.setMonth("12");
		
	}


	@When("^User does not enter card expiration year$")
	public void user_does_not_enter_card_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("Shruti Shukla");
	    pfact.setDebit("7896542315664");
	    pfact.setCvv("322");
	    pfact.setMonth("12");
	    pfact.setYear("");
	    pfact.setPayment();
	}

	@Then("^prompt user to enter card expiration year$")
	public void prompt_user_to_enter_card_expiration_year() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.switchTo().alert();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    pfact.setYear("2023");
	    
		
	}
	

	@When("^User clicks on confirmregistration button$")
	public void user_clicks_on_confirmregistration_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		driver.manage().window().maximize();
		pfact.setCardHoldName("Shruti Shukla");
	    pfact.setDebit("7896542315664");
	    pfact.setCvv("322");
	    pfact.setMonth("12");
	    pfact.setYear("2023");
	    pfact.setPayment();
	}




@Then("^display registration successful$")
public void display_registration_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	display_registration_successful();
}



}
