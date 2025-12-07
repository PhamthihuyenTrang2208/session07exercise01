package exercise02;

public class Book {
    private  String Title;
    private String author;
    private double price;
    public String getTitle() {
        return Title;
    }
    public void setTitle(String Title) {
        this.Title = Title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
        this.price = price;}
        else {
            System.out.println("Price cannot be negative");
        }
    }
    public void display(){
        System.out.println("Book Title: " + Title);
        System.out.println("Book Author: " + author);
        System.out.println("Book Price: " + price);
    }
    }
