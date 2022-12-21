import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSeleniumTest {

    @Test
    public void firstTest()
    {
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
    public void TestCypress()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.cypress.io/");
        driver.quit();
    }

    @Test
    public void TestHeroKuappHovers()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://react-shopping-cart-67954.firebaseapp.com/");
        driver.quit();
    }
}
