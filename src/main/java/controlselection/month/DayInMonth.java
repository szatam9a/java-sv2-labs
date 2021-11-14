package controlselection.month;

import java.time.LocalDate;
import java.util.Locale;

public class DayInMonth {

    public int numberOfDays(int year, String month) {
        int monthInInt;
        switch (month.toLowerCase(Locale.ROOT)) {
            case "január":
                monthInInt = 1;
                break;
            case "február":
                monthInInt = 2;
                break;
            case "március":
                monthInInt = 3;
                break;
            case "április":
                monthInInt = 4;
                break;
            case "május":
                monthInInt = 5;
                break;
            case "június":
                monthInInt = 6;
                break;
            case "július":
                monthInInt = 7;
                break;
            case "augusztus":
                monthInInt = 8;
                break;
            case "szeptember":
                monthInInt = 9;
                break;
            case "október":
                monthInInt = 10;
                break;
            case "november":
                monthInInt = 11;
                break;
            case "december":
                monthInInt = 12;
                break;
            default:
                return 0;

        }


        LocalDate date = LocalDate.of(year, monthInInt, 1);
        return date.lengthOfMonth();
    }
}



