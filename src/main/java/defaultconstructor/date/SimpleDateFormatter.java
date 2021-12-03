package defaultconstructor.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class SimpleDateFormatter {
    public SimpleDateFormatter(){}


    public String formatDateString(SimpleDate simpleDate){
        DateTimeFormatter date = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        return simpleDate.makeItLocalDate().format(date);
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        DateTimeFormatter date = DateTimeFormatter.ofPattern(countryCode.getPattern());
        return simpleDate.makeItLocalDate().format(date);
    }
}
