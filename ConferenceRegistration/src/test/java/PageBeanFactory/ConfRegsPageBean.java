package PageBeanFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConfRegsPageBean {

	WebDriver driver;
	@FindBy(id="txtFirstName")
	WebElement fName;
	@FindBy(name="txtLN")
	WebElement lName;
	@FindBy(name="Email")
	WebElement email;
	@FindBy(id="txtPhone")
	WebElement phone;
	@FindBy(name="size")
	WebElement Usize;
	@FindBy(id="txtAddress1")
	WebElement buidroom;
	@FindBy(name="Address2")
	WebElement area;
	@FindBy(name="city")
	WebElement Ucity;
	@FindBy(name="state")
	WebElement Ustate;
	@FindBy(name="memberStatus")
	WebElement UmemStat;
	@FindBy(xpath="html/body/form/table/tbody/tr[14]/td/a")
	WebElement next;

	

	
	public WebElement getNext() {
		return next;
	}








	public void setNext() {
		next.click();
	}








	public ConfRegsPageBean(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	



	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getfName() {
		return fName;
	}
	public WebElement getlName() {
		return lName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPhone() {
		return phone;
	}
	public WebElement getUsize() {
		return Usize;
	}
	public WebElement getBuidroom() {
		return buidroom;
	}
	public WebElement getArea() {
		return area;
	}
	public WebElement getUcity() {
		return Ucity;
	}
	public WebElement getUstate() {
		return Ustate;
	}
	public WebElement getUmemStat() {
		return UmemStat;
	}
	
	
	
	
	
	
	
	
	
	

	public void setfName(String UfName) {
	fName.sendKeys(UfName); 
	}
	public void setlName(String UlName) {
		lName.sendKeys(UlName);
	}
	public void setEmail(String Uemail) {
		email.sendKeys(Uemail); 
	}
	public void setPhone(String Uphone) {
		phone.sendKeys(Uphone);
	}
	public void setUsize(String usize) {
		Select sele= new Select(Usize);
		sele.selectByValue(usize);
	}
	public void setBuidroom(String Ubuidroom) {
		buidroom.sendKeys(Ubuidroom);
	}
	public void setArea(String Uarea) {
		area.sendKeys(Uarea);
	}
	public void setUcity(String Pucity) {
		Ucity.sendKeys( Pucity);
	}
	public void setUstate(String Pustate) {
		Ustate.sendKeys(Pustate); 
	}
	public void setUmemStat(String PumemStat) {
		}
	

	
	
	
	
	
	
	
			
	
}
