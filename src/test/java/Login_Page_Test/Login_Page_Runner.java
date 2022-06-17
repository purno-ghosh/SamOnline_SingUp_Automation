package Login_Page_Test;

import ALL_Helping_Files.SetUp_Page;
import ALL_Helping_Files.Utils;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class Login_Page_Runner extends SetUp_Page {
    Login_Page objlogin1;
    Utils utils;


   @Test(enabled = true, priority = 0)
   public void Login_With_Fst() throws IOException, ParseException, InterruptedException {
       driver.get("https://sam.rultest2.com/");
       objlogin1 = new Login_Page (driver);
       utils = new Utils(driver);
       utils.readJSONArray(0);
       String nn=objlogin1.Login_With_Fst(utils.getUsername(), utils.getPassword());
       Assert.assertEquals(nn, "Login");
       System.out.println(nn);

   }

   @Test(enabled = true, priority = 1)
   public void Login_With_2nd() throws IOException, ParseException, InterruptedException {
       driver.get("https://sam.rultest2.com/");
       objlogin1 = new Login_Page (driver);
       utils = new Utils(driver);
       utils.readJSONArray(1);
       String nn1=objlogin1.Login_With_2nd(utils.getUsername(), utils.getPassword());
       Assert.assertEquals(nn1, "Login");
       System.out.println(nn1);

   }




}
