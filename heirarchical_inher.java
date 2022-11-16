//HEIRARCHICAL INHERITANCE have single super class and many sub class
// but every sub class have same extended super class..

class A{ //super class
    void input(){
        System.out.println("Enter your name.");
    }
}

class B extends A{ //sub class with A extended
    void show(){
        System.out.println("my name is Pranav.\n\n");
    }
}

class C extends A{ //sub class 02 with A extended
    void disp(){
        System.out.println("my name is Kumar.");
    }
}



public class heirarchical_inher {
    public static void main(String[] args) {
    B r = new B();//object of class B
    C r2 = new C();//object of class C
    
    r.input(); r.show(); //method of class B
    
    r2.input(); r2.disp();  //method of class C
    }
}
