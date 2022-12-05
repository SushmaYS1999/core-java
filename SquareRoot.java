package com;
import java.util.Scanner;
public class SquareRoot {

	public static void main(String[] args) {
		
		      // declare variables
		      int number = 0;
		      int squareRoot = 0;

		      // read input from console
		      Scanner scan = new Scanner(System.in);
		      System.out.print("Enter a number: ");
		      number = scan.nextInt();

		      // find sqrt() value
		      squareRoot = (int) Math.sqrt(number);

		      // display result
		      System.out.println("Square root "
				+ "value = "+ squareRoot);

		      // close Scanner class object
		      scan.close();
		   }
		
	}


