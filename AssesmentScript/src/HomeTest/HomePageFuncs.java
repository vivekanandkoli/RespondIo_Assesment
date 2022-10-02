package HomeTest;

import org.openqa.selenium.WebDriver;

public class HomePageFuncs extends HomePageObjects {

//	private WebDriver driver;

	public HomePageFuncs(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void InputDataInSearchBoxNClickSearchIcon() {
		try {

			getSearchBox().sendKeys("Blouse");

			getSearchButton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String verifySearchedItem() {
		String itemName = null;
		try {

			itemName = getSearchedItem().getText();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return itemName;
	}

	public void clickWomenOption() {
		try {

			getWomenOption().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void selectFilter() {
		try {

			getTopsCategory().click();

			getBlackColorCheckbox();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clickPopularItem() {
		try {

			getPopularItem().click();
			
			getPopularItem().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public void clickAddToCartButton() {
		try {
			
			Thread.sleep(5000);

			getAddToCartButton().click();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	public String verifySuccessMessage() {
		String successMessage = null;
		try {
			Thread.sleep(3000);

			successMessage = getSuccessMessage().getText();

		} catch (Exception e) {

			e.printStackTrace();
		}
		return successMessage;
	}

	public void closeDriver() {
		try {

			 driver.close();

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
