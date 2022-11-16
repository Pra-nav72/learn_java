abstract class program{
    public abstract void developer();
    public abstract void rank();
}

//if i don't use(override) any of the abstract method in sub class then,
//   i have to declare that sub-class as an abstract class too..
//and hence object of that sub-class can't be created

class HTML extends program{
    @Override
    public void developer(){
        System.out.println("Tim Berners Lee");
    }
    public void rank(){
        System.out.println("2nd");
    }
}

abstract class java extends program{
    
    public void developer(){
        System.out.println("james gousling");
    }
   //rank() abstract method is not defined here...
   //So we have to make it abstract class too
}

public class abstract_class {
    public static void main(String[] args) {
        program h = new HTML();
      //  program j = new java();
        h.developer(); h.rank();
      //  j.developer(); 
    }
}

//to overcome this we can do one thing

//1.remove rank() from HTML class to make it abstract
//2. add rank() to java class
//3. extend the java with HTML
//using java class object we can access all the members of another class

//this will give full control to java class and this creates multi-level inheritence.
