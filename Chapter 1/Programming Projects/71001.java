/*
Chapter 1 Exercise 12

AVERAGE SPEED.
(Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes, and 35 seconds. Write a program that displays the average speed in kilometers per hour. (Note that 1 mile is 1.6 kilometers.)

INPUT and PROMPTS. None.
OUTPUT. The output should be a single number as seen below.
CLASS NAMES. Your program class should be called AvgSpeed
*/

public class AvgSpeed {
	public static void main(String[] args) {
		System.out.println(((24 * 1.6) / (1 + ((40 + (35.0 / 60)) / 60)))); // yay :D
	}
}
