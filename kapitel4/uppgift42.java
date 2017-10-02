import javax.swing.*;

public class uppgift42 {

  public static void main(String[] args) {

    double ticket = Double.parseDouble(JOptionPane.showInputDialog("Price for ticket: "));
    double seasonTicket = Double.parseDouble(JOptionPane.showInputDialog("Price for season ticket: "));
    int visits = Integer.parseInt(JOptionPane.showInputDialog("How many visits? "));

    if((ticket*visits) > seasonTicket) {
      System.out.println("#worth");
    } else {
      System.out.println("not worth");
    }
  }
}
