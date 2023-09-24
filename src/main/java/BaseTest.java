import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
    protected ChromeDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriverManager.chromedriver().setup();
        

        Configuration.browser = "chrome";
        RestAssured.baseURI = "https://stellarburgers.nomoreparties.site";
        Configuration.baseUrl = "https://stellarburgers.nomoreparties.site/"; // Замените на URL вашего тестируемого сайта
        Configuration.browserSize = "1920x1080"; // Установить размер браузера на экране
        Configuration.timeout = 10000; // Установить таймаут ожидания элементов (в миллисекундах)

        // Инициализируем ChromeDriver
        driver = new ChromeDriver();
    }
}
