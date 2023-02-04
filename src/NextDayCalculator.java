
public class NextDayCalculator {
    public static int[] getNextDay(int day, int month, int year) {
        if (month == 2) {
            if (isLeapYear(year)) {
                if (day < 29) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            } else {
                if (day < 28) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day < 30) {
                day++;
            } else {
                day = 1;
                month++;
            }
        } else {
            if (month < 12) {
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month++;
                }
            } else {
                if (day < 31) {
                    day++;
                } else {
                    day = 1;
                    month =1;
                    year++;
                }
            }
        }
        return new int[]{day, month, year};
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
