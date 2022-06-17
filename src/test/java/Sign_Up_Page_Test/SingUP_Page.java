package Sign_Up_Page_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingUP_Page {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")
    WebElement Registerbln;

    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[1]/span[1]/div/div/input")
    WebElement usernamefld;

    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[1]/span[2]/div/div/input")
    WebElement emailfld;

    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[1]/div/div/input")
    WebElement passwordfld1;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[2]/div/div/input")
    WebElement passwordfld2;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[3]/div/div/input")
    WebElement name;
    @FindBy(xpath = "//*[@id=\"stm-lms-register\"]/span/form/div[2]/span[4]/div/div/input")
    WebElement Number;
    @FindBy(xpath = "//span[@class='select2-selection__rendered'][contains(.,'Select Gender')]")
    WebElement Genderclk;
    @FindBy(xpath = "//li[contains(.,'Female')]")
    WebElement Genderbtn;
    @FindBy(xpath = "(//input[contains(@class,'form-control')])[10]")
    WebElement Agebtn;
    @FindBy(xpath = "(//span[contains(@class,'rendered')])[2]")
    WebElement Designationclk;
    @FindBy(xpath = "//li[contains(.,'Student')]")
    WebElement Designationslt;
    @FindBy(xpath = "//input[contains(@name,'institution_name')]")
    WebElement INSTITUTION;
    @FindBy(xpath = "(//span[contains(.,'Register')])[2]")
    WebElement Registerbtn;
    @FindBy(xpath = "//a[contains(.,'Log out')]")
    WebElement Logout;
    @FindBy(xpath = "//a[@href='https://sam.rultest2.com/account/'][contains(.,'Login')]")
    WebElement Testassert;
    public SingUP_Page(WebDriver driver) {
        this.driver = driver;
        PageFactory pageFactory;
        PageFactory.initElements(driver, this);
    }
    public String SingUp_With_Fst(String username, String email, String password, String number, String age, String institution) throws InterruptedException {
        Registerbln.click();
        Thread.sleep(2000);
        usernamefld.sendKeys(username);
        emailfld.sendKeys(email);
        passwordfld1.sendKeys(password);
        passwordfld2.sendKeys(password);
        name.sendKeys(username);
        Number.sendKeys(number);
        Genderclk.click();
        Genderbtn.click();
        Agebtn.sendKeys(age);
        Thread.sleep(2000);
        Designationclk.click();
        Designationslt.click();
        Thread.sleep(2000);
        INSTITUTION.sendKeys(institution);
        Thread.sleep(2000);
        Registerbtn.click();
        Thread.sleep(2000);
        Logout.click();
        Thread.sleep(2000);
        return Testassert.getText();
    }
    public String SingUp_With_2nd(String username, String email, String password, String number, String age, String institution) throws InterruptedException {
        Registerbln.click();
        Thread.sleep(2000);
        usernamefld.sendKeys(username);
        emailfld.sendKeys(email);
        passwordfld1.sendKeys(password);
        passwordfld2.sendKeys(password);
        name.sendKeys(username);
        Number.sendKeys(number);
        Genderclk.click();
        Genderbtn.click();
        Agebtn.sendKeys(age);
        Thread.sleep(2000);
        Designationclk.click();
        Designationslt.click();
        Thread.sleep(2000);
        INSTITUTION.sendKeys(institution);
        Thread.sleep(2000);
        Registerbtn.click();
        Thread.sleep(2000);
        Logout.click();
        Thread.sleep(2000);
        return Testassert.getText();
    }
}
