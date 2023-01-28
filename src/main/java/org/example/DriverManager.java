package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager extends Utils
{

    void openBrowser()
    {
        driver = new ChromeDriver();
        driver.get("http://www.demo.nopcommerce.com");
        driver.manage().window().maximize();
    }

    void closeBrowser()
    {
        driver.quit();
    }
}
