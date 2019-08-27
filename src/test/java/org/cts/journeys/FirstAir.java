package org.cts.journeys;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstAir extends Base {
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launching Chrome");
		launchChromeDriver();
		loadUrl("https://firstair.ca/");
		max();
	}

	@AfterClass
	public void closingBrowser() {
		quitBrowser();
		System.out.println("BrowserClosed");
	}

	@Test(priority = 2)
	public void SrcAndDest() {
		HomePage obj1 = new HomePage();
		selectIndex(obj1.getSourceElement(), 10);
		selectIndex(obj1.getDestElement(), 8);
		click(obj1.getOneWayElement());
		click(obj1.getDepDate());
		click(obj1.getDepDate1());
		click(obj1.getFindFlightElement());

	}

	@Test(priority = 3)
	public void SelectFlight() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		FlightChoosePage obj = new FlightChoosePage();
		click(obj.getSelBtnElmnt());
		toWait(6000);
		click(obj.getSelBtnElmnt2());
		toWait(6000);
		click(obj.getSelPassBtn());
	}

	@Test(priority = 4)
	public void PassengerDetail() throws AWTException, InterruptedException, IOException {
		PassengerPage obj = new PassengerPage();
		toWait(6000);
		click(obj.getSelMr());
		toWait(2000);
		enter();
		passValue(obj.getfName(), giveData(1, 0));
		passValue(obj.getlName(), giveData(1, 1));
		click(obj.getDateElmnt());
		toEnter(8);
		click(obj.getMnthElmnt());
		toEnter(5);
		click(obj.getYearElmnt());
		toEnter(15);
		toWait(2000);
		passValue(obj.getSelPhNo(), giveData(1, 3));
		enter();
		passValue(obj.getEmailElmnt(), giveData(1, 4));
		passValue(obj.getCnfrmEmailElmnt(), giveData(1, 4));
		click(obj.getSkipElmnt());
	}

	@Test(priority = 5)
	public void PaymentDetail() throws InterruptedException, IOException, AWTException {
		toWait(3000);
		PaymentPage obj = new PaymentPage();
		passValue(obj.getCcNumberElmnt(), giveData(5, 0));
		passValue(obj.getCcNameElmnt(), giveData(5, 1));
		passValue(obj.getCcExpDateElmnt(), giveData(5, 2));
		passValue(obj.getCcCvcNumbElmnt(), giveData(5, 3));
		passValue(obj.getCcAddrElmnt(), giveData(5, 4));
		click(obj.getCcCountrySelElmnt());
		toEnter(99);
		passValue(obj.geCcCityElmnt(), giveData(5, 5));
		passValue(obj.getCcZipCodeElmnt(), giveData(5, 6));

	}

}
