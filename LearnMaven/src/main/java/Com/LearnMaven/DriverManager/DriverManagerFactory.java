package Com.LearnMaven.DriverManager;

public class DriverManagerFactory {
	
	public static DriverManager getManager(DriverType type) {

        DriverManager driverManager = null;

        switch (type) {
            case CHROME:
                driverManager = new ChromeDriverManager();
                break;
            case FIREFOX:
                driverManager = new FireFoxDriverManager();
                break;
            case CHROMEHEADLESS:
            	driverManager=new ChromeDriverManagerHeadless();
            default:
              //  driverManager = new SafariDriverManager();
                break;
        }
        return driverManager;

    }

}
