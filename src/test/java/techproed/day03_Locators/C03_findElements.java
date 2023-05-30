package techproed.day03_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_findElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // https://www.amazon.com sayfasına gidiniz

        driver.get("https://www.amazon.com");

        // Amazon sayfasında kac tane link olduğunu konsolda yazdırın

        driver.findElements(By.tagName("a"));
        List<WebElement> linklerListesi= driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi :"+linklerListesi.size());


        // Linkleri konsolda yazdırın

        for (WebElement each : linklerListesi) {
            System.out.println(each.getText());
        }

        /*
        for (WebElement w:linklerListesi) {
    if (!w.getText().isEmpty()){
        System.out.println(w.getText());
    }
         */

        /*LAMBDA ILE

        linklerListesi.forEach(link -> {if (!link.getText().isEmpty())
        {System.out.println(link.getText());}});

         */


        // sayfayı kapatın


        //Shop deals in Electronics webElementinin yazısını yazdıralım
        System.out.println("**********************************************************");
        System.out.println(driver.findElement(By.id("nav-link-accountList-nav-line-1")).getText());
        WebElement webElementYazisi = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        System.out.println(webElementYazisi.getText());

        driver.close();
    }
}
