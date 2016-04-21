import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
    WebDriver driver;

    @Before
    public void testSetUp() {
        driver = new FirefoxDriver();
    }

    @After
    public void testShutDown() {
        driver.quit();
    }

    @Test
    public void testMainPage() {
        HomePage onHomePage = new HomePage(driver);
        onHomePage.navigateToHomePage().clickOnOurTeam();
    }
}
