package com.cristina.homework;

public class TestConfigRunner {
    public static void main(String[] args) {

        // Folosind constructorul cu 3 parametri
        BrowserConfig config1 = new BrowserConfig(
                BrowserType.CHROME,
                "114.0",
                true
        );

        // Folosind constructorul cu 2 parametri
        BrowserConfig config2 = new BrowserConfig(
                BrowserType.FIREFOX,
                "latest"
        );

        // Folosind constructorul cu 1 parametru
        BrowserConfig config3 = new BrowserConfig(
                BrowserType.EDGE
        );

        // Folosind metoda statică Factory
        BrowserConfig config4 = BrowserConfig.createDefaultChromeConfig();

        //Afișăm configurațiile
        System.out.println("=== Config 1 ===");
        config1.afiseazaConfig();

        System.out.println("=== Config 2 ===");
        config2.afiseazaConfig();

        System.out.println("=== Config 3 ===");
        config3.afiseazaConfig();

        System.out.println("=== Config 4 (Factory) ===");
        config4.afiseazaConfig();
    }
}
