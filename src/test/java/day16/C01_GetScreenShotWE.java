package day16;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;

public class C01_GetScreenShotWE extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);

        //Arama sonucunun SS'ini alalım.
        WebElement aramaSonucu= driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        File nutellaARamaSonucu= aramaSonucu.getScreenshotAs(OutputType.FILE);
        //Sadece Web elemnetin resmini alacaksak TakesScreenshot class'ını kullanmama gerek yok.
        // Locate Ettiğimiz web elementi direkt geçici bir file'a atıp FileUtils ile kopyalayıp yolunu(path) belirtiriz.
        FileUtils.copyFile(nutellaARamaSonucu, new File("target/ekranGoruntusuWE/WebESS.jpeg"));

    }
}
