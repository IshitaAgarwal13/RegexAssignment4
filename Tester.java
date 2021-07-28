package Const_Static;

class Author{
	String name;
	String emailid;
	char gender;
	
	Author(String name, String emailid, char gender){
		this.name=name;
		this.emailid=emailid;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
}

class Book{
	String name;
	Author author;
	double price;
	int quantity;
	
	Book(String name, Author author, double price, int quantity){
        this.name=name;
        this.author=author;
        this.price=price;
        this.quantity=quantity;
	}
	void displayAuthorDetails() {
		System.out.println("Displaying author details:");
		System.out.println("Author name:"+author.getName());
		System.out.println("Author email:"+author.getEmailid());
		System.out.println("Author gender:"+author.getGender());
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author author1=new Author("Joshua Bloch","Joshua@email.com",'M');
		Book book1=new Book("Effective Java",author1,45,15);
		book1.displayAuthorDetails();
		

	}

}
