package day11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileExists extends TestBaseBeforeAfter {
    @Test
    public void test1() {

        //Şuanki içinde bulunduğum yolu gösterir
        System.out.println(System.getProperty("user.dir"));  //C:\Users\pc\Desktop\selenium\Batch81JUnit

        //Geçerli kullanıcının ana dizinini verir
        System.out.println(System.getProperty("user.home"));//C:\Users\pc


/*
        String farkliBolum = System.getProperty("user.home");
        //"C:\Users\Lenovo\OneDrive\Masaüstü\text.txt" --> masa üstündeki dosyanın yolu
        String ortakBolum = "\\OneDrive\\Masaüstü\\tex.txt";

        String masaUstuDosyaYolu = farkliBolum+ortakBolum; // Masaüstündeki dosya yolunu gösterir

        System.out.println(masaUstuDosyaYolu); //C:\Users\Lenovo\OneDrive\Masaüstü\text.txt
        System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

 */

        String dosyaYolu = "C:\\Users\\Lenovo\\OneDrive\\Masaüstü\\text.txt";
        //System.out.println(Files.exists(Paths.get(dosyaYolu)));
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        /*
        Bir web sitesinden indirdiğimiz yada windows içinde oluşturduğumuz dosyanın indiğini yada orda olduğunu
        test edebilmem için o dosyanın üzerine shift tuşuna basılı olarak sağ klik yapıp dosyanın yolunu kopyalayıp
        bir string değişkene atarız ve dosyayı doğrulamak için
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))); bu methodu kullanırız
         */



    }
}
