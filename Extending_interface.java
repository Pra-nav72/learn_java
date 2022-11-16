//we use extends with interface, this is extending interface

interface Gill{
    void add();
}

interface Ankit extends Gill{//inheriting Gill interface
    //have both abstract class
    void sub();
}

class dev implements Ankit{
    @Override
    public void add(){
        int a = 34, b = 6, c;
        c = a+b;
        System.out.println("Addition: "+c);
    }

    @Override
    public void sub(){
        int a = 40, b=15, c;
        c = a - b;
        System.out.println("sub: "+c);
    }
}


public class Extending_interface {
    public static void main(String[] args) {
       // dev r = new dev();
       //we can also use Ankit interface's reference
       Ankit r = new dev();
        r.add();
        r.sub();
    }
}
