/* Stringvariabler
   Olof Rydh
   2017-09-18
*/

import javax.swing.*;

public class uppgift21 {

  public static void main(String[] args) {

    String name,address,phone,info;
    name = "Olof Rydh";
    address = "Kopparv. 37";
    phone = "0722002088";
    info = "Name: " + name + "\nAddress: " + address + "\nPhone number: " + phone;

    JOptionPane.showMessageDialog(null, info);

  }

}
