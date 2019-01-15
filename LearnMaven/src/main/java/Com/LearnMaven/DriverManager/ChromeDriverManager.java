package Com.LearnMaven.DriverManager;

import java.io.File;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverManager extends DriverManager {

	protected ChromeDriverService chService;
	String path = System.getProperty("user.dir");
	String otherFolder = path + "//Browserexe//chromedriver.exe";

    @Override
    public void startService() {
        if (null == chService) {
            try {
            	String path = System.getProperty("user.dir");
            	String otherFolder = path + "//Browserexe//chromedriver.exe";
                chService = new ChromeDriverService.Builder()
                	.usingDriverExecutable(new File(otherFolder))
                    .usingAnyFreePort()
                    .build();
                chService.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void stopService() {
        if (null != chService && chService.isRunning())
            chService.stop();
    }

    @Override
    public void createDriver() {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        //run test case with head less browser 
        //options.setHeadless(true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(chService, capabilities);
    }

}
