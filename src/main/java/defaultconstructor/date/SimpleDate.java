package defaultconstructor.date;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;

public class SimpleDate {
    private int year;
    private int month;
    private int day;


    public SimpleDate setDate(int year, int month, int day) {
        if (isCorrect(year, month, day)) {
            this.year = year;
            this.day = day;
            this.month = month;
        } else {
            throw new IllegalArgumentException("One Date is not correct y:" + year + "m:" + month + "d:" + day);
        }
        return this;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        DateTimeFormatter foramter;
        return day;
    }

    private boolean isCorrect(int year, int month, int day) {

        if (year < 1900) {
            return false;
        } else {
            try {
                LocalDate.of(year, month, day);
            } catch (DateTimeException dte) {
                return false;
            }
        }
        return true;
    }


    private boolean isLeapYear(int year) {
        LocalDate date = LocalDate.of(year, 1, 1);
        return date.isLeapYear();
    }

    private int calculateMonthLength(int year, int month) {
        return LocalDate.of(year, month, 1).lengthOfMonth();
    }

    public LocalDate makeItLocalDate() {
        return LocalDate.of(year, month, day);
    }
}
