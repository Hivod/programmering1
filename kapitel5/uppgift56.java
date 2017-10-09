/*

Olof Rydh
2017-10-09
*/

import javax.swing.*;

public class uppgift56 {

  public static void main(String[] args) {

    String s = JOptionPane.showInputDialog("Skirv en text:");
    int i;
    for (i=0; i<s.length(); i=i+1)
      if (s.charAt(i) == ' ' || s.charAt(i) == '\t')
        break;
    if (i < s.length())
      JOptionPane.showMessageDialog(null,
                  "Första vita tecken finns på plats nr " + i);
    else
      JOptionPane.showMessageDialog(null, "Inga vita tecken");
  }
}
