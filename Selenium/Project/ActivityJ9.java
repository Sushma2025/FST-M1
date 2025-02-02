//Read the title of the website and verify the text

package Project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;

public class ActivityJ9 {
	
	WebDriver driver;
	
	// Setup function
    @BeforeClass
    public void setUp() {
        // Initialize Firefox driver
        driver = new FirefoxDriver();
        // Open the page
        driver.get("https://alchemy.hguy.co/jobs/wp-admin");
        }
    
    @Test
    public void loginTest() {  
    	
    	WebElement usernameField = driver.findElement(By.id("user_login"));
        usernameField.sendKeys("your_username");
        
        WebElement password = driver.findElement(By.id("user_pass"));
        password.sendKeys("your_password");
        
        WebElement loginButton = driver.findElement(By.id("wp-submit"));
        loginButton.click();
    }
    
    @AfterClass
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
    
}
