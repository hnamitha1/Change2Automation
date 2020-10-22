package com.SeleniumReusableFunction;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;


//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Library;

public class SeleniumUtility  extends Library{

	WebDriver driver ;
	
	public SeleniumUtility(WebDriver driver)
	{
		this.driver =driver;

	}

	public void snapshot(String fileName)
	{
		String	path="./target/Screenshot/Screenshot";
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File(path+fileName+System.currentTimeMillis()+".png");
		/*try {
		//	Files.copyFile(src, dest);
			logger.info("ScreenShot taken in name of "+fileName);
		} catch (IOException e) {
			logger.info("Error in taking ScreenShots");
		}*/
	}

	public  void navigate_forward() {
		driver.navigate().forward();
	}

	public  void navigate_back() {
		driver.navigate().back();
	}

	public  void refresh() {
		driver.navigate().refresh();
	}

    public String getCurrentURL() {
    	return driver.getCurrentUrl();
    }

	public String getTitle() {
		return  driver.getTitle();
	}


}



