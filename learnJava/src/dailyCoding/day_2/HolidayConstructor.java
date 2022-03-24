package dailyCoding.day_2;

class Holiday{
    private String name;
    private String month;
    private int day;
    Holiday(String name,String month,int day){
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public String getMonth(){
        return month;
    }

}

public class HolidayConstructor {

    public static void main(String[] args) {
        Holiday obj1 = new Holiday("day","december",10);
        Holiday obj2 = new Holiday("day","december",10);
        System.out.println(inSameMonth(obj1,obj2));
    }
    public static boolean inSameMonth(Holiday h1, Holiday h2){
        return h1.getMonth().equals(h2.getMonth());
    }
}
