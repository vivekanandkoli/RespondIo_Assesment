package HomeTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTest extends BaseClass {

	@Test(priority = 1)
	public void searchValidation() {

		homePageFuncs.InputDataInSearchBoxNClickSearchIcon();

		String itemName = homePageFuncs.verifySearchedItem();

		Assert.assertEquals("Blouse", itemName);

	}

	@Test(priority = 2)
	public void filterValidation() {

		homePageFuncs.clickWomenOption();

		homePageFuncs.selectFilter();

		String itemName = homePageFuncs.verifySearchedItem();

		Assert.assertEquals("Blouse", itemName);

	}

	@Test(priority = 3)
	public void addToCart() {

		homePageFuncs.clickPopularItem();

		homePageFuncs.clickAddToCartButton();

		String successMessage = homePageFuncs.verifySuccessMessage();

		Assert.assertEquals("Product successfully added to your shopping cart", successMessage);

	}

}
