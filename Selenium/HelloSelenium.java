package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloSelenium {
  public static void main(String[] args) {
    // Create a new instance of the Firefox driver
    WebDriver driver = new FirefoxDriver();
    
    // Open the browser
    driver.get("https://training-support.net");
    
    System.out.println("Page title is: " + driver.getTitle());
    
    driver.findElement(By.linkText("About Us")).click();
    
    System.out.println("New page title is: " + driver.getTitle());

    // Close the browser
  
    driver.quit();
  }
}