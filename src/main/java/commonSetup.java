import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonSetup {
    WebDriver driver;
    void setup(String url){
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
         driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
    void cleanup(){
        driver.quit();}
}
