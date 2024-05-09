package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class NewArticle {
	
	//Locate all DOMS
	@FindBy(xpath="//button[text()='Global Feed']") static WebElement globalFeed;
	@FindBy(xpath="//a[text()='New Article']") WebElement newArticleMenu;
	@FindBy(css="input[name='title']") WebElement articleTitle;
	@FindBy(css="input[name='description']") static  WebElement articleAbout;
	@FindBy(css="textarea[name='body']") WebElement articleDetail;
	@FindBy(css="button[type='submit']") WebElement publishBtn;

	
	//@FindBy(css="div.container h1") WebElement titleCheck;
	
	public NewArticle(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void addNewArticle()
	{
		newArticleMenu.click();
	}
	
	public void articleDetails(String title, String about, String detail){
		articleTitle.sendKeys(title);
		articleAbout.sendKeys(about);
		articleDetail.sendKeys(detail);
	//	publishBtn.click();
		//Thread.sleep(3000);
		//System.out.println("isdisplay check...."+ homeMenu.isDisplayed());
//		System.out.println("isdisplay check...."+ titleCheck.isDisplayed());
//		String titlechk= titleCheck.getText();
//		System.out.println("titlechk" + titlechk);
//		System.out.println("title" + title);
//		Assert.assertEquals(titlechk,title);
		
	}
	
	public void publishArticle()
	{
		publishBtn.click();
	}
	
	
	
	
	
	public boolean isOnHomePage() {
		return globalFeed.isDisplayed();
		}
}
