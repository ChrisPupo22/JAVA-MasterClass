package com.udemy;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = false;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;


      calculateScore(true, 800, 5, 100);

        if(gameOver) {
            int secScore = 10000;
            levelCompleted = levelCompleted + 3;
            bonus = bonus * 2;
            System.out.println(secScore);
            System.out.println(levelCompleted);
            System.out.println(bonus);
            int finalScore = secScore + (levelCompleted * bonus);
            System.out.println("your final score was " + finalScore);

        } else {
            int finalScore = -1;
            System.out.println("this is new final score" + finalScore);
        }
    }

   public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

       if(gameOver) {
           int finalScore = score + (levelCompleted * bonus);
           System.out.println("Your final score was " + finalScore);
       }
   }




   public static void displayHighScorePosition(String playerName, int position) {
       System.out.println(playerName + "managed to get into position"
               + position + "on the high score table");
   }

   public static int calculateHighScorePosition(int newPlayerScore) {

       if (newPlayerScore > 1000) {
                return 1;
            } else if (newPlayerScore > 500 && newPlayerScore < 1000){
                return 2;
            } else if (newPlayerScore > 100 && newPlayerScore < 500){
                return 3;
            } else {
                return 4;
            }
        }

    }

