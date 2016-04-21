import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OurTeamPage extends AbstractPage {

    public OurTeamPage(WebDriver driver){
        super(driver);
    }
    public OurTeamPage SearchCoach(){
        driver.findElement(By.partialLinkText("Александр Галковский"));
        return new OurTeamPage(driver);
    }
}
