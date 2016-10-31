//Max Russell 2nd Period 9/29/16 Collaborative Programming Exercise
import java.util.Scanner;

public class CollaberativeExercise {
	
	public static void main(String[] args) {
		Scanner amountOfNumbers = new Scanner(System.in);
		int numberCount = amountOfNumbers.nextInt();
		Scanner userInput = new Scanner(System.in);
		int inputNumber = userInput.nextInt();
		int min = inputNumber;
		int max = min;
		int largestEven;
		int compareNumbers = 0;
		System.out.println("Enter 10 Numbers");
		for(int i = 1; i <= numberCount; i++){
			if(inputNumber % 2 == 0){
			System.out.println("This is even"+ inputNumber);
			}
			if(inputNumber < min){
				min = inputNumber;
			}
			if(inputNumber > max){
				max = inputNumber;
			}
			if(max % 2 == 0){
				largestEven = inputNumber;
			}
			System.out.println("This is the smallest number: " + min);
			System.out.println("This is the largest number: " + max);
			System.out.println("This is the largest even number: " + largestEven);
		 }
	}
}