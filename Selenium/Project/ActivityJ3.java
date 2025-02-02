// Print the url of the header image to the console
package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActivityJ3 {
	
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
    public void imageUrl() {    	 
    	
    	  	
    	System.out.println((driver.findElement(By.xpath("//*[@class=\"attachment-large size-large wp-post-image\"]")).getAttribute("src")));
    	}

          
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}


