package Module_1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage_7
{
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	@FindBy(xpath="//button[text()='Add to cart']") private WebElement cart;
	@FindBy(xpath="(//button[text()='Remove'])[1]") private WebElement remove;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement menu;
	
	public SwagLabHomePage_7(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean getSwagLabHomePagelogo()
	{
		boolean result = logo.isDisplayed();
		return result;
	}
	public void clickSwagLabHomePagecart()
	{
		cart.click();
	}
	public String getSwagLabHomePageremovetext()
	{
		String text = remove.getText();
		return text;
	}
	public void clickSwagLabHomePagemenubtn()
	{
		menu.click();
	}

}
