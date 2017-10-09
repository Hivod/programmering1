/*
1/1 + 1/2 + 1/3 + ... 1/n
Olof Rydh
2017-10-09
*/

import javax.swing.*;

public class uppgift52 {

  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("n = "));
    double sum = 0;
    double k = 1;

    while(k <= n) {
      sum = sum + (1 / k);
      k++;
    }

    JOptionPane.showMessageDialog(null, "sum = " + sum);

  }
}
