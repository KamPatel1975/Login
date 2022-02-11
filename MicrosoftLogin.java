package seleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class MicrosoftLogin {

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.edge.driver", "C:\\Users\\Cam\\IdeaProjects\\downloads\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("ico-login")).click();
        driver.findElement(By.id("Email")).sendKeys("kam2perth@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("Tester123");
        driver.findElement(By.className("login-button")).click();
    }
}