import javax.swing.*;

public class uppgift45 {

  public static void main(String[] args) {

    double dayPrice = 2.5;
    double nightPrice = .55;
    double openPrice = .6;

    String[] buttons = {"Day", "Night/weekend"};
    int time = JOptionPane.showOptionDialog(null, "Time of call: ", "Confirmation",
        JOptionPane.DEFAULT_OPTION, 0, null, buttons, buttons[0]);
    int callTime = Integer.parseInt(JOptionPane.showInputDialog("Call time in min:"));

    if(time == 0) {
      JOptionPane.showMessageDialog(null, openPrice + (dayPrice * callTime) + " SEK");
    } else {
      JOptionPane.showMessageDialog(null, openPrice + (nightPrice * callTime) + " SEK");
    }

  }
}
