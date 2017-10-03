import javax.swing.*;

public class uppgift35 {

  public static void main(String[] args) {

    int price = Integer.parseInt( JOptionPane.showInputDialog("Pris inkl. moms: "));
    int tax = Integer.parseInt( JOptionPane.showInputDialog("Moms i %: ")) + 100;
    int preTax = (price * 100) / tax;

    System.out.println(preTax);

  }
}
