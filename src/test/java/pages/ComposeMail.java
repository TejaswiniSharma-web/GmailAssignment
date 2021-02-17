/*@Author:TejaswiniSharma
Assignment:Is to test the compose function in the Gmail ,
and to send the mail with attachment
* */
package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class ComposeMail extends BasePage {

    public ComposeMail(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".T-I.T-I-KE.L3")
    WebElement composeMail;
    @FindBy(xpath = "//textarea[@name='to']")
    WebElement sendTO;
    @FindBy(xpath = "//input[@name='subjectbox']")
    WebElement subjectTO;
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']")
    WebElement messageBody;


    public void sendMessage(String email, String subject ,String msg) throws InterruptedException {
        waitForElement(2000);
        click(driver, composeMail);
        Reporter.log("User navigated to  compose mail window");
        sendTO.sendKeys(email);
        Reporter.log("User entered email  "+ email);
        subjectTO.sendKeys(subject);
        Reporter.log("User entered subject "+ subject);
        waitForElement(2000);
        messageBody.sendKeys(msg);
        Reporter.log("User entered  message "+ msg);

    }
}
