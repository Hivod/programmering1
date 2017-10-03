import javax.swing.*;

public class uppgift33 {

  public static void main(String[] args) {

    double area, circum;
    String radiusString = JOptionPane.showInputDialog("Radie: ");
    double radius = Double.parseDouble(radiusString);

    area = radius * radius * 3.14;
    circum = radius * 3.14 * 2;

    JOptionPane.showMessageDialog(null, "Area: " + area + "\nOmkrets: " + circum);

  }
}
