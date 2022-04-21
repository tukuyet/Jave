public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int Hour, int Minute, int Second) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            hour = Hour;
            minute = Minute;
            second = Second;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int Hour) {
        if (Hour >= 0 && Hour <= 23) {
            hour = Hour;
        } else {
            System.out.println("Loi");
        }
    }

    public void setMinute(int Minute) {
        if (Minute >= 0 && Minute <= 59) {
            minute = Minute;
        } else {
            System.out.println("Loi");
        }
    }

    public void setSecond(int Second) {
        if (Second >= 0 && Second <= 59) {
            second = Second;
        } else {
            System.out.println("Loi");
        }
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String toString() {
        return "Time: " + hour + ":" + minute + ":" + second;
    }

    public Time nextSecond() {
        if (hour == 23 && minute == 59 && second == 59) {
            hour = 0;
            minute = 0;
            second = 0;
        } else if (minute == 59 && second == 59) {
            hour++;
            minute = 0;
            second = 0;
        } else if (second == 59) {
            minute++;
            second = 0;
        } else {
            second++;
        }
        return this;

    }

    public Time previousSecond() {
        if (hour == 0 && minute == 0 && second == 0) {
            hour = 23;
            minute = 59;
            second = 59;
        } else if (minute == 0 && second == 0) {
            hour--;
            minute = 59;
            second = 59;
        } else if (second == 0) {
            minute--;
            second = 59;
        } else {
            second--;
        }
        return this;

    }

    public static void main(String[] args) {
//        Time t1 = new Time(15,45,50);
        Time t2 = new Time(15, 25, 35);
        System.out.println(t2.nextSecond());
    }
}
