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

public class ActivityJ4{
	
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
    public void secondheadingTest() {    	 
    	
	  	
    	// Assert that the title matches the expected value
    	Assert.assertEquals(driver.findElement(By.xpath("(//h2)")).getText(),
				"Quia quis non");
    }
          
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}


