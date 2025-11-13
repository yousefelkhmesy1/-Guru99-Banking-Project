package Project;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newCustomer {
    WebDriver driver;
    @BeforeMethod
    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V4/index.php");
        driver.findElement(By.name("uid")).sendKeys("mngr644860");
        driver.findElement(By.name("password")).sendKeys("Yousef213@");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        driver.get("https://demo.guru99.com/V4/manager/addcustomerpage.php");
    } @Test
    public void vaild_form() {
        driver.findElement(By.name("name")).sendKeys("Adam Smith");
        driver.findElement(By.xpath("//input[@name='rad1' and @value='m']")).click();
        driver.findElement(By.name("dob")).sendKeys("03/21/2001");
        driver.findElement(By.name("addr")).sendKeys("21st Las city");
        driver.findElement(By.name("city")).sendKeys("Haloa");
        driver.findElement(By.name("state")).sendKeys("Holila");
        driver.findElement(By.name("pinno")).sendKeys("123456");
        driver.findElement(By.name("telephoneno")).sendKeys("0123456789");
        driver.findElement(By.name("emailid")).sendKeys("test.03@gmail.com");
        driver.findElement(By.name("password")).sendKeys("asdzxc123@");
        driver.findElement(By.name("sub")).click();
    } @AfterMethod
    public void close_browser() {
        if (driver != null) {
            driver.quit();
        }
    }
}