public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name=name;
        this.day=day;
        this.month=month;
    }

    public Boolean checkSameMonth(Holiday holiday){
        return this.month.equals(holiday.month);
    }

    public static double avgDate(Holiday[] holiday) {
        int sum = 0;
        for (int i = 0; i < holiday.length; i++) {
            sum = sum + holiday[i].day;
        }
        return ((double) sum) / holiday.length;
    }

    public static void main(String args[])
    {
        Holiday holiday = new Holiday("Independence Day", 4, "July");
        Holiday holiday1 = new Holiday("Independence Day", 4, "AUG");
        System.out.println("Are the months equal? " +holiday.checkSameMonth(holiday1));

    }
}

