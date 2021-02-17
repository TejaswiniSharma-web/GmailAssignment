package testScripts.Gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.*;
import testScripts.BaseTest;

/*
@Author:TejaswiniSharma

TC_EMAIL_001 :Test the compose function in the Gmail ,
and to send the mail with attachment
* */


public class TC_EMAIL_001 extends BaseTest {

    String email = BasePage.getValues("email");
    String password = BasePage.getValues("password");
    String subject = BasePage.getValues("subject");
    String msgBody = BasePage.getValues("msgBody");

    @Test
    public void launchGmail() throws InterruptedException {
        SignUpPage sp = new SignUpPage(driver);
        sp.signInAccopunt(email, password);
        ComposeMail cm = new ComposeMail(driver);
        cm.sendMessage(email, subject, msgBody);
        FileUploadPage fp = new FileUploadPage(driver);
        fp.attacheTheFile();
        SendTheMessagePage stmp = new SendTheMessagePage(driver);
        stmp.sendEmail();
        SignOut sup = new SignOut(driver);
        sup.logout();
    }

}
