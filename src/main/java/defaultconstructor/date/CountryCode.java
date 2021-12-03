package defaultconstructor.date;


import java.time.format.DateTimeFormatter;

public enum CountryCode {
    HU("YYYY-MM-dd"),
    EN("dd-MM-YYYY"),
    US("MM-DD-YYYY");

 private String pattern;

    CountryCode(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }
}
