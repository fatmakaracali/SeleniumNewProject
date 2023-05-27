package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_NavigateMethod {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Techproeducation sayfasina gidelim
        driver.navigate().to("https://techproeducation.com");    //get() methodu ile ayni mantikta calisir
        Thread.sleep(3000);     //Java kodlarini bekletmek icin kullanilir

        //Sonra Amazon sayfasina gidelim
        driver.navigate().to("https://amazon.com");
        Thread.sleep(3000);

        //Amazon sayfasinin basligini yazdiralim
        System.out.println("amazon sayfa basligi "+ driver.getTitle());
        Thread.sleep(3000);

        //Techproeducation sayfasina geri dönelim
        driver.navigate().back();
        Thread.sleep(3000);

        //Sayfa basligini yazdiralim
        System.out.println("techpro sayfa basligi "+ driver.getTitle());

        //Amazon sayfasina gidip url'i yazdiralim
        driver.navigate().forward();
        System.out.println("amazon sayfasi url "+driver.getCurrentUrl());

        //Amazon sayfasindayken sayfayi yenileyelim
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.close();


    }
}


