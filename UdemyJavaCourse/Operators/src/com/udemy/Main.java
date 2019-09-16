package com.udemy;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result = result - 1; //3 - 1 = 2
        System.out.println(result);

        result = result * 10;
        System.out.println(result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println(result);

        //result = result + 1;
        result++; // 1 + 1;
        System.out.println(result);

        result--; //2 - 1 = 1;
        System.out.println(result);

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("it is not an alien");
            System.out.println("and i am afraid of aliens");
        } else {
            System.out.println("im not afraid!!");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90 )) {
            System.out.println("either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("this is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        double smallVal = 20.00d;
        double largeVal = 80.00d;
        double newVal = (smallVal + largeVal) * 100.00d;
        System.out.println(newVal);
        double modVal = newVal % 40.00;
        System.out.println("remainder: " + modVal);
        double divVal = modVal;
        if (divVal == 0) {
            System.out.println("true");
        } else {
            System.out.println("got some remainder");
        }
    }
}
