import java.util.ArrayList;

/*
 * ArrayList = a resizable array.
 *              Elements can be added and removed after compilation phase
 *              store reference data types 
 */

public class Array_List {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();
        // b/w <> we use wrapper class not primitive data types

        food.add("pizza");;
        food.add("hamburger");
        food.add("hotdog");
        food.add("momos");

        food.set(0, "sushi");//change [0]th content to sushi.
        food.remove(2);//remove [2]nd member
        food.clear();//array list empty

        for(int i=0; i<food.size(); i++){//with ArrayList we use size() instead of length().
            System.out.println(food.get(i));
        }
    }
}
