package org.cts.journeys;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends Base {
	public PaymentPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "creditCardNumberField")
	private WebElement ccNumberElmnt;

	public WebElement getCcNumberElmnt() {
		return ccNumberElmnt;
	}

	@FindBy(id = "credit-card-holderName")
	private WebElement ccNameElmnt;

	public WebElement getCcNameElmnt() {
		return ccNameElmnt;
	}

	@FindBy(id = "credit-card-expiration-date")
	private WebElement ccExpDateElmnt;

	public WebElement getCcExpDateElmnt() {
		return ccExpDateElmnt;
	}

	@FindBy(id = "credit-card-cvc")
	private WebElement ccCvcNumbElmnt;

	public WebElement getCcCvcNumbElmnt() {
		return ccCvcNumbElmnt;
	}

	@FindBy(id = "credit-card-street1")
	private WebElement ccAddrElmnt;

	public WebElement getCcAddrElmnt() {
		return ccAddrElmnt;
	}

	@FindBy(id = "react-select-15--value")
	private WebElement ccCountrySelElmnt;

	public WebElement getCcCountrySelElmnt() {
		return ccCountrySelElmnt;
	}

	@FindBy(id = "react-select-15--value-item")
	private WebElement ccIndElmnt;

	public WebElement geCcIndElmnt() {
		return ccIndElmnt;
	}

	@FindBy(id = "credit-card-city")
	private WebElement ccCityElmnt;

	public WebElement geCcCityElmnt() {
		return ccCityElmnt;
	}

	@FindBy(id = "credit-card-zip-code")
	private WebElement ccZipElmnt;

	public WebElement getCcZipCodeElmnt() {
		return ccZipElmnt;
	}

}
