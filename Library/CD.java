import java.util.Date;

public class CD extends Library{
	private String Genre;
	
	public CD() {
		super();
	}
	
	public CD(String a, String b,int c, boolean d, Date e) {
		super(a,b,c,d,e);
	}
	
	public String GetGenre() {
		return Genre;
	}
	
	public void SetGenre(String a) {
		this.Genre = a;
	}
	
	public void printDetails() {
		System.out.println("\nCD Name: "+Title+"\nArtist: "+Author_Artist+"\nCD ID: "+ItemID+"\nOn Loan: "+OnLoan+"\nDue Date: "+DueDate);		
	}
}