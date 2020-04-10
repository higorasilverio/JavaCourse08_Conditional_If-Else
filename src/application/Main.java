package application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Number: even or odd ***");
		
		System.out.print("Enter the number: ");
		if (scanner.nextInt() % 2 == 0) System.out.println("This number is even!");
		else System.out.println("This number is odd!");
		
		scanner.close();
	}

}
