package day04;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_MavenIlkTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

                /*
       1- https://www.amazon.com/ sayfasina gidelim
       2- arama kutusunu locate edelim
       3- “Samsung headphones” ile arama yapalim
       4- Bulunan sonuc sayisini yazdiralim
       5- Ilk urunu tiklayalim
       6- Sayfadaki tum basliklari yazdiralim
     */

        //1- https://www.amazon.com/ sayfasina gidelim
        driver.get("https://amazon.com");

        //2- arama kutusunu locate edelim
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        //3- “Samsung headphones” ile arama yapalim
        aramaKutusu.sendKeys("Samsung headphones", Keys.ENTER);

        //4-Bulunan sonuc sayisini yazdiralim

        String[] sonucYazisi= driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"))
                .getText().split(" ");
        System.out.println("Samsung Handphone için arama sonucu = " +sonucYazisi[2]);



        /*
        Böyle de olabilir....
        WebElement sonucYazisi= driver.findElement(By.xpath("(//*[@class='a-section a-spacing-small a-spacing-top-small'])[1]"));
        System.out.println(sonucYazisi.getText());

         */

        //5- Ilk urunu tiklayalim
        WebElement ilkUrun= driver.findElement(By.xpath("(//*[@class='a-size-medium a-color-base a-text-normal'])[1]"));
        ilkUrun.click();

        // 6- Sayfadaki tum basliklari yazdiralim
        System.out.println(driver.findElement(By.xpath("//h1")).getText());







    }
}
