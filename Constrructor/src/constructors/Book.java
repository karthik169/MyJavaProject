package constructors;

public class Book {
	public String title;
	public int cost;
	public String author;
	public int noOfPages;
	
	public Book(String booktitle,int bookCost,String bookAuthor,int bookNoOfPages ) {
		 title = booktitle;
		 cost = bookCost;
		 author = bookAuthor ;
		 noOfPages = bookNoOfPages;
	}
	public void bookDisplay() {
		System.out.println("BookTitle:"+title);
		System.out.println("bookCost:"+cost);
		System.out.println("bookAuthor:"+author);
		System.out.println("bookNoOfPages:"+noOfPages);
	}
	

}

