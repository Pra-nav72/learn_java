import javax.swing.JOptionPane;

import java.util.Random;//random number generates

                        

public class GUI {
    public static void main(String[] args) {


                //RANDOM NUMBERS
        Random num= new Random();
        int x= num.nextInt(6)+1;
        //if we don't pass any argument then the  num will be from -ve 2billion to +ve 2 billion
        //only 6 ---->means number from 0 to 5
        //so we add +1 end of the braces for 1 to 6;
        System.out.println("Random number is: "+x);



                        //DIALOG BOX MESSAGE

        String name= JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "hello "+name);

        //we have used Integer.parseInt becoz input is in String format
        int age= Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are "+age+ " years old");

        //we have used Integer.parseDouble becoz input is String format(parse it to double)
        double height= Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "you are "+height+" cm tall");

    }
}
