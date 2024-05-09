package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[text()='Login']") WebElement loginMenu;
	@FindBy(css="input[name='email']") WebElement userName;
	@FindBy(css="input[name='password']") WebElement pwd;
	@FindBy(xpath="//button[text()='Login']") WebElement loginBtn;
	@FindBy(xpath="//button[text()='Your Feed']") WebElement yourFeedTab;
	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void clickLoginMenu() {
		loginMenu.click();
	}
	
	public void login(String strUser, String strPwd) {
		userName.sendKeys(strUser);
		pwd.sendKeys(strPwd);
		loginBtn.click();
	}
	

}
