import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class EnglishQuestionObject2 {
  private String question;
  private String answer;
  private String description;
  private int difficulty;
  private String category;
  private int arr[];
  private int i;
  private int a;

  //Create random number from 1 to 1000
  public static void main(String[] args)
  {
    Integer[] arr = new Integer[1000];
    for (int i = 0; i < arr.length; i++)
    {
      arr[i] = i;
    }
    Collections.shuffle(Arrays.asList(arr));
  }

  //Construct
  public EnglishQuestionObject2(String _question, String _answer, String _description, String _category)
  {
    question = _question;
    answer = _answer;
    description = _description;
    difficulty = arr[i];
    category = _category;
  }

  //Object
  EnglishQuestionObject2 object = new EnglishQuestionObject2
    (
      "What's in the box ?",
      "a. Nothing",
      "Warm-up question",
      "Multichoices questions"
     );

  //Print to file
  public void meh() {
  try
  {
    PrintWriter fileout = new PrintWriter(new FileWriter("/home/kagura/code/hvalab/etest/question.txt"));

        for (int a = 0; a < 1000; a++)
        {
          fileout.printf("question: %s", question);
          fileout.printf("answer: %s", answer);
          fileout.printf("description: %s", description);
          fileout.printf("difficulty: %d", difficulty);
          fileout.printf("category: %s", category);
        }
      fileout.close();
      System.out.println("Print success");
  }
      catch (IOException e)
      {
      System.out.println(e);
      }
  }
}
