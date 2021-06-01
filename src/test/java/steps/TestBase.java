package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasketPage;
import pages.CameraPage;
import pages.MainPage;
import steps.StepDefinition;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestBase {


    @Before
    public void start(){
        System.setProperty("webdriver.chrome.driver","D:\\beat\\chromedriver.exe");
        StepDefinition.driver = new ChromeDriver();
        StepDefinition.driver.manage().window().maximize();
        StepDefinition.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @After
    public void end(){
        StepDefinition.driver.quit();
    }
}
