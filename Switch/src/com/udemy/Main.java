package com.udemy;

public class Main {

    public static void main(String[] args) {
	    int value = 3;
	    if(value == 1) {
            System.out.println("Value was 1");
        } else if(value == 2) {
            System.out.println("value was 2");
        } else {
            System.out.println("was not 1 or 2");
        }

	    int switchValue = 6;
	    switch(switchValue) {
            case 1:
                System.out.println("value was 1");
                break;

            case 2:
                System.out.println("value was 2");
                break;

            case 3:case 4: case 5:
                System.out.println("was a 3 or 4 or 5");
                System.out.println("actually it was a " + switchValue);
                break;

            default:
                System.out.println("was not 1 or 2, 4 or 5");
                break;
        }
        //more code here...

        char initialChar = 'F';
	    switch (initialChar) {

            case 'A':
                System.out.println("was the letter A");
                break;

            case 'B':
                System.out.println("was the letter B");
                break;

            case 'C':
                System.out.println("was the letter C");
                break;

            case 'D':
                System.out.println("was the letter D");
                break;

            case 'E':
                System.out.println("was the letter E");
                break;

            default:
                System.out.println("unqualified letter found: " + initialChar);
                break;
        }

        String month = "AUGUST";
	    switch(month.toLowerCase()) {
            case "january":
                System.out.println("Jan");
                break;

            case "august":
                System.out.println("August");
                break;

            default:
                System.out.println("not sure");
        }

    }
}
