/*
Olof Rydh
2017-10-16
*/

import javax.swing.*;

public class uppgift81 {

  public static void main(String[] args) {

    int radius = Integer.parseInt(JOptionPane.showInputDialog("Radius: "));
    System.out.println("Circumference: " + circle.circumference(radius) + "\nArea: " + circle.area(radius));

  }
}

class circle {

  public static double circumference(int r) {
    return Math.PI * (r*2.0);
  }

  public static double area(int r) {
    return Math.PI * r * r;
  }
}
