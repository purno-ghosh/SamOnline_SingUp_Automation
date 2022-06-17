package Home_Course_MyCourse_Page_Test;

import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Home_Course_MyCourse {
    WebDriver driver;

    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
    WebElement loginbtn;

    @FindBy(xpath = "(//input[@name='login'])[1]")
    WebElement userlog;

    @FindBy(xpath = "(//input[@type='password'])[1]")
    WebElement userpass;

    @FindBy(xpath = "//a[@href='#'][contains(.,'Login')]")
    WebElement submitlogin;

    @FindBy(xpath = "(//a[contains(.,'Home')])[2]")
    WebElement Homebtn;

    @FindBy(xpath = "(//a[@href='https://sam.rultest2.com/courses'][contains(.,'Course')])[2]")
    WebElement coursebtn;

    @FindBy(xpath = "(//a[@href='https://sam.rultest2.com/courses/mycourse'])[2]")

    WebElement MYcoursebtn;

    @FindBy(xpath = "//a[@href='#curriculum'][contains(.,'Curriculum')]")
    WebElement Curriculumbtn;

    @FindBy(xpath = "//a[@href='#faq'][contains(.,'FAQ')]")
    WebElement FAQbtn;
    @FindBy(xpath = "//a[@class='logout-link'][contains(.,'Log out')]")
    WebElement Logout;
    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
    WebElement Testassert;


    public Home_Course_MyCourse(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }

    public String Login_With_User31(String username, String password) throws IOException, ParseException, InterruptedException {
        loginbtn.click();
        userlog.sendKeys(username);
        userpass.sendKeys(password);
        submitlogin.click();
        Thread.sleep(5000);
        Homebtn.click();
        Thread.sleep(5000);
        coursebtn.click();
        Thread.sleep(5000);
        MYcoursebtn.click();
        Thread.sleep(5000);
        Curriculumbtn.click();
        Thread.sleep(3000);

        FAQbtn.click();
        Thread.sleep(3000);

        Logout.click();
        return  Testassert.getText();

    }


}
