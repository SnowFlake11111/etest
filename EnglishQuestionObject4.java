import java.io.*;
import java.util.*;

class QuestionData
     {
     String question;
     String answer;
     String description;
     String difficulty;
     String category;

         public QuestionData() {
         }

         public String getQuestion() {
           return question;
         }

         public void setQuestion(String question) {
           this.question = question;
         }

         public String getAnswer() {
           return answer;
         }

         public void setAnswer(String answer) {
           this.answer = answer;
         }

         public String getDescription() {
           return description;
         }

         public void setDescription(String description) {
           this.description = description;
         }

         public String getDifficulty() {
           return difficulty;
         }

         public void setDifficulty(String difficulty) {
           this.difficulty = difficulty;
         }

         public String getCategory(String category) {
           return category;
         }

         public void setCategory(String category) {
           this.category = category;
         }
     }

public class EnglishQuestionObject4
{

  public static void main(String[] args)
  {
    BufferedReader br = new BufferedReader(new FileReader(new File("/home/kagura/code/hvalab/etest/question.csv")));
        List<QuestionData> questionDataList = new ArrayList<QuestionData>();
        String line = br.readLine();
        //check file for error
        if (line == null) throw new IllegalArgumentException("File is empty");
        if (!line.equals("question,answer,description,difficulty,category")) throw new IllegalArgumentException("File has wrong collumns: " +line);
        while ((line = br.readLine()) != null) {
          //split on comma
          String[] questionDataCsv = line.split(",");

          //create object to store values
          QuestionData questionDataObj = new QuestionData();

          //add values from csv to the object
          questionDataObj.setQuestion(questionDataCsv[0]);
          questionDataObj.setAnswer(questionDataCsv[1]);
          questionDataObj.setDescription(questionDataCsv[2]);
          questionDataObj.setDifficulty(questionDataCsv[3]);
          questionDataObj.setCategory(questionDataCsv[4]);

          //add objects to list
          questionDataList.add(questionDataObj);
        }
  }
}

