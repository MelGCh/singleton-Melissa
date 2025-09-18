public class AppConfig {
    private String theme;
    private String language;
    private static final AppConfig instance = new AppConfig();// se creo nueva instancia

    public AppConfig() {
        // Load default settings
        this.theme = "Light";
        this.language = "EN";
        System.out.println("New AppConfig instance created!");
    }

    public static AppConfig getInstance(){// se agrego nuevo método
        return instance;
    }
    public String getTheme() { return theme; }
    public void setTheme(String theme) { this.theme = theme; }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public void printConfig() {
        System.out.println("Theme: " + theme + ", Language: " + language);
    }
}