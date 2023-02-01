package day10;

import org.junit.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_IlkTestBaseClass2 extends TestBaseBeforeClassAfterClass {

    @Test
    public void test(){
        driver.get("http://www.amazon.com");
    }


}
