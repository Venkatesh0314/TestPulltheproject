import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLoginTest_3 {
    public static void main(String[] args){
        //path set to the chrome driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // to open the url
        driver.get("https://qaebank.ccbp.tech/ebank/login");

        // to enter the username
        WebElement username=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[1]/input"));
        username.sendKeys("142420");
        // to enter the password
        WebElement password=driver.findElement(By.xpath("/html/body/div/div/div/div/form/div[2]/input"));
        password.sendKeys("231225");
        // to enter  to the button
        WebElement finalSubmit=driver.findElement(By.xpath("/html/body/div/div/div/div/form/button"));
        finalSubmit.click();
        // expected the Url
        String expectedUrl="https://qaebank.ccbp.tech/";
        // get currentUrl
        String currentUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(currentUrl)){
            System.out.println("successfully login");
        }else{
            System.out.println("current page title in a new line.");
        }
        driver.quit();
    }
}
