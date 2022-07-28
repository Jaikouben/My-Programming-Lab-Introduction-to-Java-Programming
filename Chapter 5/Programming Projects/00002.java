/*
Programming Exercise 5.7
*/

public class Exercise05_07 {
	public static void main(String[] args) {
		// Calculate!
		double tuition = 10000;
		double total = 0;
		double tenthYear = 0;
		for (int i = 1; i <= 13; i++) {

			tuition += (tuition * 0.05);
			if (i == 10){
				tenthYear = tuition;
			}
			if (i >= 10){
				total += tuition;
			}
		}
		
		// Print results
		System.out.println("Tuition in ten years is " + tenthYear);
		System.out.println("The four year total tuition in ten years is " + total);

	}
}
