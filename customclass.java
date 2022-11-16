
class Employee{
    private int id;
    private String name;

    //Setter and getter for private attributes..
    public void setId(int i){id = i;} 
    public int getId(){return id;}

    public String getName(){return name;}
    public void setName(String n){name = n;}
}


class MyEmployee{
    private int id;
    private String name;

    public MyEmployee(){
        id = 23;
        name = "CodewithHarry";
    }

    public void setId(int i){this.id = i;} 
    public int getId(){return id;}

    public String getName(){return name;}
    public void setName(String n){this.name = n;}
}


public class customclass {
    public static void main(String[] args) {
      Employee rahul = new Employee();
      MyEmployee harry = new MyEmployee();
    //   rahul.id = 34; 

    //   rahul.setId(12);
    //   rahul.setName("editor");

    //   System.out.println(rahul.getId());
    //   System.out.println(rahul.getName());

      System.out.println(harry.getId());
      System.out.println(harry.getName());
    }
}
