package LearningSelenium;

public class FluentWait 
{

	
	
	Wait<WebDriver> wait = new FluentWait<>(driver)
			  .withTimeout(Duration.ofSeconds(TIMEOUT))
			  .pollingEvery(Duration.ofMillis(POLL_FREQUENCY));
}
