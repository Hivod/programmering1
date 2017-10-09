/*

Olof Rydh
2017-10-09
*/

public class uppgift58 {

  public static void main(String[] args) {

    double i, y;
    String table = "";

    for(i = -1; i <= 1; i+=0.1) {

      y = (2 * i * i) - (5 * i) + 1;
      table = table + i + "     " + y + "\n";

    }

    System.out.println(table);

  }
}
