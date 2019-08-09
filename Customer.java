package customer;

public class Customer {

	
	private int custNo;
	private String custName;
	private static int custCount;
	
	public int getCustNo() {
		return custNo;
	}

	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public static int getCustCount() {
		return custCount;
	}

	static{
		custCount = 0;
	}
	
	public Customer(String name, int no){
		this.custName = name;
		this.custNo = no;
		custCount++;
	}
	
}
