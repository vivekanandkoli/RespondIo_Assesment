package HomeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageObjects extends BaseClass {

	public HomePageObjects(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "search_query_top")
	private WebElement searchBox;

	@FindBy(xpath = "//button[@name='submit_search']")
	private WebElement searchButton;

	@FindBy(xpath = "(//a[@title='Blouse'])[2]")
	private WebElement searchedItem;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement womenOption;

	@FindBy(xpath = "//input[@id='layered_category_4']")
	private WebElement topsCategory;

	@FindBy(xpath = "//a[text()='Black']/../..//input")
	private WebElement blackColorCheckbox;

	@FindBy(xpath = "//ul[@id='homefeatured']//li[1]//h5")
	private WebElement popularItem;

	@FindBy(xpath = "//form//span[text()='Add to cart']")
	private WebElement addToCartButton;

	@FindBy(xpath = "//span[@title='Close window']/following-sibling::h2")
	private WebElement successMessage;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getSearchedItem() {
		return searchedItem;
	}

	public WebElement getWomenOption() {
		return womenOption;
	}

	public WebElement getTopsCategory() {
		return topsCategory;
	}

	public WebElement getBlackColorCheckbox() {
		return blackColorCheckbox;
	}

	public WebElement getPopularItem() {
		return popularItem;
	}

	public WebElement getAddToCartButton() {

		return addToCartButton;
	}

	public WebElement getSuccessMessage() {
		return successMessage;
	}

}
