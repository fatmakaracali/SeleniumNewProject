package techproed.day02_DriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_DriverMethods_ClassWork {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Amazon sayfasina gidelim

        driver.get("https://amazon.com");

        //sayfa basliginin  Amazon içerdiğini test edelim

        String actualTitle= driver.getTitle();
        String expectedTitle= "Amazon";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Test PASSED");
        }else System.out.println("Test FAILED");
        //Url'in https://www.amazon.com olduğunu test edelim

        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";

        if (actualUrl.equals(expectedUrl)){
            System.out.println("test passed");
        }else System.out.println("test failed "+ actualUrl);

        //Sayfayı kapatalım

        driver.close();   //Browser´i kapatir          driver.quit(); ---> birden fazla browser varsa hepsini kapatir







    }
}
