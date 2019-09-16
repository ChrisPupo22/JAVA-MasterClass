package com.udemy;

public class Main {

    public static void main(String[] args) {
	    float myMinFloatValue = Float.MIN_VALUE;
	    float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Min Float = " + myMinFloatValue);
        System.out.println("Max Float = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Min Double = " + myMinDoubleValue);
        System.out.println("Max Double = " + myMaxDoubleValue);

        int myIntValue = 5 /3;
        float myFloatValue = 5f /3f;
        double myDoubleValue = 5d /3d;
        System.out.println("MyIntVal = " + myIntValue);
        System.out.println("MyFloatVal = " + myFloatValue);
        System.out.println("MyDoubleVal = " + myDoubleValue);

        double poundsToKilo = 34d;
        double kiloMeasure = .45359237d;
        double kiloConv = poundsToKilo * kiloMeasure;

        System.out.println("converted kilos = " + kiloConv);
    }
}
