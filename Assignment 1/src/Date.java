public class Date {

    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {

        return day;
    }

    public int getMonth() {

        return month;
    }

    public int getYear() {

        return year;
    }

    public void displayDate() {

        System.out.println(day + "/" + month + "/" + year);
    }

    public boolean isLeapYear() {

        return (year % 400 == 0) ||
               (year % 4 == 0 && year % 100 != 0);
    }

    public int daysInMonth() {

        if (month == 2) {

            return isLeapYear() ? 29 : 28;
        }

        if (month == 4 || month == 6 ||
            month == 9 || month == 11) {

            return 30;
        }

        return 31;
    }

    public boolean isValid() {

        if (month < 1 || month > 12) {

            return false;
        }

        if (day < 1 || day > daysInMonth()) {

            return false;
        }

        return true;
    }

    public void addDays(int days) {

        while (days > 0) {

            day++;
            days--;

            if (day > daysInMonth()) {

                day = 1;
                month++;

                if (month > 12) {

                    month = 1;
                    year++;
                }
            }
        }
    }

    public void addMonths(int months) {

        month = month + months;

        while (month > 12) {

            month = month - 12;
            year++;
        }

        if (day > daysInMonth()) {

            day = daysInMonth();
        }
    }

    public void addYears(int years) {

        year = year + years;

        if (day > daysInMonth()) {

            day = daysInMonth();
        }
    }
}