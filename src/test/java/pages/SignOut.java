package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignOut extends BasePage {
    private WebDriver driver;

    public SignOut(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(@aria-label,'Google Account:')]")
    WebElement loggedUser;

    @FindBy(xpath = "//a[text()='Sign out']")
    WebElement signOut;




    public void logout()  {

        loggedUser.click();
        signOut.click();


    }

}
