import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeClass {
    public static void main(String[] args) {
        String edgeUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "Driver/msedgedriver.exe");
        WebDriver edgeDriver = new EdgeDriver(); // object created for chrome driver
        edgeDriver.get(edgeUrl);// Open Url
        System.out.println("Title of the page : "+ edgeDriver.getTitle());// printing the current Url
        System.out.println("Current Url Page : "+edgeDriver.getCurrentUrl());// printing the current url
        System.out.println("Page Source" + edgeDriver.getPageSource());// printing the page source
        WebElement emailId = edgeDriver.findElement(By.id("txtUsername"));// find email id  field element
        emailId.sendKeys("myemail@yahoo.co.uk"); // entering the email address to email field
        WebElement passwordForOrange = edgeDriver.findElement(By.name("txtPassword"));// find password field element
        passwordForOrange.sendKeys("notfareTO1020");// entering password to password field


    }

}
