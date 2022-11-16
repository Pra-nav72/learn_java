//          LEARN MORE ABOUT PASSING OBJECT........

class Car{

    String name;
    Car(String name){
        this.name = name;
    }
}

class Garage{

    void park(Car car){
        System.out.println("The "+car.name+" is parked in the garage.");
    }
}
public class Passing_object {
    public static void main(String[] args) {
        Garage garage = new Garage();

        Car car1 = new Car("BMW");
        Car car2 = new Car("MUSTANG");

        garage.park(car1);
        garage.park(car2);
    }
}
