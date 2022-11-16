 //              COPY CONSTRUCTOR


class A{

    int a; String b;
    A(int y, String x){
        a = y;
        b = x;
        System.out.println("parameterized: "+ a+ " "+ b);
    }

    //COPY CONSTRUCTOR
    A(A ref){//this constructor refer to the default constructor
        //i.e. all the object of default con. can be accessed in this cons.

        a=ref.a;//value of 'a' copied in 'a' again
        b=ref.b;
        System.out.println("copied constructor: "+a + " " +b);
    }
}

public class copycons {
    public static void main(String[] args) {
        A r = new A(20, "ankit");
        A r2 = new A(r);
    }
}
