import javax.swing.*;

public class uppgift44 {

  public static void main(String[] args) {

    int[] measures = {
      Integer.parseInt(JOptionPane.showInputDialog("measure 1 in mm: ")),
      Integer.parseInt(JOptionPane.showInputDialog("measure 2 in mm: ")),
      Integer.parseInt(JOptionPane.showInputDialog("measure 3 in mm: "))
    };

    if( (measures[0] > 600 || measures[1] > 100 || (measures[0] + measures[1] + measures[2]) > 900) || (measures[0] < 140 || measures[2] < 90) ) {

      JOptionPane.showMessageDialog(null, "Felaktiga m\u00e5tt");

    } else {

      JOptionPane.showMessageDialog(null, "M\u00e5tten OK");

    }
  }
}
