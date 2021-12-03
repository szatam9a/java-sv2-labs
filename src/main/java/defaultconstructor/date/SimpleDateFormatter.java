package defaultconstructor.date;

import java.time.format.DateTimeFormatter;


public class SimpleDateFormatter {
    private CountryCode defaultCountryCode ;
    public SimpleDateFormatter(){
        defaultCountryCode = CountryCode.HU;
    }


    public String formatDateString(SimpleDate simpleDate){
        DateTimeFormatter date = DateTimeFormatter.ofPattern(defaultCountryCode.getPattern());
        return simpleDate.makeItLocalDate().format(date);
    }
    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate){
        DateTimeFormatter date = DateTimeFormatter.ofPattern(countryCode.getPattern());
        return simpleDate.makeItLocalDate().format(date);
    }
}
