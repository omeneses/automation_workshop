package automation_workshop.config;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import static automation_workshop.config.DriverType.CHROME;
import static automation_workshop.config.DriverType.FIREFOX;
import static automation_workshop.config.DriverType.valueOf;


public class DriverFactory {
    private RemoteWebDriver webDriver;
    private DriverType selectedDriverType;
    private final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private final String systemArchitecture = System.getProperty("os.arch");

    public DriverFactory(){
        DriverType driverType = FIREFOX;
        String browser = System.getProperty("browser",driverType.toString().toUpperCase());
        System.out.println("el browser encontrado en el xml fue:"+browser);
        System.out.println("el VALOR QUE NO PROCESA ES:"+valueOf(browser));

        try{
            driverType = valueOf(browser);
            System.out.println("el browser asignado fue:"+driverType);
        }
        catch(IllegalArgumentException ignored){
            System.err.println("Unknown driver specified, defaulting to ' " + driverType + "'...");
        }
        catch(NullPointerException ignored){
            System.err.println("No driver specified, defaulting to ' " + driverType + "'...");
        }
        selectedDriverType = driverType;

    }

    public RemoteWebDriver getDriver(){
        if (null == webDriver){
            instantiateWebDriver(selectedDriverType);
        }
        return  webDriver;
    }

    public void quitDriver(){
        if (null != webDriver){
            webDriver.quit();
            webDriver = null;
        }
    }

    private void instantiateWebDriver(DriverType driverType){
        System.out.println("Selected Browser: "+ selectedDriverType);
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        webDriver = driverType.getWebDriverObject(desiredCapabilities);
    }
}
