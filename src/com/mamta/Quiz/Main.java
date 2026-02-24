package com.mamta.Quiz;

public class Main {
    public static void main(String[] args) {

        QuestionService service = new QuestionService();

        service.display();
        service.printScore();

    }
}
