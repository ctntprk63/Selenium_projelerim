package Proje1.Part2;

import Utills.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert.*;

public class ReadMe extends BaseStaticDriver {

    /*
        1) Bu siteye gidin. -> https://demo.applitools.com/

        2) Username kısmına "ttechno@gmail.com" girin.

        3) Password kısmına "techno123." girin.

        4) "Sign in" buttonunan tıklayınız.

        5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.(Assert kullanın )

        6) URL'in bu olduğunu doğrulayın. -> https://demo.applitools.com/app.html   (Assert kullanın )
     */

    public static void main(String[] args) throws InterruptedException {
        driver.get("https://demo.applitools.com");

        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");

        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123.");

        WebElement buton=driver.findElement(By.id("log-in"));
        buton.click();

        String text=driver.findElement(By.id("time")).getText();

        Assert.assertEquals("Your nearest branch closes in: 30m 5s",text);

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://demo.applitools.com/app.html",url);


        Thread.sleep(3000);
        //driver.quit();

    }
}
