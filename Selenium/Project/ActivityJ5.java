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

public class ActivityJ5{
	
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
    	
    	WebElement navBar = driver.findElement(By.id("menu-item-24"));
    	
    	WebElement jobsMenuItem = navBar.findElement(By.linkText("Jobs"));  // Finds the link with the text "Jobs"
        jobsMenuItem.click();    	
    	 	
    	// Assert that the title matches the expected value
        String pageTitle = driver.getTitle();
        
        Assert.assertEquals("Jobs – Alchemy Jobs", pageTitle);
    }
          
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}


