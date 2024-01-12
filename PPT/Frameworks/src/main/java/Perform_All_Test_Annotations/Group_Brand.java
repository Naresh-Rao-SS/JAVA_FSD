package Perform_All_Test_Annotations;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Group_Brand {

    static WebDriver wd;

    public static void setUpBraveBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
    }

    @Test(groups = {"Brand", "ronaldo"})
    public void testNike() throws InterruptedException {
        setUpBraveBrowser();
        wd.get("https://www.nike.com/in/");
        Thread.sleep(700);
        WebElement searchElementNike = wd.findElement(By.name("search"));
        searchElementNike.sendKeys("Nike Downshifter 13 Men's Road Running Shoes");
        searchElementNike.sendKeys(Keys.ENTER);
        Thread.sleep(6000);
        System.out.println("Nike Group: Brand");
        wd.quit();
    }

    @Test(groups = {"Brand", "virat"})
    public void testPuma() throws InterruptedException {
    	setUpBraveBrowser();
        wd.get("https://in.puma.com/in/en");
        Thread.sleep(10000);
        WebElement searchElementPuma = wd.findElement(By.xpath("//*[@id=\"nav-bar-sticky\"]/nav/div/div/button[2]"));
        searchElementPuma.sendKeys("Royal Challengers Bangalore 2023 Men's Regular Fit Replica Jersey", Keys.ENTER);
        Thread.sleep(7000);
        System.out.println("Puma Group: Brand");
        wd.quit();
    }
}
