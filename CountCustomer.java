package customer;

import java.util.Scanner;

public class CountCustomer {
	
public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(Customer.getCustCount() + " Customers.");
		
		System.out.print("Enter Customer name:");
		String name = scan.nextLine();
		System.out.print("Enter Customer No.:");
		int no = scan.nextInt();
		Customer c1 = new Customer(name, no);
		System.out.println(Customer.getCustCount() + " Customers.");

		System.out.print("Enter Customer name:");
		String name2 = scan.next();
		System.out.print("Enter Customer No.:");
		int no2 = scan.nextInt();
		Customer c2 = new Customer(name2, no2);
		System.out.println(Customer.getCustCount() + " Customers.");
		
		System.out.print("Enter Customer name:");
		name = scan.next();
		System.out.print("Enter Customer No.:");
		no = scan.nextInt();
		Customer c3 = new Customer(name, no);
		System.out.println(Customer.getCustCount() + " Customers.");
		
		
			
		scan.close();
		
		
	}

}
