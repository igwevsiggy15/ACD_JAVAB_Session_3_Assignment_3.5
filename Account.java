package bankManagementSystem;

public class Account {

	private int accNo;
	private String accName, accBal;
	
	public Account(int no, String name, String bal){
		this.accNo = no;
		this.accName = name;
		this.accBal = bal;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getAccBal() {
		return accBal;
	}

	public void setAccBal(String accBal) {
		this.accBal = accBal;
	}
	
	public void display(){
		System.out.println("Account Name: " + accNo + "\nAccount Number: " + accNo + "\nAccount Balance: " + accBal);
	}
	
	
}
