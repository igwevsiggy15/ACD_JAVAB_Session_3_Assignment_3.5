package bankManagementSystem;

import java.util.Scanner;

public class TestAccount {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the Account Name:");
		String name = scan.next();
		System.out.print("Enter the Account Number:");
		int no = scan.nextInt();
		System.out.print("Enter the Account Starting Balance:");
		String bal = scan.next();
		SavingAccount s1 = new SavingAccount(no, name, bal);
		s1.display();
		
		System.out.print("Enter the Account Name:");
		name = scan.next();
		System.out.print("Enter the Account Number:");
		no = scan.nextInt();
		System.out.print("Enter the Account Starting Balance:");
		bal = scan.next();
		Current c1 = new Current(no, name, bal);
		c1.display();
		
	}
	
}
