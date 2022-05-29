import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class seleniumTest {
    WebDriver driver;
    @Before
    public void before(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://formy-project.herokuapp.com/form");
    }
    @After
    public void after(){
        driver.quit();
    }
    @Test
    public void initialTest(){
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Harry");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Potter");
        WebElement job = driver.findElement(By.id("job-title"));
        job.sendKeys("Wizard");
        WebElement educationButton = driver.findElement(By.id("radio-button-1"));
        educationButton.click();
        assertTrue(educationButton.isSelected());
        WebElement s = driver.findElement(By.className("btn"));
        s.submit();
    }
    @Test
    public void secondTest(){
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("Noorhan");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("Hatem");
        WebElement job = driver.findElement(By.id("job-title"));
        job.sendKeys("University Student");
        WebElement educationButton = driver.findElement(By.id("radio-button-2"));
        educationButton.click();
        WebElement s = driver.findElement(By.className("btn"));
        s.submit();
    }

    @Test
    public void thirdTest(){
        WebElement firstname = driver.findElement(By.id("first-name"));
        firstname.sendKeys("xxxx");
        WebElement lastname = driver.findElement(By.id("last-name"));
        lastname.sendKeys("yyyy");
        WebElement job = driver.findElement(By.id("job-title"));
        job.sendKeys("zzzz");
        WebElement educationButton = driver.findElement(By.id("radio-button-3"));
        educationButton.click();
        WebElement s = driver.findElement(By.className("btn"));
        s.submit();
    }
}
