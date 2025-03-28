package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Activity1{
public class googleSearchSteps {
    WebDriver driver;
    WebDriverWait wait;
    
    @Given("^User is on Google Home Page$")
    public void userIsOnGooglePage() throws Throwable {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
                
        //Open the browser
        driver.get("https://www.google.com");
    }
    
    @When("^User types in Cheese and hits ENTER$")
    public void userTypesInCheeseAndHitsENTER() throws Throwable {
        driver.findElement(By.name("q")).sendKeys("Cheese", Keys.RETURN);
    }

    @Then("^Show how many search results were shown$")
    public void showHowManySearchResultsWereShown() throws Throwable {
    	
    	WebElement tools = wait.until(ExpectedConditions.elementToBeClickable(By.id("hdtb-tls")));
 	   
	    Thread.sleep(5000);
	    tools.click();
	    System.out.println("Clicked the Tools button.");
	   
	    Thread.sleep(5000);
	  
		WebElement resultStatsElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("result-stats")));
	    String resultStats = resultStatsElement.getText();
	    System.out.println("Number of results found: " + resultStats);
    }

    @And("^Close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }

}
}