package dailyCoding.day_2;

class Holiday2{
    private String name;
    private String month;
    private int day;
    Holiday2(String name,String month,int day){
        this.name = name;
        this.month = month;
        this.day = day;
    }

    public int getDay(){
        return day;
    }

}

public class HolidayConstructor2 {

    public static void main(String[] args) {
        Holiday2 obj1 = new Holiday2("day","december",10);
        Holiday2 obj2 = new Holiday2("day","december",10);
        //Creating array of objects using datatype as Classname
        Holiday2[] h_array = {obj1,obj2};
        System.out.println(avg(h_array));
    }
    public static double avg(Holiday2 h[]){
    int total = 0;
        for(int i = 0; i < h.length; i++){
            total = total + h[i].getDay();
        }
        return total/h.length;

    }
}
