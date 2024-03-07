package com.example.spacein;

public class Question {
     private  String  question , description;
      private  boolean expandable;

     public boolean isExpandable() {
          return expandable;
     }

     public void setExpandable(boolean expandable) {
          this.expandable = expandable;
     }

     public String getQuestion() {
          return question;
     }

     public void setQuestion(String question) {
          this.question = question;
     }

     public String getDescription() {
          return description;
     }

     public void setDescription(String description) {
          this.description = description;
     }

     public Question(String question, String description) {
          this.question = question;
          this.description = description;
          this.expandable = false;  /// we create getters and setter for expandable
     }
//// alse we made  a to string  method here
     @Override
     public String toString() {
          return "Question{" +
                  "question='" + question + '\'' +
                  ", description='" + description + '\'' +
                  '}';
     }

     // so we create a adapter class

}
