package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyFirstSeleniumTest {

    @BeforeClass
    public void init()
    {
        System.setProperty("webdriver.chrome.driver", "C:/Users/19094/Practice-2019/SeleniumTest/src/main/java/driver/chromedriver.exe");
        //System.setProperty("webdriver.ie.driver", "C:/Users/19094/Practice-2019/SeleniumTest/src/main/java/driver/IEDriverServer.exe");
        System.setProperty("webdriver.gecko.driver", "C:/Users/19094/Practice-2019/SeleniumTest/src/main/java/driver/geckodriver");
    }
    @Test
    public void loginTest() throws Exception
    {
        //WebDriver wd  = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();
        // wd.manage().window().maximize();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("www.gmail.com");
        WebElement userName = driver.findElement(By.xpath("xpath"));
        userName.sendKeys("Abhirup");
        userName.sendKeys("");
        userName.isDisplayed();
        userName.isEnabled();
        userName.isSelected();
        //To check if element is visible or enable
        /**
         * isDisplayed()
         isSelected()
         isEnabled()
         */
        this.takeSnapShot(driver, "c://test.png") ;
        driver.getTitle();
        driver.wait(1000l);
        /**
         * The value in the dropdown can be selected using WebDriver’s Select class.

         Syntax:

         selectByValue:
         Select selectByValue = new Select(driver.findElement(By.id(“SelectID_One”)));
         selectByValue.selectByValue(“greenvalue”);

         selectByVisibleText:
         Select selectByVisibleText = new Select (driver.findElement(By.id(“SelectID_Two”)));
         selectByVisibleText.selectByVisibleText(“Lime”);

         selectByIndex:
         Select selectByIndex = new Select(driver.findElement(By.id(“SelectID_Three”)));
         selectByIndex.selectByIndex(2);
         */
        Select selectByValue = new Select(userName);
        selectByValue.selectByValue("user1");
        selectByValue.selectByVisibleText("user1");
        selectByValue.selectByIndex(1);
        /**
         * Navigate back,forward refresh
         */
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.navigate().to("www.google.com");
        driver.wait(30000);
        /**
         * Q #30) What is the difference between driver.close() and driver.quit command?

         close(): WebDriver’s close() method closes the web browser window that the user is currently working on or we can also say the window that is being currently accessed by the WebDriver. The command neither requires any parameter nor does it return any value.

         quit(): Unlike close() method, quit() method closes down all the windows that the program has opened. Same as close() method, the command neither requires any parameter nor does is return any value.
         */
        /**
         * Following are the JUnit Annotations:

         @Test: Annotation lets the system know that the method annotated as @Test is a test method. There can be multiple test methods in a single test script.
         @Before: Method annotated as @Before lets the system know that this method shall be executed every time before each of the test methods.
         @After: Method annotated as @After lets the system know that this method shall be executed every time after each of the test method.
         @BeforeClass: Method annotated as @BeforeClass lets the system know that this method shall be executed once before any of the test methods.
         @AfterClass: Method annotated as @AfterClass lets the system know that this method shall be executed once after any of the test methods.
         @Ignore: Method annotated as @Ignore lets the system know that this method shall not be executed
         */
		    /*
		     * NoSuchElementException.
				NoSuchWindowException.
				NoSuchFrameException.
				NoAlertPresentException.
				InvalidSelectorException.
				ElementNotVisibleException.
				ElementNotSelectableException.
				TimeoutException.
		     */
        /**
         * Scroll down :
         */
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");
        /**
         *  How can you fetch an attribute from an element? How to retrieve typed text from a textbox?
         We can fetch the attribute of an element by using the getAttribute() method. Sample code:

         1
         2
         */
        WebElement eLogin = driver.findElement(By.name("Login"));
        String LoginClassName = eLogin.getAttribute("classname");
        //WebDriver wdIE  = new InternetExplorerDriver();
        //wdIE.manage().window().maximize();

    }

    private void takeSnapShot(WebDriver driver, String string) {
        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(string);
        //FileUtils.copyFile(SrcFile, DestFile);
        //Call getScreenshotAs method to create image file

        //  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        // File DestFile=new File(fileWithPath);

        //Copy file at destination

        // FileUtils.copyFile(SrcFile, DestFile);

    }
}
