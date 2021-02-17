package pages;

import bsh.This;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import java.io.File;

public class FileUploadPage extends BasePage {

    public FileUploadPage(WebDriver driver) {
        super(driver);
        this.driver=driver;
        PageFactory.initElements(driver, this);

    }

    @FindBy(xpath = "//input[@name='Filedata']")
    WebElement fileAttached;


    public void attacheTheFile()  {
        waitForElement(2000);
        String path = System.getProperty("user.dir") + File.separator + "Resume" + File.separator + "Tejaswinisharma.docx";
        fileAttached.sendKeys(path);
        Reporter.log("User uploadred file   "+ path);

    }



}

