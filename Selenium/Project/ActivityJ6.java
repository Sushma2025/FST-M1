// Print the url of the header image to the console
package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActivityJ6{
	
	WebDriver driver;
	
	// Setup function
    @BeforeClass
    public void setUp() {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
        // Open the page
        driver.get("https://alchemy.hguy.co/jobs");
        }
    
    @Test
    public void jobTest() throws InterruptedException {    	 
    	
    	WebElement navBar = driver.findElement(By.id("menu-item-24"));
    	
    	WebElement jobsMenuItem = navBar.findElement(By.linkText("Jobs"));  // Finds the link with the text "Jobs"
        jobsMenuItem.click();   
        
        WebElement searchBox = driver.findElement(By.id("search_keywords"));
        searchBox.sendKeys("Banking");

        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        searchButton.click();
        
        Thread.sleep(5000);
        
        WebElement firstJobListing = driver.findElement(By.className("job_listing"));
        firstJobListing.click();
        
       // WebElement applyButton = driver.findElement(By.xpath("//a[text()='Apply for job']"));
        //applyButton.click();
        
        WebElement applyButton = driver.findElement(By.xpath("//input[@type='button']"));
        applyButton.click();
        
        WebElement emailField = driver.findElement(By.xpath("//*[@class=\"job_application_email\"]"));
        String email = emailField.getAttribute("value"); 
                			        
        
        System.out.println("The email for applying to the job is: " + email);
    }
          
    
	@AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}


