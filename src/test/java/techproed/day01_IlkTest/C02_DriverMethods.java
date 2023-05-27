package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");
        System.out.println("Amazon Actual Title : "+driver.getTitle());
        System.out.println("Amazon Actual Url : "+driver.getCurrentUrl());           //gidilen sayfanin Url'ini verir
        System.out.println("Amazon window handle degeri : "+driver.getWindowHandle());

        driver.get("https://techproeducation.com");
        System.out.println("Techproeducation Actual Title : "+driver.getTitle());    //sayfa basligini verir

        System.out.println("Techpro Actual Url : "+driver.getCurrentUrl());

    //    System.out.println(driver.getPageSource());                                  //getPageSource() acilan sayfanin kaynak kodlarini verir

        System.out.println("Techproed window handle degeri : "+driver.getWindowHandle());   //gidilen sayfanin handle(hashcode) degerini verir.bu handle degerini sayfalar arasi gecis icin
                                                                                       //kullanilir


    }
}
