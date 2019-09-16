package com.udemy;

public class Main {

    public static void main(String[] args) {
	    byte myByteVal = 100;
	    short myShortVal = 200;
	    int myIntVal = 10000;

	    long myLongVal = 50000L + (10L * (myByteVal + myIntVal + myShortVal));

        System.out.println(myLongVal);
    }
}
