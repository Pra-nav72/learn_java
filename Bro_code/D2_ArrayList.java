import java.util.ArrayList;

public class D2_ArrayList {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<String>> grocery = new ArrayList();

        ArrayList<String> backery = new ArrayList();
        backery.add("pasta");
        backery.add("garlic bread");
        backery.add("donuts");

        ArrayList<String> produce = new ArrayList();
        produce.add("tomatoes");
        produce.add("zucchini");
        produce.add("peppers");

        ArrayList<String> drink = new ArrayList();
        drink.add("soda");
        drink.add("coffee");
        drink.add("tea");

        //adding all arraylist to grocery() arraylist
        grocery.add(backery);
        grocery.add(produce);
        grocery.add(drink);

        System.out.println(grocery);

        //to get any specific list
        System.out.println(grocery.get(1));

        //to get specific element from any list
        System.out.println(grocery.get(1).get(0));
        //show---> 1st element of 1 list
        //1st get() == ArrayList
        //2nd get() == elements in that list

        System.out.println(grocery.get(2).get(2));
        
    }
}
