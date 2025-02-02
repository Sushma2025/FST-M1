//Read the title of the website and verify the text

package Project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActivityJ1 {
	
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
    public void titleTest() {    	           
    	// Assert that the title matches the expected value
        Assert.assertEquals(driver.getTitle(),"Alchemy Jobs – Job Board Application");
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}
