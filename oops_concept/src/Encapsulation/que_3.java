package Encapsulation;

class Author  {
	private String name;
	private String email;
	private char gender;
	public  Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public void setName(String name) {
		this.name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}
	public void setGender(char gender) {
		this.gender=gender;
	}
	public	String getName(){
		return name;
	}
	public	String getEmail(){
		return email;
	}
	public	char getGender(){
		return gender;
	}

	
}
class Book {
	private String bookName;
	private Author author;
	private double price;
	 private int qtyInStock;
	
	public  Book(Author author,String bookName,double price,int qtyInStock){
		this.author=author;
		this.bookName=bookName;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public void setAuthor(Author author) {
		this.author=author;
	}
	public void setName(String bookName) {
		this.bookName=bookName;
	}
	public	void setPrice(double price){
		this.price=price;
	}
	public	void setQtyInStock(int qtyInStock){
		this.qtyInStock=qtyInStock;
	}
	public String getName() {
		return bookName;
	}
	public	double getPrice(){
		return price;
	}
	public	int getQtyInStock(){
		return qtyInStock;
	}
	public Author getAuthor() {
		return author;
	}
	
}

public class que_3 {
   public static void main(String args[]) {
	 Author author=new Author("Ajay","ajay@gmail.com",'M');
	 Book b=new Book(author,"findthem",10.12,301);
	  System.out.println("BookName: "+b.getName()+"\nAuthor Name: "+b.getAuthor().getName()+
			  "\nAuthor Mail: "+b.getAuthor().getEmail()+"\nAuthor Gender: "+b.getAuthor().getGender()+
			  "\nBookPrice: "+b.getPrice()+"\nBook Quantity: "+b.getQtyInStock());

   }
}