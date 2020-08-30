package Utills;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class kodlar {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:/Selenium/ChromeDriver/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdim.
        WebDriver driver = new ChromeDriver(); // çalıştıracağımız driverı kontrol edecek değişkeni tanımladım.
        driver.get("https://www.google.com.tr/"); // siteyi açtım

    }
}
