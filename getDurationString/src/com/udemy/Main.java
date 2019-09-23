package com.udemy;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDuration(65, 45));
        System.out.println(getDuration(3945));

    }

	    public static String getDuration(long minutes, long seconds) {
	        if((minutes < 0) || (seconds < 0) || (seconds > 59)) {
                System.out.println("Invalid value");
            }
	            long hours = minutes / 60;
                long remainingMinutes = minutes % 60;
                
                return hours + "h " +remainingMinutes + "m " + seconds + "s ";
    }

    public static String getDuration(long seconds) {
        if(seconds < 0) {
            return "Invalid value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;
        return getDuration(minutes, remainingSeconds);

    }
}
