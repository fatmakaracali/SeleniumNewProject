package techproed.day01_IlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ilkclass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        //Java uygulamalarinda sistem özelliklerini ayarlamak icin setPropertymethodu ile kullaniriz

        System.out.println(System.getProperty("webdriver.chrome.driver"));
        //getProperty ile "key" degerini girerek "value"ya ulasabilirim

        WebDriver driver = new ChromeDriver();
        //ChromeDriver turunde yeni bir obje olusturduk

        driver.get("https://www.google.com");
        //get()

    }
}

