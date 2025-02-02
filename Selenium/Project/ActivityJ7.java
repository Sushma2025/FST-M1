// Print the url of the header image to the console
package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActivityJ7{
	
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
    public void jobTest() {    	 
    	
    	WebElement navBar = driver.findElement(By.id("menu-item-26"));
    	
    	WebElement jobsMenuItem = navBar.findElement(By.linkText("Post a Job"));  // Finds the link with the text "Jobs"
        jobsMenuItem.click();    	
    	 	
        WebElement jobEmailField = driver.findElement(By.id("create_account_email"));
        jobEmailField.sendKeys("apply@job.com");
        
        
        WebElement title = driver.findElement(By.id("job_title"));
        title.sendKeys("Banking");
        
        WebElement location = driver.findElement(By.id("job_location"));
        location.sendKeys("India");
        
        WebElement jobType = driver.findElement(By.id("job_type"));
        jobType.sendKeys("Full Time");
        
        WebElement jobDesc = driver.findElement(By.id("job_description_ifr"));
        jobDesc.sendKeys("This is a test description for a banking job");
        
        WebElement applicationEmail = driver.findElement(By.id("application"));
        applicationEmail.sendKeys("psot@gmail.com");
        
        WebElement companyName = driver.findElement(By.id("company_name"));
        companyName.sendKeys("Syntel");
        
        WebElement previewButton = driver.findElement(By.xpath("//*[@class=\"button\"]"));
        previewButton.click();
        
        WebElement submitButton = driver.findElement(By.xpath("//*[@class=\"job_listing_preview_title\"job_preview_submit_button\"]"));
        submitButton.click();        
        
    }
          
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}


