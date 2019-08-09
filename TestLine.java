package PointsAndLines;

import java.util.Scanner;

public class TestLine {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Point 1 X-Value:");
		int x = scan.nextInt();
		System.out.print("Point 1 Y-Value:");
		int y = scan.nextInt();
		Point p1 = new Point(x, y);
		
		System.out.print("Point 1 X-Value:");
		x = scan.nextInt();
		System.out.print("Point 1 Y-Value:");
		y = scan.nextInt();
		Point p2 = new Point(x, y);
		
		Line l1 = new Line(p1, p2);
		l1.display();
	}
}

