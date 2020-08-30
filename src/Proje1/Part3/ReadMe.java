package Proje1.Part3;


import Utills.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ReadMe  extends BaseStaticDriver {

    /*

        1) Bu siteye gidin. -> https://www.snapdeal.com/

        2) "teddy bear" aratın ve  Search butonuna tıklayın.

        3) Bu yazının göründüğünü doğrulayınız. -> (We've got 918 results for 'teddy bear')
        Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

        4) Snepdeal logosuna tıklayınız.

        5) URL'in bu olduğunu doğrulayın. (https://www.snapdeal.com/)

     */

    public static void main(String[] args) throws InterruptedException {
        /*driver.get("https://www.snapdeal.com/");

        WebElement search=driver.findElement(By.className("searchTextSpan"));
        search.sendKeys("ttechno@gmail.com");


        Thread.sleep(3000);
        //driver.quit();*/

        driver.get("https://www.snapdeal.com/%22");

        WebElement tedy = driver.findElement(By.id("inputValEnter"));
        tedy.sendKeys("teddy bear");        //text gönderme

        WebElement searchButton=driver.findElement(By.className("searchTextSpan"));
        searchButton.click();


        String text=driver.findElement(By.id("searchMessageContainer")).getText();
        System.out.println(text);
        Assert.assertEquals("We've got 1459 results for 'teddy bear'",text);


        driver.findElement(By.cssSelector(".notIeLogoHeader.aspectRatioEqual.sdLogo.cur-pointer")).click();

        String url=driver.getCurrentUrl();
        Assert.assertEquals("https://www.snapdeal.com/",url);


        Thread.sleep(3000);

    }
}
