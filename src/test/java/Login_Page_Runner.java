//import Pages.Login_Page;
//import Pages.SingUP_Page;
//import org.json.simple.parser.ParseException;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.io.IOException;
//
//public class Login_Page_Runner extends SetUp_Page {
//    Login_Page objlogin1;
//    Utils utils;
//
//    @Test(enabled = true, priority = 0)
//    public void SingUp_With_Fst() throws IOException, ParseException, InterruptedException {
//        driver.get("https://sam.rultest2.com/");
//        objlogin1 = new Login_Page (driver);
//        utils = new Utils(driver);
//        utils.readJSONArray(0);
//        String user1 = objlogin1.Login_With_Fst(utils.getUsername(), utils.getPassword());
//        Assert.assertEquals(user1, "Login");
//        System.out.println(user1);
//
//    }
//}
