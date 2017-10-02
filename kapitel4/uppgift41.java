/* if
Olof Rydh
2017-10-02
*/

import javax.swing.*;

public class uppgift41 {

  public static void main(String[] args) {

    double time, price, total;
    time = Double.parseDouble(JOptionPane.showInputDialog("Minuter per m\u00E5nad: "));
    price = Double.parseDouble(JOptionPane.showInputDialog("Pris per minut: "));

    total = time * price;

    if(total>=1000) {

      total = total * 0.9;

    }

    JOptionPane.showMessageDialog(null, "Total kostnad per m\u00E5nad: " + total + "0 kr");
  }
}
