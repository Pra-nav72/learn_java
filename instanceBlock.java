import javax.sound.midi.SoundbankResource;

class A {
    int a; String b;
    A(){
        a= 34;
        b= "ankit";
        System.out.println("constructor: "+a+ " "+b);
    }

    { //INSTANCE BLOCK is displayed before constructor...
        a = 43;
        b = "Raj";
        System.out.println("instance variable: "+a+ " "+b);
    }
    static void show(){//static method
        System.out.println("this is static method.");
    }
}

//static method is called with class But not with OBJECT.
//static method can be called even before instance method(bcoz object not requiered).

public class instanceBlock {
    public static void main(String[] args) {
        A.show();
        A r = new A();
    }
}
