
abstract class animal{
    animal(){//default constructor
        System.out.println("all animals....!");
    }
    public abstract void sound();
    //abstract method declared
}
class dog extends animal{
    // dog(){
        //  //to access animal's constructor we use super() in constructor of sub-class.
        //     super();
        // }
        
        @Override//it works as comment but if the method isn't overriding then it shows an error..
        public void sound(){ //use of abstract method
            System.out.println("dog is barking.");
        }
    }
    class lion extends animal{
        @Override
        public void sound(){
            System.out.println("lion is roaring.");
        }
    }
    
    
    public class Abstraction {
        public static void main(String[] args) {
            dog r = new dog();//we can also use dog instead of animal
            lion r2 = new lion();
            r.sound();
            r2.sound();
            //abstract class can be accessed through its reference.
        }
    }
    //In ABSTRACTION, we hide the implementation details from the user
    //only highlighted set of services provided to the user.
    //advantages:- 1.security   2.Enhancement
    
    //ways of abs. --> 1.Abstract class     2.Interface
    
    
            //      ABSTRACT CLASS
    
    //we use abstract keyword to make abstract class
    //we can't create object in this class
    //we can create reference object though.
    
    //to use abstract class we have to inheit it from a sub-class
    //i.e. abstract class need to be a super class(in order to use it).
    //we may or may not create abstract method in abstract class
    //abstract method must be in abstract class
    