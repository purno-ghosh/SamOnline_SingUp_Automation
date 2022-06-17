package Sign_Up_Page_Test;

import ALL_Helping_Files.SetUp_Page;
import ALL_Helping_Files.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SingUP_Runner extends SetUp_Page {
    SingUP_Page objlogin;
    Utils utils;


    @Test(enabled = true, priority = 0)
    public void SingUp_With_Fst() throws IOException, ParseException, InterruptedException {
        driver.get("https://sam.rultest2.com/");
        objlogin = new SingUP_Page(driver);
        utils = new Utils(driver);
        utils.readJSONArray(0);
        String user1 = objlogin.SingUp_With_Fst(utils.getUsername(), utils.getEmail(), utils.getPassword(), utils.getNumber(), utils.getAge(),utils.getInstitution());
        Assert.assertEquals(user1, "Login");
        System.out.println(user1);

    }

    @Test(enabled = true, priority = 1)
    public void SingUp_With_2nd() throws IOException, ParseException, InterruptedException {
        driver.get("https://sam.rultest2.com/");
        objlogin = new SingUP_Page(driver);
        utils = new Utils(driver);
        utils.readJSONArray(1);
        String user2 = objlogin.SingUp_With_2nd(utils.getUsername(), utils.getEmail(), utils.getPassword(), utils.getNumber(), utils.getAge(),utils.getInstitution());
        Assert.assertEquals(user2, "Login");
        System.out.println(user2);

    }


}
