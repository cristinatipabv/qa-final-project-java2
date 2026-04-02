
public class BrowserConfig {
    private BrowserType browserType;
    private String version;
    private boolean isHeadless;



    public BrowserConfig(BrowserType browserType, String version, boolean isHeadless) {
        this.browserType = browserType;
        this.version = version;
        this.isHeadless = isHeadless;
    }



    public BrowserConfig(BrowserType browserType, String version) {
        this.browserType = browserType;
        this.version = version;
        this.isHeadless = false;
    }


    public BrowserConfig(BrowserType browserType) {
        this.browserType = browserType;
        this.version = "latest";
        this.isHeadless = false;
    }

    // Declar// Declarăm un tip nou, numit BrowserType
    public enum BrowserType {
        CHROME,
        FIREFOX,
        EDGE
    }

    public static BrowserConfig createDefaultChromeConfig() {
        return new BrowserConfig(BrowserType.CHROME, "latest", true);
    }

    public void afiseazaConfig() {
        System.out.println("Browser: " + browserType +
                ", Version: " + version +
                ", Headless: " + isHeadless);
    }


}
