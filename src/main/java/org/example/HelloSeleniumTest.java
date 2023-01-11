package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HelloSeleniumTest {

    @Test
    public void openTheComPage() {
        WebDriver driver = new ChromeDriver();
        String expectedComTitle = "Example title";
        driver.get("https://www.example.com");
        assertEquals(expectedComTitle, driver.getTitle());

    }

    @Test
    public void openTheOrgPage() {
        WebDriver driver = new ChromeDriver();
        String expectedOrgTitle = "Example title";
        driver.get("https://www.example.org");
        assertEquals(expectedOrgTitle, driver.getTitle());

    }


    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.quit();
    }

    @Test
    public void Testherokuapp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void TestCypress() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.cypress.io/");
        driver.quit();
    }

    @Test
    public void TestHeroKuappHovers() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        driver.quit();
    }

    @Test
    public void TestSteps() {
        System.setProperty("webdriver.chrome.driver", "src/resources/browserBinaries/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("user-name")));
        assertTrue(element.isDisplayed());
        driver.quit();
    }
}
