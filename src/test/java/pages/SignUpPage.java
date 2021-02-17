package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SignUpPage extends BasePage {
    private WebDriver driver;

    public SignUpPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
    WebElement userName;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")
    WebElement clickNext;
    @FindBy(xpath = "(//input[@class='whsOnd zHQkBf'])[1]")
    WebElement enterPassword;
    @FindBy(xpath = "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc qIypjc TrZEUc']")
    WebElement nextButton;

    public void signInAccopunt(String eamil, String password)  {
        Reporter.log("Page Title "+ driver.getTitle());
        userName.sendKeys(eamil);
        Reporter.log("User entered email id:  "+ eamil);
        clickNext.click();
        waitForElement(2000);
        enterPassword.sendKeys(password);
        Reporter.log("User entered passowrd id:  "+ password);
        waitForElement(2000);
        nextButton.click();
        waitForElement(2000);
        Reporter.log("User navigated to gmail:  "+ driver.getTitle());
    }

}
