package org.example;

public class BaseTest extends Utils
{
    DriverManager driverManager = new DriverManager();

    void setup()
    {
        driverManager.openBrowser();
    }

    void teardown()
    {
        driverManager.closeBrowser();
    }
}
