package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBaseBeforeAfter;

import java.util.List;

public class C03_WebTables extends TestBaseBeforeAfter {
    @Test
    public void name() {

        //Bir önceki class'daki adrese gidelim
        //Login() methodunu kullanarak sayfaya giriş yapalım

        login();
        int satir = 3;
        int sutun = 4;

        //input olarak verilen satır sayısı ve sutun sayısına sahip cell'deki text'i yazdıralım
        WebElement cell= driver.findElement(By.xpath("//tbody//tr["+satir+"]//td["+sutun+"]"));
        //tr["+satir+"]//td["+sutun+"] yerine tr["3"]//td["4"] yapılabilirdi.
        System.out.println("Satır ve sutundaki text : " +cell.getText());

        //Price başlığındaki tüm numaraları yazdırın.
        List<WebElement> priceBasligi= driver.findElements(By.xpath("//tbody//tr//td[6]"));
        for (WebElement w:priceBasligi) {
            System.out.println(w.getText());

        }




    }

    private void login() {
        driver.get("https://www.hotelmycamp.com/admin/HotelRoomAdmin");


        Actions actions = new Actions(driver);
        WebElement userName = driver.findElement(By.xpath("//*[@id='UserName']"));
        actions.click(userName).sendKeys("manager").sendKeys(Keys.TAB).sendKeys("Manager1!").sendKeys(Keys.ENTER).perform();

    }
}
