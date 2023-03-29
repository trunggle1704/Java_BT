package KiemTra;


import java.util.Arrays;

public class MyDate {
    private int year,month,day;

    public static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12 || day < 1) {
            return false;
        }
        int maxDays = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            maxDays = 29;
        }
        return day <= maxDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date");
        }
        if (month < 3) {
            month += 12;
            year--;
        }
        int c = year / 100;
        year %= 100;
        int w = (day + 13 * (month + 1) / 5 + year + year / 4 + c / 4 + 5 * c) % 7;
        return w;
    }

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid date");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setYear(int year) {
        setDate(year, month, day);
    }

    public void setMonth(int month) {
        setDate(year, month, day);
    }

    public void setDay(int day) {
        setDate(year, month, day);
    }

    public String toString() {
        int weekDay = getDayOfWeek(year, month, day);
        return String.format("%1$s %2$d %3$s %4$d", DAYS[weekDay], day, MONTHS[month-1], year);
    }
    public MyDate nextDay() {
        int year = this.year;
        int month = this.month;
        int day = this.day + 1;
        if (day > DAYS_IN_MONTHS[month - 1]) {
            day = 1;
            month++;
            if (month > 12) {
                month = 1;
                year++;
            }
        }
        return new MyDate(year, month, day);
    }

    public MyDate nextMonth() {
        int year = this.year + 1;
    int month = this.month + 1;
    int day = this.day;
    if (month > 12) {
        month = 1;
        year++;
    }
    int maxDays = DAYS_IN_MONTHS[month - 1];
    if (month == 2 && isLeapYear(year)) {
        maxDays = 29;
    }
    if (day > maxDays) {
        day = maxDays;
    }
    return new MyDate(year, month, day);
}

public MyDate nextYear() {
    int year = this.year + 1;
    int month = this.month;
    int day = this.day;
    int maxDays = DAYS_IN_MONTHS[month - 1];
    if (month == 2 && isLeapYear(year)) {
        maxDays = 29;
    }
    if (day > maxDays) {
        day = maxDays;
    }
    return new MyDate(year, month, day);
}

public MyDate previousDay() {
    int year = this.year;
    int month = this.month;
    int day = this.day - 1;
    if (day < 1) {
        month--;
        if (month < 1) {
            month = 12;
            year--;
        }
        day = DAYS_IN_MONTHS[month - 1];
        if (month == 2 && isLeapYear(year)) {
            day = 29;
        }
    }
    return new MyDate(year, month, day);
}

public MyDate previousMonth() {
    int year = this.year;
    int month = this.month - 1;
    int day = this.day;
    if (month < 1) {
        month = 12;
        year--;
    }
    int maxDays = DAYS_IN_MONTHS[month - 1];
    if (month == 2 && isLeapYear(year)) {
        maxDays = 29;
    }
    if (day > maxDays) {
        day = maxDays;
    }
    return new MyDate(year, month, day);
}

public MyDate previousYear() {
    int year = this.year - 1;
    int month = this.month;
    int day = this.day;
    int maxDays = DAYS_IN_MONTHS[month - 1];
    if (month == 2 && isLeapYear(year)) {
        maxDays = 29;
    }
    if (day > maxDays) {
        day = maxDays;
    }
    return new MyDate(year, month, day);
}
}