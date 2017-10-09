/*
1² + 2² + 3² + ... n²
Olof Rydh
2017-10-09
*/

import javax.swing.*;

public class uppgift51 {

  public static void main(String[] args) {

    int n = Integer.parseInt(JOptionPane.showInputDialog("n = "));
    int sum = 0;
    int k = 1;

    while(k <= n) {
      sum = sum + (k * k);
      k++;
    }

    JOptionPane.showMessageDialog(null, "sum =" + sum);
    
  }
}
