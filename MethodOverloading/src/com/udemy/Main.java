package com.udemy;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is: " + newScore);
        calculateScore(75);
        calculateScore();
        calcFeetAndInchesToCentimeters(6, -10);


    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player: " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed Player: " + " scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("no player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if((feet < 0 ) || (inches < 0) || (inches > 12)) {
            System.out.println("Invalid feet or inches parameter");
            return -1;
        }

        double centimeters = (feet * 12) *2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + "feet, " + inches + "inches = " + centimeters + " cm");
        return centimeters;
    }
}
