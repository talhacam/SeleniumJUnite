package day11;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");


        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//*[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();


        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement isim= driver.findElement(By.xpath("(//*[@class='inputtext _58mg _5dba _2ph-'])[1]"));
        isim.sendKeys("Talha");
        actions.sendKeys(Keys.TAB).sendKeys("Çam").sendKeys(Keys.TAB).
                sendKeys("ttalhacam@hotmail.com").sendKeys(Keys.TAB).sendKeys("ttalhacam@hotmail.com").
                sendKeys(Keys.TAB).sendKeys("..Talha1..").sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys("10").sendKeys(Keys.TAB).sendKeys("Haz").sendKeys(Keys.TAB).sendKeys("1998").
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.RIGHT).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).
                perform();

    }
}
