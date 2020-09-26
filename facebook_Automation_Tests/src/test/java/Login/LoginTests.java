package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
 //import selenium driver
 private WebDriver driver;
 //import chrome driver
    public void setUp()throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        driver = new ChromeDriver();
 //Get project URL
 driver.get("https://www.facebook.com/ ");
 //wait to load project page
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 //maximize project page
 driver.manage().window().maximize();
 //Get Project Page title.
        System.out.println(driver.getTitle());
 //Locate username field.
 driver.findElement(By.id("email")).sendKeys("mtes7272@gmail.com");
 //Locate password field
        driver.findElement(By.id("pass")).sendKeys("MOUNTAIN12");
 //locate sign in button
 driver.findElement(By.name("login")).click();
 //wait
        Thread.sleep(10000);
 //Close window
 driver.quit();
    }
   //initiate
   public static void main (String args[]) throws InterruptedException {
        LoginTests tests = new LoginTests();
        tests.setUp();
   }
}
