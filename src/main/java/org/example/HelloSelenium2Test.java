package org.example;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium2Test {
    //This method will run once before all the tests in our class

   @Test
    public void smarterTest()
    {
        System.setProperty("webdriver.chrome.driver","src/resources/browserBinaries/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }
}
