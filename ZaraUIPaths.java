package zara;

import org.openqa.selenium.By;

class ZaraUIPaths{

    static String url = "https://www.zara.com/in/";

    public static By searchPath = By.xpath("//*[contains(text(),'Search')]");
    public static By dress = By.xpath("//button[contains(text(),'dress')]");

    public static By man = By.xpath("//button[contains(text(),'Man')]");

    public static By item4Man = By.xpath("(//div[@class= 'search-products-view__search-results']//descendant::li[4]//child::a)[1]");

    public static By addToCart = By.xpath("//span[contains(text(),'Add to bag')]");

    public static By errorMessageSizeNotSelected = By.xpath("//div[contains(text(),'YOU MUST SELECT A SIZE')]");

    public static By closePopUp = By.xpath("//span[contains(text(),'CLOSE')]");

    public static By size3 = By.xpath("(//span[@class='product-detail-size-info__main-label'])[3]");

    public static By crossButton = By.xpath("//*[@id='theme-modal-container']/div[2]/div/div/div/div[1]/button/svg");

    public static By filterButton = By.xpath("//span[@class='filters__button-title']");

    public static By plusSignFilter = By.xpath("//*[@id='accordion-0']/div/svg/path[2]");

    public static By dressSize = By.xpath("//span[text()= 'XS']");

    public static By firstProduct = By.xpath("(//div[@class= 'search-products-view__search-results']//descendant::li[1]//child::a)[1]//following-sibling::div//descendant::a");

    public static By verifyOutOfStock = By.xpath("//span[@class='product-detail-size-info__main-label']/../../..");

}