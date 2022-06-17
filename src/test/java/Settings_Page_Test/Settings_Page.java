package Settings_Page_Test;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Settings_Page {

    WebDriver driver;

    public Settings_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
    WebElement loginbtn;

    @FindBy(xpath = "(//input[@name='login'])[1]")
    WebElement userlog;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement userpass;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Login')]")
    WebElement submitlogin;

    @FindBy(xpath = "//span[@class='float_menu_item__title heading_font'][contains(.,'Settings')]")
    WebElement StngBtn;

    @FindBy(xpath = "//input[contains(@type,'file')]")
    WebElement imageBtn;

    @FindBy(xpath = "//input[contains(@name,'institution_name')]")
    WebElement Institucng;

    @FindBy(xpath = "(//span[contains(.,'Save changes')])[2]")
    WebElement savebtn;


    @FindBy(xpath = "//a[@class='logout-link'][contains(.,'Log out')]")
    WebElement outbtn;

    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
    WebElement Testassert;
    public String SettingsCheck_With_User31(String username, String password) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        userlog.sendKeys(username);
        userpass.sendKeys(password);
        submitlogin.click();
        Thread.sleep(5000);
        StngBtn.click();
        Thread.sleep(5000);
        imageBtn.sendKeys("F:\\sss\\purnopic.jpg");
        Thread.sleep(5000);
        Institucng.clear();
        Thread.sleep(5000);
        Institucng.sendKeys("Rangamati");
        savebtn.click();
        Thread.sleep(5000);
        outbtn.click();
        return  Testassert.getText();

    }
}
