package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.ArrayList;
import java.util.List;

public class C04_Actions extends TestBaseBeforeAfter {
    @Test
    public void test1(){
        //https://the-internet.herokuapp.com/context_menu sitesine gidelim
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //Cizili alan bölümün uzerinde sag click yapalim
        WebElement cigiziliAlan= driver.findElement(By.xpath("//*[@id='hot-spot']"));
        Actions actions = new Actions(driver);
        actions.contextClick(cigiziliAlan).perform();

        //Alert’te cikan yazinin “You selected a context menu” oldugunu test edelim.
        Assert.assertEquals("You selected a context menu", driver.switchTo().alert().getText());

        //Alert'e tamam de
        driver.switchTo().alert().accept();

        //Elemental Selenium linkine tiklayalim
        driver.findElement(By.xpath("//*[text()='Elemental Selenium']")).click();
        List<String> windowList= new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(1));

        //Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim
        Assert.assertEquals("Elemental Selenium", driver.findElement(By.xpath("//h1")).getText());


    }

}
