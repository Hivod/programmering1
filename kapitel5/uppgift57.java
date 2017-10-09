/*

Olof Rydh
2017-10-09
*/

public class uppgift57 {

  public static void main(String[] args) {

    int i, y;
    String table = "";

    for(i = -10; i <= 10; i++) {

      y = (2 * i * i) - (5 * i) + 1;
      table = table + i + "     " + y + "\n";

    }

    System.out.println(table);

  }
}
