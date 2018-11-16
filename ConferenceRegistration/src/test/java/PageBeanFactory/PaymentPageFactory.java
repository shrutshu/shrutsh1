package PageBeanFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPageFactory {
WebDriver driver;

@FindBy(id="txtCardholderName")
WebElement cardHoldName;
@FindBy(id="txtDebit")
WebElement Debit;
@FindBy(id="txtCvv")
WebElement cvv;
@FindBy(id="txtMonth")
WebElement month;
@FindBy(id="txtYear")
WebElement year;

@FindBy(id="btnPayment")
WebElement payment;





public WebElement getDebit() {
	return Debit;
}

public void setDebit(String Udebit) {
	Debit.sendKeys(Udebit);
	
}

public PaymentPageFactory(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getCardHoldName() {
	return cardHoldName;
}

public void setCardHoldName(String    UcardHoldName) {
	cardHoldName.sendKeys(UcardHoldName);}


public WebElement getCvv() {
	return cvv;
}

public void setCvv(String Ucvv) {
cvv.sendKeys(Ucvv);
}

public WebElement getMonth() {
	return month;
}

public void setMonth(String Umonth) {
	month.sendKeys(Umonth);
}

public WebElement getYear() {
	return year;
}

public void setYear(String Uyear) {
	year.sendKeys(Uyear);
}

public WebElement getPayment() {
	return payment;
}

public void setPayment() {
	payment.click();
}






}



