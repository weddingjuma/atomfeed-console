package org.ict4h.domain.configuration;

public class AppConfig {

    private String appName;
    private String dbUrl;
    private String dbUser;
    private String dbPassword;

    public AppConfig() {
    }

    public AppConfig(String appName, String dbUrl, String dbUser, String dbPassword) {
        this.appName = appName;
        this.dbUrl = dbUrl;
        this.dbUser = dbUser;
        this.dbPassword = dbPassword;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public String getDbUser() {
        return dbUser;
    }

    public void setDbUser(String dbUser) {
        this.dbUser = dbUser;
    }

    public boolean isFor(String app_name) {
        return app_name.equalsIgnoreCase(this.appName);
    }
}
