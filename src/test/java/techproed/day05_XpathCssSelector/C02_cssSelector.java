package techproed.day05_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_cssSelector {
    public static void main(String[] args) throws InterruptedException {



        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin

        driver.get("https://the-internet.herokuapp.com/add_remove_elements/ ");

        Thread.sleep(2000);

        //Add Element butonuna basin

        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        Thread.sleep(2000);

        //Delete butonu'nun gorunur oldugunu test edin

        WebElement deleteButon= driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));

        if (deleteButon.isDisplayed()){
            System.out.println("Test PASSED");
        }else
            System.out.println("Test FAILED");

        Thread.sleep(2000);

        //Delete butonuna basin

        deleteButon.click();

        Thread.sleep(2000);

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin

        WebElement addRemoveElement =  driver.findElement(By.cssSelector("h3"));

        if (addRemoveElement.isDisplayed()){
            System.out.println("Add/Remove Element yazisi görunur");
        }else
            System.out.println("Add/Remove Element Yazisi görunur degil");


        //Sayfayı kapatın

        driver.close();


        /*
           ******** Xpath ve cssSelector Arasindaki Farklar:  *******
     -->Xpath text ile calisir
     -->cssSelector text ile calismaz
     *
     -->Xpath index'e göre arama yapabilir. Daha fazla kombinasyona sahiptir
     -->cssSelector index'e göre arama yapamaz. AMA daha hizli calisir



         */

    }
}
