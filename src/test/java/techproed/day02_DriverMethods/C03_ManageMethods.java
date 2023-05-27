package techproed.day02_DriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_ManageMethods {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        //Browser'in konumunu yazdiralim
        System.out.println("sayfanin konumu "+ driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("sayfanin boyutlari "+driver.manage().window().getSize());

        //Browser'i maximize yapalim
        driver.manage().window().maximize();

        /*
    Bir web sitesine gittiğimizde browser default olarak bir boyutta gelir. Ve açılan browser'daki
webElementlere browser maximize olmadığı için ulaşamayabiliriz. Dolayısıyla browser'ı açtıktan sonra
maximize yaparsak driver bütün webelementleri görür ve rahatlikla müdehale edebilir. Bu yüzden
browser'ı açtıktan sonra ilk olarak driver.manage().window().maximize(); yapmamız bizim webelementlere
ulaşmada işimizi kolaylaştırır. Böylelikle fail almamış oluruz
 */

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Browser'in konumunu yazdiralim
        System.out.println("sayfanin konumu "+ driver.manage().window().getPosition());

        //Browser'in boyutlarini yazdiralim
        System.out.println("sayfanin boyutlari "+driver.manage().window().getSize());

        Thread.sleep(3000);

        //Sonra sayfayi minimize yapalim
        driver.manage().window().minimize();
        Thread.sleep(3000);

        //Sayfayi fullscreen yapalim
        driver.manage().window().fullscreen();
        Thread.sleep(3000);

        driver.manage().window().setPosition(new Point(50,50));              //istedigimiz konuma getirir

        driver.manage().window().setSize(new Dimension(600,600));      //
        Thread.sleep(3000);
        //sayfayi kapatiniz
        driver.close();

    }

}
