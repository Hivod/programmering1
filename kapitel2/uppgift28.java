/* Substrings
   Olof Rydh
  2017-09-18
*/

import javax.swing.*;

public class uppgift28 {

  public static void main(String[] args) {

    String a = "Programspr\u00E5k";
    String b = a.substring(4,8) + a.charAt(5);

    JOptionPane.showMessageDialog(null, b);

  }
}
