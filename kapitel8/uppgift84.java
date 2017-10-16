/*
Olof Rydh
2017-10-16
*/

import javax.swing.*;

public class uppgift84 {
  // 1*2*3* ... *n
  public static double nfac(int n) {
    double res = 1;
    if(n == 0) {
      return 1;
    }
    for(int i = 1; i <= n; i++) {
      res = res * i;
    }
    return res;
  }

  public static void main(String[] args) {

    System.out.println(nfac(Integer.parseInt(JOptionPane.showInputDialog("n="))));
  }
}
