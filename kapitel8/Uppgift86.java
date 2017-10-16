/*
Olof Rydh
2017-10-16
*/

import javax.swing.*;

public class Uppgift86 {

  public static String showInfo() {
    return System.getProperty("user.name") + ", " + System.getProperty("os.name");
  }

  public static void main(String[] args) {

    System.out.println(showInfo());

  }
}
