import java.io.*;
import java.util.Scanner;

public class EnglishQuestionObject3 {

  public static void main(String[] args) throws Exception
  {
    //parsing CSV into Scanner class constructor
    Scanner sc = new Scanner(new File("/home/kagura/code/hvalab/etest/question.csv"));
    sc.useDelimiter(" , ");               //sets delimiter pattern
    while (sc.hasNext())                  //returns a boolean value
      {
        System.out.print(sc.next());      //finds and returns the next complete token from scanner
      }
    sc.close();                           //close scanner
  }
}
