/*
Olof Rydh
2017-10-16
*/

import javax.swing.*;
import java.util.*;
import java.awt.*;

public class Uppgift87 {

  public static void beep(int n) {
    for(int i = 0; i < n; i++) {
      Toolkit.getDefaultToolkit().beep();
      try {
        Thread.sleep(500);
      } catch (InterruptedException e) {}
    }
  }

  public static void warning(String s) {
    beep(3);
    JOptionPane.showMessageDialog(null, s);
  }

  public static void main(String[] args) {

    warning("test");

  }
}
