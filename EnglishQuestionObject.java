import java.util.*;
import java.lang.*;
import java.io.*;

class Sortbydifficulty implements Comparator<EnglishQuestionObject>
{
  // Used for sorting in ascending order of
  // difficulty number
  public int compare(EnglishQuestionObject a, EnglishQuestionObject b) {
    if (a == null && b == null) {
      return 0;
    }

    if (a == null) {
      return 1;
    }

    if (b == null) {
      return -1;
    }

    return a.GetDifficulty() - b.GetDifficulty();
  }
}

public class EnglishQuestionObject {
  private int id;
  private String question;
  private String answer;
  private String description;
  private int difficulty;
  private String category;

  private static int ID = 0;

  // constructor
  public EnglishQuestionObject(String _question, String _answer, String _description, int _difficulty, String _category) {
    id = ID++;
    question = _question;
    answer = _answer;
    description = _description;
    difficulty = _difficulty;
    category = _category;
  }

  public int GetDifficulty() {
    return difficulty;
  }

  public void PrintOnScreen() {
    System.out.printf("id: %d\n", id);
    System.out.printf("question: %s\n", question);
    System.out.printf("answer: %s\n", answer);
    System.out.printf("description: %s\n", description);
    System.out.printf("difficulty: %d\n", difficulty);
    System.out.printf("category: %s\n", category);
    System.out.println("--------------");
  }

  public static void main(String[] args) {
    try {
      EnglishQuestionObject[] questions = EnglishQuestionObject.LoadDataFromCsv();
      Arrays.sort(questions, new Sortbydifficulty());
      for (EnglishQuestionObject q : questions) {
        if (q == null) {
          break;
        }
        q.PrintOnScreen();
      }
    } catch(IOException e) {
      e.printStackTrace();
    }
  }

  public static EnglishQuestionObject[] LoadDataFromCsv() throws IOException {
    File file = new File("question.csv");
    FileReader fr=new FileReader(file);
    BufferedReader br=new BufferedReader(fr);
    StringBuffer sb=new StringBuffer();
    String line;
    EnglishQuestionObject[] questions = new EnglishQuestionObject[1000];
    int i = 0;
    while((line=br.readLine())!=null) {
      String[] ss = line.split(",");
      int d = Integer.parseInt(ss[3]);
      questions[i] = new EnglishQuestionObject(ss[0], ss[1], ss[2], d, ss[4]);
      i++;
    }
    fr.close();
    return questions;
  }
}
