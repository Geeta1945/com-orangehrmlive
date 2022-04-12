import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeClass {


    public static void main(String[] args) {
        String chromeUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver(); // object created for chrome driver
        chromeDriver.get(chromeUrl);// Open Url
        System.out.println("Title of the page : "+ chromeDriver.getTitle());// printing the current Url
        System.out.println("Current Url Page : "+chromeDriver.getCurrentUrl());// printing the current url
        System.out.println("Page Source" + chromeDriver.getPageSource());// printing the page source
        WebElement emailId = chromeDriver.findElement(By.id("txtUsername"));// find email id  field element
        emailId.sendKeys("myemail@yahoo.co.uk"); // entering the email address to email field
        WebElement passwordForOrange = chromeDriver.findElement(By.name("txtPassword"));// find password field element
        passwordForOrange.sendKeys("notfareTO1020");// entering password to password field


    }
}
