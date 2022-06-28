package day15_writeExcel_screenshot;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class C02_TumSayfaScreenShot extends TestBase {

    @Test
    public void tumSayfa() throws IOException {
        // amazon sayfasina gidelim tum sayfanin fotografini cekelim
        driver.get("https://www.amazon.com");

        TakesScreenshot ts = (TakesScreenshot) driver;

        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("YYMMddHHmmss");

        String tarih=date.format(dtf);

        File tumSayfaResim = new File("target/screenShot/tumSayfa" + tarih + ".jpeg");

        File geciciDosya = ts.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(geciciDosya, tumSayfaResim);


    }
}
