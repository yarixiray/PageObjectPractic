import org.openqa.selenium.WebDriver;

public class AbstractPage {
    protected WebDriver driver;

    public AbstractPage (WebDriver driver) {
        this.driver=driver;
    }
    public WebDriver getDriver(){
            return driver;
    }
    public HomePage navigateToHomePage() {
        driver.navigate().to("http://skillsup.ua/");
        return new HomePage(driver);
    }
}
