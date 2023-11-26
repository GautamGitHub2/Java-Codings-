package CoreJavaHandsOn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
    public static void main(String [] args) {

        //Chrom Browser

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");

        //ChromeDriver driver=new ChromeDriver();

        WebDriver driver=new ChromeDriver();

        driver.get("https://google.com/");

        
    }
}
