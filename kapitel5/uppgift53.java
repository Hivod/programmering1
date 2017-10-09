/*
Beräknar hur många gånger en boll studsar när den släpps från höjden "height"
Olof Rydh
2017-10-09
*/

import javax.swing.*;

public class uppgift53 {

  public static void main(String[] args) {

    double height = Double.parseDouble(JOptionPane.showInputDialog("Height (m) = "));
    int bounces = 0;

    while(height > 0.01) {
      height *= 0.7;
      bounces++;
    }

    System.out.println("Bounces: " + bounces);

  }

}
