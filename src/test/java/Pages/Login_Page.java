//package Pages;
//
//import org.json.simple.parser.ParseException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import java.io.IOException;
//
//public class Login_Page {
//    WebDriver driver;
//
//    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
//    WebElement loginbtn;
//
//    @FindBy(xpath = "(//input[@name='login'])[1]")
//    WebElement userlog;
//
//    @FindBy(xpath = "(//input[@type='password'])[1]")
//    WebElement userpass;
//
//    @FindBy(xpath = "((//a[contains(.,'Login')])[2]")
//    WebElement submitlogin;
//
//
//    public Login_Page(WebDriver driver) {
//        this.driver = driver;
//        PageFactory pageFactory;
//        PageFactory.initElements(driver, this);
//    }
//
//
//    public String Login_With_Fst(String username, String password) throws IOException, ParseException, InterruptedException {
//        loginbtn.click();
//        userlog.sendKeys(username);
//        userpass.sendKeys(password);
//        submitlogin.click();
//        return username;
//    }
//
//}
