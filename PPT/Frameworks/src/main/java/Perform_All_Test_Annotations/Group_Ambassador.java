package Perform_All_Test_Annotations;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Group_Ambassador {

    static WebDriver wd;

    
    public static void setUpBraveBrowser() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        wd = new ChromeDriver(option);
        
    }

    @Test(groups = {"ronaldo"})
    public void testRonaldo() throws InterruptedException {
    	setUpBraveBrowser();
        wd.get("https://www.cristianoronaldo.com/#cr7");
        Thread.sleep(3000);
        System.out.println("Ronaldo - Group: Ambassador");
        wd.quit();
    }

    @Test(groups = "virat")
    public void testVirat() throws InterruptedException {
    	setUpBraveBrowser();
        wd.get("https://viratkohli.foundation/");
        Thread.sleep(5000);
        System.out.println("Virat - Group: Ambassador");
        wd.quit();
    }
}
