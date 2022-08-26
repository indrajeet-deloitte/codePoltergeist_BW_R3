package bus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BusMainClass {

    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C://Users//amitkumar376//Desktop//MavenBugWar//chromedriver_win32chromedriver.exe");

//Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // navigate to URL
        driver.get(BusUILocator.url);

        //select origin
        driver.findElement(By.xpath(BusUILocator.org)).click();

        //select destination
        driver.findElement(By.xpath(BusUILocator.dest)).click();

        //select date
        driver.findElement(By.xpath(BusUILocator.date)).click();

        //select next immediate date
        driver.findElement(By.xpath(BusUILocator.dateNext)).click();

        //searchBus
        driver.findElement(By.xpath(BusUILocator.searchBussBtn));

        //proceed to select bus
        driver.findElement(By.xpath(BusUILocator.proceedBtn));
    }


}
