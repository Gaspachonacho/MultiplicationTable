package lab4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		//////////////////////////////////////////////////////////////
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("x: ");
		int xAxis = scan.nextInt();
		
		System.out.print("y: ");
		int yAxis = scan.nextInt();
		
		MultiplicationTable table = new MultiplicationTable(xAxis, yAxis);
		table.print();
		
	}

}
