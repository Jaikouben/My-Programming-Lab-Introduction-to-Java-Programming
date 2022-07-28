/*
Programming Exercise 5.47
*/

import java.util.Scanner;

public class Exercise05_47 {

    public static void main(String[] strings) {
		// Scanner my beloved
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first 12 digits of an ISBN as string: ");
        String s = input.next();

        if (s.length() != 12) {
            System.out.println(s + " is Invalid input");
            System.exit(0);
        }

        int checkSum = 0;
        for (int i = 0; i < s.length(); i++) {

            if ((i + 1) % 2 == 0) {
                checkSum +=  (s.charAt(i) - '0') * 3;

            } else {
                checkSum  += s.charAt(i) - '0';
            }
        }
        checkSum %= 10;
        checkSum = 10 - checkSum;
        if (checkSum == 10) s += "0";
        else  s += checkSum;

        System.out.println("The ISBN-13 number is " + s);
    }
}
