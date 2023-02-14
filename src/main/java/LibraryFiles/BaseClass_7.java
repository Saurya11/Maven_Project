package LibraryFiles;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass_7
{
	public WebDriver driver;
	
	public void initializebrowser() throws IOException
	{
		driver=new EdgeDriver();
		
		driver.get(UtilityClass_7.getPFdata("URL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	

}
