package oopexercises;

public class LoanAccount implements Irate{

	@Override
	public void setRate() {
		// TODO Auto-generated method stub
		System.out.println("Rates");
	}

	@Override
	public void increaseRate() {
		// TODO Auto-generated method stub
		System.out.println("Increase rate rate");
	}

	public void setTerm(int term) {
		System.out.println(" Setting the term to: "+term+" years.");
	}
	
	public void setAmortSchedule() {
		System.out.println("Schedule");
	}
}
