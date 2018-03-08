import java.util.Date;

public class Library {
	public String Title, Author_Artist;
	public int ItemID;
	public boolean OnLoan;
	public Date DueDate;
	public Library() {
		this.Title="Unknown";
		this.Author_Artist="Unknown";
		this.ItemID=0;
		this.OnLoan=false;
		this.DueDate=new Date();
	}
	
	public Library(String title, String author_Artist, int itemID, boolean onLoan, Date dueDate) {
		this.Title = title;
		this.Author_Artist = author_Artist;
		this.ItemID = itemID;
		this.OnLoan = onLoan;
		this.DueDate = dueDate;
	}
	public String GetTitle(){
		return Title;
	}
	
	public String GetAuthor_Artist(){
		return Author_Artist;
	}
	
	public int GetItemID(){
		return ItemID;
	}
	
	public boolean GetOnLoan(){
		return OnLoan;
	}
	
	public Date GetDueDate(){
		return DueDate;
	}
	
	public void Borrowing() {
		this.OnLoan = true;		
	}
	
	public void Returning() {
		this.OnLoan = false;
	}
	
	public void printDetails() {
		System.out.println("\nTitle: "+Title+"\nAuthor/Artist: "+Author_Artist+"\nID: "+ItemID+"\nOn Loan: "+OnLoan+"\nDue Date: "+DueDate);		
	}
	
	public static void main(String[] args) {
        Book b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date());
        b.printDetails();
        CD cd = new CD("And Justice for all", "Metallica", 567, false, new Date());
        cd.printDetails();
    }    
}
