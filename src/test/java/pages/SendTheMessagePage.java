package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SendTheMessagePage extends BasePage{
    public SendTheMessagePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

     @FindBy(xpath = "//div[@data-tooltip='Send \u202A(⌘Enter)\u202C']")
     WebElement sendTheMessage;

        public void sendEmail(){
             click(driver,sendTheMessage);
            Reporter.log("User navigated to sendTheMessage:  "+ driver.getTitle());


        }
}
