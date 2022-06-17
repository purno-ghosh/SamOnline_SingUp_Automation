package Settings_Page_Test;

import ALL_Helping_Files.SetUp_Page;
import ALL_Helping_Files.Utils;
import Home_Course_MyCourse_Page_Test.Home_Course_MyCourse;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;


public class Settings_Page_Runner extends SetUp_Page {

    Settings_Page objlogin3;
    Utils utils;


    @Test(enabled = true, priority = 0)
    public void Login_With_User31() throws IOException, ParseException, InterruptedException {
        driver.get("https://sam.rultest2.com/");
        objlogin3 = new Settings_Page(driver);
        utils = new Utils(driver);
        utils.readJSONArray(2);
        String vv=objlogin3.SettingsCheck_With_User31(utils.getUsername(), utils.getPassword());
        Assert.assertEquals(vv, "Login");
        System.out.println(vv);

    }
}
