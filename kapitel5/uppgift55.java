/*
Beräknar hur många gånger en boll studsar när den släpps från höjden "height"
Olof Rydh
2017-10-09
*/

import javax.swing.*;

public class uppgift55 {

  public static void main(String[] args) {

    while(true) {

      /*String sHeight = JOptionPane.showInputDialog("Height (m) = ");
      if(sHeight == null) { break; }
      double height = Double.parseDouble(sHeight);*/
      int bounces = 0;

      for(double height = Double.parseDouble(JOptionPane.showInputDialog("Height (m) = ")); height > 0.01; height *= 0.7) {
        bounces++;
      }

      System.out.println("Bounces: " + bounces);

    }
  }
}
