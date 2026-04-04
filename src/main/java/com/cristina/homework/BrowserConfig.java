package com.cristina.homework;

public class BrowserConfig {

    private BrowserType browserType;
    private String version;
    private boolean isHeadless;

    // Constructor complet
    public BrowserConfig(BrowserType browserType, String version, boolean isHeadless) {
        this.browserType = browserType;
        this.version = version;
        this.isHeadless = isHeadless;
    }

    // Constructor cu versiune
    public BrowserConfig(BrowserType browserType, String version) {
        this(browserType, version, false);
    }

    // Constructor cu un singur parametru (cel mai folosit)
    public BrowserConfig(BrowserType browserType) {
        this(browserType, "latest");   // ← AICI era greșeala
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