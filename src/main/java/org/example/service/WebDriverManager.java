//package org.example.service;
//
//
//    public class WebDriverManager {
//        private static WebDriver driver;
//        public static WebDriver getDriver() {
//            if (driver == null) {
//// Set up WebDriver
//                System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
//                driver = new ChromeDriver();
//            }
//            return driver;
//        }
//        public static void quitDriver() {
//            if (driver != null) {
//                driver.quit();
//                driver = null;
//            }
//        }
//    }
//
