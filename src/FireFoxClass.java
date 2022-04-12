import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxClass {
    public static void main(String[] args) {


        String firefoxUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","Driver/geckodriver.exe");
        WebDriver firefoxDriver = new FirefoxDriver();// object created for FirefoxDriver
        firefoxDriver.get(firefoxUrl); // open Url
        System.out.println("Title of the page "+firefoxDriver.getTitle());
        System.out.println("Current Url Page : "+ firefoxDriver.getCurrentUrl());
        System.out.println("Page Source"+ firefoxDriver.getPageSource());
        WebElement emailOrange = firefoxDriver.findElement(By.id("txtUsername"));// find email id  field element
        emailOrange.sendKeys("myfirefoxemail@hotmail.co.uk");// entering the email address to email field
        WebElement passwordOrange = firefoxDriver.findElement(By.name("txtPassword"));// find password field element
        passwordOrange.sendKeys("BullySOMEONE101");// entering password to password field

    }
}
