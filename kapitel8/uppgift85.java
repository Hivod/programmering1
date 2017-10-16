/* Printar längden (antal siffror) på ett tal
Olof Rydh
2017-10-16
*/

import javax.swing.*;

public class uppgift85 {

  public static int numLength(int n) {
    int res = 0;
    while(n > 0) {
      res++;
      n = n/10;
    }
    return res;
  }

  public static void main(String[] args) {

    System.out.println(numLength(Integer.parseInt(JOptionPane.showInputDialog("num="))));

  }
}
