package stepDefs;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteArticle;
import pages.LoginPage;
import pages.NewArticle;
import pages.UpdateArticle;


public class ArticleStepDef {
	
	WebDriver driver= TestBase.getDriver();
	LoginPage loginPage;
	NewArticle newArticle;
	UpdateArticle updateArticle;
	DeleteArticle deleteArticle;
	
	public ArticleStepDef(){
		loginPage= new LoginPage(driver);
		newArticle= new NewArticle(driver);
		updateArticle= new UpdateArticle(driver);
		deleteArticle= new DeleteArticle(driver);
	}
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
	    TestBase.openUrl("https://conduit-realworld-example-app.fly.dev/");
	    loginPage.clickLoginMenu();
	    }
	@When("User enters {string} and {string}")
	public void user_enters_and(String strUser, String strPwd) {
	    loginPage.login(strUser, strPwd);
	}
	@Then("User should be on Home Page")
	public void user_should_be_on_home_page() {
		Assert.assertTrue(newArticle.isOnHomePage());
	}
	
	@Given("User is on New Article page")
	public void user_is_on_new_article_page() {
	    newArticle.addNewArticle();
	}
	@When("User adds details for Article")
	public void user_adds_details_for_article(DataTable dataTable) {
	    List<Map<String, String>> articleDets= dataTable.asMaps();
	    String artTitle= articleDets.get(0).get("ArticleTitle");
	    String artAbt= articleDets.get(0).get("ArticleAbout");
	    String artDet= articleDets.get(0).get("ArticleDetail");
	    newArticle.articleDetails(artTitle, artAbt, artDet);
	}
	@Then("New Article should be added")
	public void new_article_should_be_added() {
		
	    newArticle.publishArticle();
	}
	
	@Given("User is on Global Feed page")
	public void user_is_on_global_feed_page() {
	    updateArticle.clickUpdateArticle();
	}
	@When("User modifies the article #article detail")
	public void user_modifies_the_article_article_detail() {
		updateArticle.updateDetails();
	}
	
	@Then("Article should be updated")
	public void article_should_be_updated() {
		updateArticle.postUpdate();
	}
	
	@When("User deletes the article #article detail")
	public void user_deletes_the_article_article_detail() {
	    deleteArticle.clickDeleteArticle();
	}
	@Then("Article should be deleted")
	public void article_should_be_deleted() {
		deleteArticle.deleteDetails();
		
	}
	

}
