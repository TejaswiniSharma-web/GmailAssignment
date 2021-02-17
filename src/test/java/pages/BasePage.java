

package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public static String getValues(String key) {
        String path = System.getProperty("user.dir") + File.separator + "config.properties";
        String value = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            Properties prop = new Properties();
            prop.load(fis);
            value = prop.getProperty(key);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return value;

    }
    /**
     * @Author: Tejaswini Sharma
     * waitForElement: Is used to wait for the element to load
     */

    public void click(WebDriver driver, WebElement element) {
        Actions act = new Actions(driver);
        act.click(element).build().perform();
    }
    public static void acceptAlert(WebDriver driver) {
        Alert alrt = driver.switchTo().alert();
        alrt.accept();

    }

    public static void waitForElement(long sec) {
        try {
            Thread.sleep(sec);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
