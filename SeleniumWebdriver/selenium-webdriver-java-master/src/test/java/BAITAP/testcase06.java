/* Verify user is able to purchase product using registered email id (USE CHROME BROWSER)

Test Steps:

1. Go to http://live.techpanda.org/

2. Click on my account link

3. Login in application using previously created credential

4. Click on MY WISHLIST link

5. In next page, Click ADD TO CART link

 */


package BAITAP;

import Pom.RegisterPage;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


//Login
@Test
public class testcase06 {
    public static void testTC06() {
        int scc = 0;
        StringBuffer verificationErrors = new StringBuffer();
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Go to http://live.techpanda.org/
            driver.get("http://live.techpanda.org/");
            RegisterPage registerPage = new RegisterPage(driver);

            //2. Click on my account link
            registerPage.clickMyAccountLink();


            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }

            //3. Login in application using previously created credential

            registerPage.enterEmail2("quangvipcc1234@gmail.com");
            registerPage.enterPassword2("quangvip123");

            registerPage.clickLoginButton();

            //4. Click on MY WISHLIST link
            registerPage.clickMyWishlistLink();

            Thread.sleep(1000);
            //5. In next page, Click ADD TO CART link
            registerPage.clickAddToCartButton();


        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();

    }

}
