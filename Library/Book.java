import java.util.Date;

public class Book extends Library{
	private boolean IsRequested;
	
	public Book() {
		super();
	}
	
	public Book(String a, String b,int c, boolean d, Date e) {
		super(a,b,c,d,e);
	}
	
	public boolean GetIsRequested() {
		return IsRequested;
	}
	
	public void SetIsRequested(boolean a) {
		this.IsRequested = a;
	}
	
	public void printDetails() {
		System.out.println("\nBook Name: "+Title+"\nAuthor: "+Author_Artist+"\nBook ID: "+ItemID+"\nOn Loan: "+OnLoan+"\nDue Date: "+DueDate);		
	}
}
