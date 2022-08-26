package zara;
//import zara.ZaraUIPaths;
import custom.report.Report;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;

public class ZaraMainClass {

    public static void main() throws IOException {
        System.setProperty("webdriver.chrome.driver", "C://Users//amitkumar376//Desktop//MavenBugWar//chromedriver_win32chromedriver.exe");

//Creating an object of ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Report.reportBegin();
        // navigate to URL
        driver.get(ZaraUIPaths.url);
        Report.reportMain("URL ", "PASS", "Landed on Url");

        driver.findElement(ZaraUIPaths.searchPath).click();
        Report.reportMain("Seacrh clicked", "PASS", "Search clicked");

        driver.findElement(ZaraUIPaths.dress).click();
        Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        driver.findElement(ZaraUIPaths.man).click();
        Report.reportMain("Clicked on Man", "PASS", "Clicked on Man");

        //4th item on wardrobe
        driver.findElement(ZaraUIPaths.item4Man).click();
        Report.reportMain("Clicked on 4th item", "PASS", "Clicked on 4 item");

        //add to bag
        driver.findElement(ZaraUIPaths.addToCart).click();
        Report.reportMain("Clicked on add to cart", "PASS", "Clicked on add to cart");

        if(driver.findElement(ZaraUIPaths.errorMessageSizeNotSelected).isDisplayed()){
            System.out.println("YOU MUST SELECT A SIZE");
            Report.reportMain("Error message for size", "PASS", "Error message for size");
        }

        //close popup
        driver.findElement(ZaraUIPaths.closePopUp).click();
        Report.reportMain("Clicked on close", "PASS", "Clicked on close");

        //3rd size
        driver.findElement(ZaraUIPaths.size3).click();
        Report.reportMain("Clicked on size 3", "PASS", "Clicked on size 3");

        //add to bag
        driver.findElement(ZaraUIPaths.addToCart).click();
        Report.reportMain("Clicked on add to cart", "PASS", "Clicked on add to cart");

        //Close cart popup
        driver.findElement(ZaraUIPaths.crossButton).click();
        Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        //click on search
        driver.findElement(ZaraUIPaths.searchPath).click();
        Report.reportMain("Closed cart", "PASS", "Close to cart");

        //click on dress
        driver.findElement(ZaraUIPaths.dress).click();
        Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        //click on filter
        driver.findElement(ZaraUIPaths.filterButton).click();
        Report.reportMain("Clicked on filter button", "PASS", "Clicked on filter button");

        //click on +
        driver.findElement(ZaraUIPaths.plusSignFilter).click();
        Report.reportMain("Clicked on size filte", "PASS", "Clicked on size filter");

        //select 3rd size
        driver.findElement(ZaraUIPaths.dressSize).click();
        Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        //click on first product in row one

        driver.findElement(ZaraUIPaths.firstProduct).click();
        Report.reportMain("Clicked on first product", "PASS", "Clicked on first product");

        List<WebElement> el = driver.findElements(By.xpath("//span[@class='product-detail-size-info__main-label']/../../.."));
        int i=0;
        i=selectSizeAvailable(driver);
        Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        if(i>=(el.size()-1)){
            driver.navigate().back();
            driver.findElement(By.xpath("(//div[@class= 'search-products-view__search-results']//descendant::li[2]//child::a)[1]//following-sibling::div//descendant::a")).click();
            List<WebElement> el1 = driver.findElements(By.xpath("//span[@class='product-detail-size-info__main-label']/../../.."));
            int i2=selectSizeAvailable(driver);
            Report.reportMain("Clicked on dress", "PASS", "Clicked on dress");

        }
    }

    public static int selectSizeAvailable(WebDriver driver){
        List<WebElement> el1 = driver.findElements(ZaraUIPaths.verifyOutOfStock);
        int i2=0;
        for(i2=0;i2<el1.size();i2++){
            if(!el1.get(i2).getAttribute("data-qa-action").equals("size-out-of-stock")){
                el1.get(i2).click();
                driver.findElement(ZaraUIPaths.addToCart).click();

                //Close cart popup
                driver.findElement(By.xpath("//*[@id='theme-modal-container']/div[2]/div/div/div/div[1]/button/svg")).click();
                break;
            }
        }
        return i2;
    }

}
