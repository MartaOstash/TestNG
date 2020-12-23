package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

   WebDriver driver;
    //precondition
    @BeforeMethod
    public void openAndNavigate() {
        System.setProperty("webdriver.chrome.driver", "/Users/martaostash/eclipse-workspace/TestNG/Drivers/chromedriver-2");
        driver = new ChromeDriver();
        driver.navigate().to("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @Test
    public void validAdminLogin() {
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        WebElement welcomeMessage = driver.findElement(By.id("welcome"));
        if(welcomeMessage.isDisplayed()) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
    }
    @Test
    public void titleValidation(){
        String expectedTitle="Human Management System";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Title is valid Test passed");
        }else{
            System.out.println("Title doesn't match. Test Failed");
        }

    }
    @Test
    public  void logoDisplayed(){
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
        boolean displayed = logo.isDisplayed();
        if(displayed==true){
            System.out.println("Logo is Displayed.Test Passed");
        }else{
            System.out.println("logo is not displayed. Test failed");
        }


    }


    @AfterMethod
    public void closeBrowser() {
        driver.quit();

    }
}