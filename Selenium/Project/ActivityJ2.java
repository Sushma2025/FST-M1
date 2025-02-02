//Read the heading of the website and verify the text

package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActivityJ2 {
	
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
    public void headerTest() {    	 
    	
    	  	
    	// Assert that the title matches the expected value
    	Assert.assertEquals(driver.findElement(By.xpath("//*[@class=\"entry-title\"]")).getText(),
				"Welcome to Alchemy Jobs");
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}

