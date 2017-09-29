package selenium.tests;

/*
 * @author a_sinsinwal
 *
 *
 */
import static org.junit.Assert.*;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.ChromeDriverManager;

public class WebTest {
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() throws Exception {
		// driver = new HtmlUnitDriver();
		ChromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
	}

	@AfterClass
	public static void tearDown() throws Exception {
		driver.close();
		driver.quit();
	}

	/*
	 * Default Example - Testing purpose
	 *
	 */
	@Test
	public void googleExists() throws Exception {
		driver.get("http://www.google.com");
		assertEquals("Google", driver.getTitle());
	}

	/*
	 * Test1 - The participant count of "Frustration of Software Developers" is 55
	 *
	 */
	@Test
	public void paricipantCountTest() throws Exception {
		driver.get("http://checkbox.io/studies.html");
		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		// List<WebElement> spans =
		// driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));
		WebElement parent = driver
				.findElement(By.xpath("//span[.='Frustration of Software Developers']/ancestor::div[@class='row']"));
		String frustrated = parent.findElement(By.className("backers")).getText();
		assertEquals("The number of frustrated developers are not equal to 55", "55", frustrated);
	}

	/*
	 * Test2 - The total number of studies closed is 5.
	 *
	 */
	@Test
	public void closedStudies() throws Exception {
		driver.get("http://www.checkbox.io/studies.html");

		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='CLOSED']")));
		List<WebElement> closedSet = driver.findElements(By.xpath("//a[@class='status']/span[.='CLOSED']"));

		// assertNotNull(closedSet);
		// assertEquals(5, closedSet.size());
		assertEquals("The total number of closed studies are not equal to 5", 5, closedSet.size());
	}

	/*
	 * Test 3 - If a status of a study is open, you can click on a "Participate"
	 * button.
	 *
	 */
	@Test
	public void openStudyParticipate() throws Exception {
		driver.get("http://www.checkbox.io/studies.html");

		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='status']/span[.='OPEN']")));
		List<WebElement> openStudies = driver.findElements(By.xpath("//a[@class='status']/span[.='OPEN']"));
		List<WebElement> participates = driver.findElements(
				By.xpath("//a[@class='status']/span[.='OPEN']/ancestor::div[@class='row']//button[.='Participate']"));
		// assertNotNull(closedSet);
		// assertEquals(5, closedSet.size());
		assertEquals("Participate buttons are not equal to open studies", openStudies.size(), participates.size());
	}

	/*
	 * Test 4 - Check if the "Software Changes Survey" has a Amazon reward image.
	 *
	 */
	@Test
	public void checkAmazonRImage() throws Exception {
		driver.get("http://www.checkbox.io/studies.html");

		// http://geekswithblogs.net/Aligned/archive/2014/10/16/selenium-and-timing-issues.aspx
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Software Changes Survey']")));
		WebElement rewardImage = driver.findElement(By.xpath(
				"//span[.='Software Changes Survey']/ancestor::div[@class='row']//img[@src='/media/amazongc-micro.jpg']"));
		assertNotNull("Amazon image not found for 'Software Changes Survey'", rewardImage);
		// assertEquals(5, closedSet.size());
		// assertEquals("Participate buttons are not equal to open studies",
		// openStudies.size(), participates.size());
	}

}
