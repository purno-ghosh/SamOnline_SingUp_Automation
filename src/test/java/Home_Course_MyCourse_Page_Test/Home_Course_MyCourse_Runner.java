package Home_Course_MyCourse_Page_Test;

import ALL_Helping_Files.SetUp_Page;
import ALL_Helping_Files.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Home_Course_MyCourse_Runner extends SetUp_Page {
    Home_Course_MyCourse objlogin2;
    Utils utils;

    @Test(enabled = true, priority = 0)
    public void Login_With_User31() throws IOException, ParseException, InterruptedException {
        driver.get("https://sam.rultest2.com/");
        objlogin2 = new Home_Course_MyCourse (driver);
        utils = new Utils(driver);
        utils.readJSONArray(2);
        String aa=objlogin2.Login_With_User31(utils.getUsername(), utils.getPassword());
        Assert.assertEquals(aa, "Login");
        System.out.println(aa);

    }
}
