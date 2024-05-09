package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpdateArticle {
	
	@FindBy(xpath="//a[text()='Home']") WebElement homeMenu ;
	@FindBy(xpath="(//h1[contains(text(),'Case Study')])[1]") WebElement articleList;
	@FindBy(xpath="(//a[text()=' Edit Article'])[1]") WebElement editIcon;
	@FindBy(css="button[type='submit']") WebElement updateBtn;
	
	public UpdateArticle(WebDriver driver){
		PageFactory.initElements(driver, this);

     }
	
	public void clickUpdateArticle() {
		homeMenu.click();
		NewArticle.globalFeed.click();
	}
	
	public void updateDetails() {
		articleList.click();
		editIcon.click();
		NewArticle.articleAbout.clear();
		NewArticle.articleAbout.sendKeys("Selenium Course");
		
	}

	 public void postUpdate() {
		 updateBtn.click();
	 }
}