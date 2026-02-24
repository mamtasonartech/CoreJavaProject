package com.mamta.Quiz;

import java.util.Scanner;

public class QuestionService {

    Question[] question = new Question[5];
    String[] userinput = new String[5];

    public QuestionService(){
        question[0] = new Question(1,"size of int","2","6","4","8","4");
        question[1] = new Question(2,"size of double","2","6","4","8","8");
        question[2] = new Question(3,"size of char","2","6","4","8","2");
        question[3] = new Question(4,"size of long","2","6","4","8","8");
        question[4] = new Question(5,"size of boolean","1","2","4","8","1");
    }


    public void display(){
        System.out.println("Welcome to Quiz Competition");
           for(int i=0; i<question.length;i++){
                System.out.print("Question :" + " " + question[i].getId() + " ");
                System.out.println(question[i].getQuestion());
                System.out.println(question[i].getOpt1());
                System.out.println(question[i].getOpt2());
                System.out.println(question[i].getOpt3());
                System.out.println(question[i].getOpt4());
                Scanner sc = new Scanner(System.in);
                userinput[i] = sc.nextLine();

           }

           for(String s : userinput){
               System.out.println(s);

           }
    }

    public void printScore(){

        int score =0;
        for(int i=0; i<question.length;i++){

            Question que = question[i];
            String actualAnswer = que.getAnswer();
            String userAnswer = userinput[i];

            if(userAnswer.equals(actualAnswer)){
                score++;
            }

        }
        System.out.println("Your Score is :" +score);

    }

}
