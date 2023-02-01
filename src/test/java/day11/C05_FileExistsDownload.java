package day11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_FileExistsDownload extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //download.png dosyasını indirelim
        driver.findElement(By.xpath("//*[text()='download.png']")).click();

        //Ardından isExist( )  methodunda dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu= "C:\\Users\\pc\\Downloads\\download (3).png";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

        //İndirildiğini konsolda gösterin
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
    }
}
