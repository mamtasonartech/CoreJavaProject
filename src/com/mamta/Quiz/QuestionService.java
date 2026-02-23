package com.mamta.Quiz;

public class QuestionService {

    Question[] question = new Question[5];

    public QuestionService(){
        question[0] = new Question(1,"size of int","2","6","4","8","4");
        question[1] = new Question(2,"size of double","2","6","4","8","8");
        question[2] = new Question(3,"size of char","2","6","4","8","2");
        question[3] = new Question(4,"size of long","2","6","4","8","8");
        question[4] = new Question(5,"size of boolean","1","2","4","8","1");
    }


    public void display(){
       for(Question que: question){
           System.out.println(que.getQuestion());
       }
    }

}
