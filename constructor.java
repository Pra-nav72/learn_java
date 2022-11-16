class A{
    int a, b;

    //Parameterized constructor
    A(int x, int y){
        a=x;b=y;
        System.out.println("Addition = "+ (x+y));
    }

    void show(){
        System.out.println("subtraction = "+(a - b));
    }

    A(int a, String b){ 
        //no. of parameter is same but data-type is different.
        System.out.println("2nd constructor: "+a+ " "+b);
    }
}

public class constructor {
    public static void main(String args[]){
        A r = new A(29, 1);
        r.show();
        A r2 = new A(1, "Pranav");
    }
}
/*
 * parameter constructor can be of many types but
   the number of parameter should not be same,
   if number of parameter is same then data type should be different...
   
   eg. a(int c, int b)----a(int a, String d)...etc
   both constructor have different object 
 */