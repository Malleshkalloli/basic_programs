package com.thermmo.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_PGM {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/mallesh.kalloli/Desktop/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");

        driver.close();
    }
}
    