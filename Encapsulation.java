//ENCAPSULATION means wrapping data members & member methods of the class in a single unit
//RULES OF ENCAP.-->>
//1. variables should be private
//2. methods should be public.
class A{
    private int value;//data hiding
    public void setvalue(int x){//Data Abstraction
        value = x;
    }

    //Encapsulation = data hiding + data abstraction

    public int getvalue(){
        return value;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        A r = new A();
        //r.value = 45;---->>ERROR!(value is private)
        //we can only access private data member through public method of same class(encapsulation)
       
        r.setvalue(283);//giving value to variable 'value'
        int val = r.getvalue();//accessing variable's value.
        System.out.println(val);
    }
}
