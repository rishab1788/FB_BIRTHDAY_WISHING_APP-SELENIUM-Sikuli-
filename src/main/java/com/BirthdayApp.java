package com;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import com.tigervnc.rdr.Exception;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;


/**
 * Created by Rishabh on 8/8/2017.
 */
public class BirthdayApp {


    public static void main(String[] args) throws Exception, FindFailed {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.fb.com");

        // Today's Birthdays

        String xp = "//*[@id='email']";

        WebElement menu = driver.findElement(By.xpath(xp));
        menu.click();
        menu.clear();
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].setAttribute('value', '"
                + "youremail" + "')", menu);

        xp = "//*[@id='pass']";
        menu = driver.findElement(By.xpath(xp));
        jse.executeScript("arguments[0].setAttribute('value', '"
                + "yourpass" + "')", menu);
        menu.submit();
        xp = "//*[@id='navItem_2344061033']/a/span";

        driver.findElement(By.linkText("Events")).click();

        System.out.print(driver.getCurrentUrl());
        String ss = driver.getCurrentUrl();
        driver.get(ss);

        driver.findElement(By.linkText("Birthdays")).click();
        ss = driver.getCurrentUrl();
        driver.get(ss);

//driver.findElement(By.id("birthdays_today_card")).click();

        Screen screen = new Screen();
 
        Pattern image1 = new Pattern("image\\todaysbirthday.PNG");
        screen.doubleClick(image1);
        for (int l = 0; l < 3; l++) {
            if (l == 0) {
                screen.type(Key.TAB);
                screen.type(Key.TAB);
            } else {
                screen.type(Key.TAB);
                screen.type(Key.TAB);
                screen.type(Key.TAB);
            }
            screen.type(" Wish you a many many happy returns of the day. May God bless you with health, wealth ");
            screen.type(Key.ENTER);
        }
        //            screen.type(pattern, "   Wish you a many many happy returns of the day. " +
//                    "May God bless you with health, wealth ");
//            screen.type(Key.ENTER);
//
//        }
//

        /*
         * for (int i = 0; i <100; i++) {
		 *
		 *
		 * jse.executeScript("window.scrollBy(0,250)", ""); Thread.sleep(1000);
		 *
		 * }
		 */// Move mouse pointer on DropDown Menu
		/*
		 * Actions actions=new Actions(driver);
		 * actions.moveToElement(menu).perform();
		 * driver.findElement(By.linkText("Contact Us")).click();
		 */
    }

}
