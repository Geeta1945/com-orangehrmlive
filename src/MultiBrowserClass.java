import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowserClass {
    static String orangeBrowser = "Firefox";
    static String mainUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driverForAll;


    public static void main(String[] args) {

        if(orangeBrowser.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver","Driver/chromedriver.exe");
            driverForAll =new ChromeDriver();
            driverForAll.get(mainUrl);

        }
        else if(orangeBrowser.equalsIgnoreCase("Edge"))
        {
            System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
            driverForAll = new EdgeDriver();
           }

        else if(orangeBrowser.equalsIgnoreCase("Firefox"))
        {
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        driverForAll = new FirefoxDriver();

        }
        else{

            System.out.println("Wrong Browser Name");
        }
        driverForAll.get(mainUrl);
        driverForAll.manage().window().maximize();
        WebElement emailId =driverForAll.findElement(By.id("txtUsername"));// find email id  field element
        emailId.sendKeys("myemail@yahoo.co.uk"); // entering the email address to email field
        WebElement passwordForOrange = driverForAll.findElement(By.name("txtPassword"));// find password field element
        passwordForOrange.sendKeys("notfareTO1020");// entering password to password field
        driverForAll.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
}
