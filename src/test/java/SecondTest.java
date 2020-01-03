import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SecondTest {

  @Test
  public void safariTest() {
    WebDriver driver = new SafariDriver();
    driver.get("https://www.ukr.net");
  }
}
