package dailyCoding.day_2;

class Vehicle{
    public void name(){
        System.out.println("I am a vehicle");
    }

    //method Overloading
    public void name(String colour){
        System.out.println("I am a " + colour + " vehicle");
    }

}

class Car extends Vehicle{
    // here we are overriding the vehicle class's name method
    public void name() {
        System.out.println("I am a car");
    }
    public void name(String colour){
        System.out.println("I am a " + colour + " Car");
    }
}

class Bus extends Vehicle{
    // here we are overriding the vehicle class's name method
    public void name() {
        System.out.println("I am a bus");
    }
    public void name(String colour){
        System.out.println("I am a " + colour + " Bus");
    }
}

public class vehicleProblem {
    public static void main(String[] args) {
        Vehicle vObj = new Vehicle();
        Car carObj = new Car();
        Bus busObj = new Bus();

        vObj.name();
        carObj.name();
        busObj.name();

        System.out.println("methods overloaded with a colour parameter -->");
        vObj.name("red");
        carObj.name("Blue");
        busObj.name("Green");
    }



}
