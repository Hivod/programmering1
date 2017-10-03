/* Mer stringvariabler
   Olof Rydh
   2017-09-18
*/
import javax.swing.*;

public class uppgift23 {

  public static void main(String[] args) {

    String name1;
    String name2;
    String greeting;
    name1 = JOptionPane.showInputDialog("What is your first name?");
    name2 = JOptionPane.showInputDialog("What is your last name?");
    greeting = "Welcome " + name1 + " " + name2;
    JOptionPane.showMessageDialog(null, greeting);
  }
}
