//LEARN MORE ABOUT toString() method ....

class car{

    String make = "ford";
    String model = "mustang";
    String color = "red";
    int year = 2021;
    //toString is already built-in class
    //@Override
    public String toString(){
        return make +"\n" +model+ "\n" +color+ "\n" +year;
    }
}

public class To_String {
    public static void main(String[] args) {
        
        car cars = new car();
        //System.out.println(cars.toString());
        System.out.println(cars);
    }
}
