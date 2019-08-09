package bankManagementSystem;

public class SavingAccount extends Account{
	
private double rateOfInt;
	
	public SavingAccount(int no, String name, String bal){
		super(no, bal, bal);
	}
	
	@Override
		public void display() {
			// TODO Auto-generated method stub
			super.display();
		}	
}
