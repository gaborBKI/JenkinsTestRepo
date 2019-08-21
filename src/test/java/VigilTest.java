import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.*;

public class VigilTest {

    private static WebDriver driver;

    @BeforeAll
    public static void init(){
        driver = new FirefoxDriver();
        driver.get("http://www.index.hu");
    }

    @Test
    public void indexTest(){
        String title = driver.getTitle();
        assertEquals("Index", title);
    }

    @AfterAll
    public static void tearDown(){
        driver.quit();
    }

}
