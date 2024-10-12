package org.test;

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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {
	
	static WebDriver driver;
	
	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		
	}
	
	
	public static void browserMax() {
		driver.manage().window().maximize();
	}
	
	public static WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement findElementByClass(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		return element;
	}

	public static WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}

	public static void enterText(WebElement element, String data) {
		element.sendKeys(data);
	}
	
	public static String getTheText(WebElement element) {
		String text = element.getText();
		return text;
	}
	
	public static void mouseOverAction(WebElement element) {
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static String readData(String sheetName, int rowIndex, int cellIndex) throws IOException {
		
		String data = null;
		
		File file = new File("C:\\Users\\DELL\\workspace\\Sep12_Framework_2PM\\excel\\Adactinhotel.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		int type = cell.getCellType();
		
		if (type == 1) {
			data = cell.getStringCellValue();
		}
		
		if (type == 0) {
			
			if (DateUtil.isCellDateFormatted(cell)) {
				Date date = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
				data = dateFormat.format(date);
			} else {
				double d = cell.getNumericCellValue();
				long l = (long)d;
				data = String.valueOf(l);
			
			}
		}
		return data;
	}
	
	public static void clickElement(WebElement element) {
		element.click();
	}
	
	
	
	
	
	
	
	
	
}
