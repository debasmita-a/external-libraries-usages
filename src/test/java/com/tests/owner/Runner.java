package com.tests.owner;

import com.utils.owner.PropertyUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class Runner {

    public static void main(String[] args){
        String browser = PropertyUtils.readPropertyFile("browser");
        System.out.println("browser name: " + browser);

        WebDriver driver = new ChromeDriver();
        String timeout = PropertyUtils.readPropertyFile("timeout");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.parseLong(timeout)));

        String isScreenshotNeeded = PropertyUtils.readPropertyFile("takesscreenshot");
        if(isScreenshotNeeded.equalsIgnoreCase("true")){
            /*

             */
        }

        String favtools = PropertyUtils.readPropertyFile("favtools");
        List<String> tools = Arrays.asList(favtools.split(","));
        tools.forEach(System.out::println);

    }
}
