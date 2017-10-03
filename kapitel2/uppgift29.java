/* stringmetoder
   Olof Rydh
   2017-09-18
*/

import javax.swing.*;

public class uppgift29 {

  public static void main(String[] args) {

    String a = " Erik Andersson 860314-2714 ";
    a = a.trim();
    int i = a.indexOf('1');
    int j = a.indexOf('0');
    String b = a.substring(i, i + 2) + "/" + a.substring(j, j + 2);

    JOptionPane.showMessageDialog(null, b);

  }
}
