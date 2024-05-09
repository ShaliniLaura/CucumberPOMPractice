package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class DeleteArticle {
	
	@FindBy(xpath="//a[text()='Home']") WebElement homeMenu ;
	@FindBy(xpath="(//h1[contains(text(),'Case Study')])[1]") WebElement articleList;
	@FindBy(xpath="(//button[@class='btn btn-sm'])[1]") WebElement deleteIcon;
	@FindBy(css="button[type='submit']") WebElement updateBtn;
	
	public DeleteArticle(WebDriver driver){
		PageFactory.initElements(driver, this);

     }
	
	public void clickDeleteArticle() {
		homeMenu.click();
		NewArticle.globalFeed.click();
	}
	
	public void deleteDetails() {
		articleList.click();
		deleteIcon.click();
		Alert alt=TestBase.getDriver().switchTo().alert();
	     alt.accept();
		
	}

	
}