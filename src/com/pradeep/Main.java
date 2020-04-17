package com.pradeep;

public class Main {

    public static void main(String[] args) {


       calculateScore(true, 800, 5,100);
       calculateScore(true, 10000, 8, 200);


      }

    public static int calculateScore ( boolean gameOver, int score, int levelcompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelcompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final Score Was " + finalScore);
            return finalScore;
        }
            return -1;
    }
}
