public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int Day, int Month, int Year) {
        if(Day>=1 && Day <=31 && Month>=1 && Month <=12 && Year>=1900 && Year<=9999 ){
            day = Day;
            month = Month;
            year = Year;
        }else {
            System.out.println("ERR");
            day = 1;
            month = 1;
            year = 1900;
        }

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

    public void setDay(int Day) {
        if(Day>=1 && Day <=31 ){
            day = Day;
        }else {
            System.out.println("ERR");
            day = 1;
        }
    }

    public void setYear(int Year) {
        if(Year>=1900 && Year <=9900 ){
            year = Year;
        }else {
            System.out.println("ERR");
            year = 1;
        }
    }

    public void setMonth(int Month) {
        if(Month>=1 && Month <=12 ){
            month = Month;
        }else {
            System.out.println("ERR");
            month = 1;
        }
    }

    @Override
    public String toString() {
        return
                "" + day +
                        "/" + month +
                        "/" + year
                ;
    }

    public static void main(String[] args) {
        Date D1 = new Date(32, 12, 2003);
        System.out.println(D1.getDay() + D1.getMonth() + D1.getYear());
    }
}