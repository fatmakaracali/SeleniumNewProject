package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class C03_RelativeLocators {




    /*
          ***** Relative Locators  ****
          * Bir web element'i direkt locate edemedigimiz durumlarda, o web elementi etrafindaki web elementlerin
          * referansi ile tarif etmemizi saglar

          * Bir web sayfasinda benzer özelliklere sahip web elementlerin oldugu durumlarda kullanilabilir
          *
          * above-->Belirtilen elementin ustunde olan elementi secer
          * below-->Belirtilen elementin altinda olan elementi secer
          * to_left_of -->Belirtilen elementin solunda olan elementi secer
          * to_right_of-->Belirtilen elementin saginda olan elementi secer
          * near -->      Belirtilen elementin yaninda/yakininda olan elementi secer




     */
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));





        // amazon sayfasına gidelim
        driver.get("https://amazon.com");



        // city bike aratalım
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);


        // Relative Locator kullanarak Hybrid Bikes üstündeki Road Bikes'a tıklayalım
        WebElement hybridBikes = driver.findElement(By.xpath("//span[text()='Hybrid Bikes']"));

        WebElement roadBikes = driver.findElement(with(By.tagName("span")).above(hybridBikes));

        roadBikes.click();



        // sayfayı kapatın
        driver.close();


    }
}
