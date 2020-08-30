package Proje1.Part1;

import Utills.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadMe extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. ->  http://demoqa.com/text-box

        2) Full Name kısmına "Automation" girin.

        3) Email kısmına "Testing" girin.

        4) Current Address kısmına "Testing Current Address" girin.

        5) Permanent Address kısmına "Testing Permanent Address" girin.

        6) Submit butonuna tıklayınız.

        7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

        8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

     */
    public static void main(String[] args) throws InterruptedException {

//        driver.get("http://demoqa.com/text-box");
//
//        WebElement full = driver.findElement(By.id("userName"));
//        full.sendKeys("Automation");        //text gönderme
//
//        WebElement email = driver.findElement(By.id("userEmail"));
//        email.sendKeys("Testing@yahoo.com");        //text gönderme
//
//
//        WebElement current = driver.findElement(By.id("currentAddress"));
//        current.sendKeys("Testing Current Address");        //text gönderme
//
//        WebElement permanent = driver.findElement(By.id("permanentAddress"));
//        permanent.sendKeys("Testing Permanent Address");        //text gönderme
//
//
////        WebElement buton = driver.findElement(By.id("submit"));     //Button tiklama
////        buton.click();
//
////       driver.findElement(By.id("submit")).click();
//
//        WebElement buton=driver.findElement(By.className("btn-primary"));
//        buton.click();
//
//        Thread.sleep(5000);
////         driver.quit();


        driver.get("http://demoqa.com/text-box");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement full = driver.findElement(By.id("userName"));
        full.sendKeys("Automation");        //text gönderme

        WebElement email = driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@yahoo.com");        //text gönderme


        WebElement current = driver.findElement(By.id("currentAddress"));
        current.sendKeys("Testing Current Address");        //text gönderme

        WebElement permanent = driver.findElement(By.id("permanentAddress"));
        permanent.sendKeys("Testing Permanent Address");        //text gönderme


        Thread.sleep(3000);

        WebElement button2=driver.findElement(By.className("btn-primary"));
        button2.click();

        Thread.sleep(3000);
        //  driver.quit();
    }
    }

