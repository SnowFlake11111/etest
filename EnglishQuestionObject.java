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
    EnglishQuestionObject object = new EnglishQuestionObject(
      "what is the box?",
      "a",
      "cau hoi what",
      1,
      "wh question"
    );

    EnglishQuestionObject object2 = new EnglishQuestionObject(
      "what is the book?",
      "b",
      "cau hoi what",
      1,
      "wh question"
    );

    object.PrintOnScreen();
    object2.PrintOnScreen();
  }
}
