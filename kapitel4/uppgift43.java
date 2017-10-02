import javax.swing.*;

public class uppgift43 {

  public static void main(String[] args) {

    int score = Integer.parseInt(JOptionPane.showInputDialog("Score: "));
    char grade;

    if(score < 25) {
      grade = 'F';
    } else if(score < 30) {
      grade = 'E';
    } else if(score < 35) {
      grade = 'D';
    } else if(score < 40) {
      grade = 'C';
    } else if(score < 45) {
      grade = 'B';
    } else {
      grade = 'A';
    }

    /*
      score = (score - 20) / 5;

      switch(score) {
      case 1:
        grade = 'E';
        break;
      case 2:
        grade = 'D';
        break;
      case 3:
        grade = 'C';
        break;
      case 4:
        grade = 'B';
        break;
      case 5: case 6:
        grade = 'A';
        break;
      default:
        grade = 'F';
        break;
    }*/

    System.out.println("Grade: " + grade);

  }
}
