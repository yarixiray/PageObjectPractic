import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends AbstractPage{
    public HomePage(WebDriver driver){
        super(driver);
    }
public OurTeamPage clickOnOurTeam(){
    Actions actions = new Actions(driver);
    actions.moveToElement(driver.findElement(By.id("menu3039"))).perform();
    actions.moveToElement(driver.findElement(By.linkText("Наша команда"))).click();

    return new OurTeamPage(driver);
}
}
