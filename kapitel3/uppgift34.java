import javax.swing.*;

public class uppgift34 {

  public static void main(String[] args) {

    double time, price, total;
    time = Double.parseDouble(JOptionPane.showInputDialog("Minuter per m\u00E5nad: "));
    price = Double.parseDouble(JOptionPane.showInputDialog("Pris per minut: "));

    total = time * price;

    JOptionPane.showMessageDialog(null, "Total kostnad per m\u00E5nad: " + total + "0 kr");
  }
}
