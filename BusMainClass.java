package bus;
import custom.report.Report;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
public class BusMainClass {

    public static void main(String args[]) throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Users//amitkumar376//Desktop//MavenBugWar//chromedriver_win32chromedriver.exe");
        Report.reportBegin();
//Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // navigate to URL
        driver.get(BusUILocator.url);
        Report.reportMain("URL ", "PASS", "Landed on Url");
        //select origin
        driver.findElement(By.xpath(BusUILocator.org)).click();
        Report.reportMain("Selected Origin ", "PASS", "Selected origin");
        //select destination
        driver.findElement(By.xpath(BusUILocator.dest)).click();
        Report.reportMain("Selected Origin ", "PASS", "Selected origin");
        //select date
        driver.findElement(By.xpath(BusUILocator.date)).click();
        Report.reportMain("Selected date ", "PASS", "Selected date");
        //select next immediate date
        driver.findElement(By.xpath(BusUILocator.dateNext)).click();
        Report.reportMain("Selected next date ", "PASS", "Selected next date");
        //searchBus
        driver.findElement(By.xpath(BusUILocator.searchBussBtn));
        Report.reportMain("Selected bus ", "PASS", "Selected bus");
        //proceed to select bus
        driver.findElement(By.xpath(BusUILocator.proceedBtn));
        Report.reportMain("proceed to select Bus ", "PASS", "Searched bus");
    }


}