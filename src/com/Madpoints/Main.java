package com.Madpoints;

public class Main {

    public static void main(String[] args) {
        int value = 4;

        switch (value) {
            case 1:
                System.out.println("Value: " + value);
                break;
            case 2:
                System.out.println("Value: " + value);
                break;
            /* Group break statements together */
            case 3: case 4: case 5:
                System.out.println("Value: " + value);
                break;
            default:
                System.out.println("Not 1-5");
                break;
        }

        char letter = 'B';

        switch (letter) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found your letter '" + letter + "'!");
                break;
            default:
                System.out.println("Can't find that letter");
                break;
        }

        String month = "DeCemBer";

        switch (month.toLowerCase()) {
            case "october":
                System.out.println("Happy Halloween!");
                break;
            case "november":
                System.out.println("Happy Thanksgiving!");
                break;
            case "december":
                System.out.println("Merry Christmas!");
                break;
            case "january":
                System.out.println("Happy New Year!");
            default:
                System.out.println("Meh all the other holidays are just ok.");
                break;
        }
    }
}
