package org.cts.journeys;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;

	// To Launch Chrome Driver
	public static WebDriver launchChromeDriver() {
		System.setProperty("webdriver.chrome.driver", "D:\\WorkSpace\\JourneyPayment\\Driver\\chromedriver.exe");
		return driver = new ChromeDriver();

	}

	public static void max() {
		driver.manage().window().maximize();

	}

	// For Get Url
	public static void loadUrl(String url) {
		driver.get(url);

	}

	// For SendKeys
	public static void passValue(WebElement element, String value) {
		element.sendKeys(value);

	}

	// For perform click
	public static void click(WebElement element) {
		element.click();

	}

	// To Quit Browser
	public static void quitBrowser() {
		driver.quit();

	}

	public static void selectIndex(WebElement element, int index) {
		new Select(element).selectByIndex(index);

	}

	// Reusable For Excel Hotkeys
	public static String giveData(int rowNo, int cellNo) throws IOException {
		File excelLoc = new File("D:\\WorkSpace\\FirstAir_TestNg\\MydataSheet\\FirstAirPassengerDetail.xlsx");
		FileInputStream stream = new FileInputStream(excelLoc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Sheet1");
		Row r = s.getRow(rowNo);
		Cell c = r.getCell(cellNo);

		int type = c.getCellType();
		String name = "";

		if (type == 1) {
			name = c.getStringCellValue();
		} else {
			if (DateUtil.isCellDateFormatted(c)) {
				Date d = c.getDateCellValue();
				SimpleDateFormat a = new SimpleDateFormat("dd-MM-yy");
				name = a.format(d);
			} else {
				double d = c.getNumericCellValue();
				long l = (long) d;
				name = String.valueOf(l);
			}
		}
		return name;
	}

	public static void toWait(int seconds) throws InterruptedException {
		Thread.sleep(seconds);

	}

	public static void toEnter(int down) throws AWTException {
		Robot robo = new Robot();
		for (int i = 0; i <= down; i++) {
			robo.keyPress(KeyEvent.VK_DOWN);
			robo.keyRelease(KeyEvent.VK_DOWN);
		}
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void enter() throws AWTException {
		Robot robo = new Robot();
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}
}
