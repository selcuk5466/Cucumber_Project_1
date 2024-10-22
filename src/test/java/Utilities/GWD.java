package Utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.Locale;

public class GWD {  // Genel Web Driver
    private static ThreadLocal<WebDriver> threadDriver=new ThreadLocal<>();
    public static ThreadLocal<String> threadBrowserName=new ThreadLocal<>();

    public static WebDriver getDriver()
    {

        Locale.setDefault(new Locale("EN"));
        System.setProperty("user.language","EN");


        if (threadBrowserName.get()==null) // XML den çalışmayan durumlar için
            threadBrowserName.set("chrome");  // default chrome

    if (threadDriver.get() == null) //hiç oluşturulmamış ise
    {
        switch (threadBrowserName.get()) {
            case "firefox":
                threadDriver.set(new FirefoxDriver());
            case "edge":
                threadDriver.set(new EdgeDriver());
            default:
                threadDriver.set(new ChromeDriver());
        }
            threadDriver.get().manage().window().maximize();
            threadDriver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
    }


        // eğer zaten oluşmuşsa önceden oluşmuş driver ı gönder
        return threadDriver.get();
    }

    public static void quitDriver(){

        //test sonucu ekranı bir miktar beklesin diye
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null)
        {
            threadDriver.get().quit();

            WebDriver hattaki=threadDriver.get();
            threadDriver.set(hattaki);
        }

    }

}
