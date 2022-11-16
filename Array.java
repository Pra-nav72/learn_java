 public class Array {
    public static void main (String x[]){
        // int [] arr = new int[5];
        // arr[0] = 5;
        // arr[1] = 2;
        // arr[2] = 12;
        // arr[3] = 23;
        // arr[4] = 21;
        // try {
        //     System.out.println(arr[5]);
            
        // } catch (Exception e) {
        //     System.out.println("Exception occur");
        // }
        
        // System.out.println("Exception handled....");

        

        // int [] marks = {34, 65, 67, 98, 56};
        // System.out.println(marks.length);  //length of the array
        
        // System.out.println("Array using for loop");
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }

        // //Displaying the array using for-each loop........

        // System.out.println("\n\ndisplaying the aray using for-each loop-------");
        // for (int element : marks) {
        //     System.out.println(element);
        // }



        //----------2D arrays-----------------------

        int [] [] flats;
        flats = new int[2][3];

        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        //displaying a 2D arrays -----------

        System.out.println("\n displaying 2D arrays using for loop....\n");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
