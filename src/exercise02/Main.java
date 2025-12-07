package exercise02;

public class Main {
    public static void main(String[] args) {
        Book myBook= new Book();
        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");
        myBook.setPrice(29.99);
        myBook.display();
        myBook.setPrice(35.50);
        System.out.println("New price :"+myBook.getPrice());
        myBook.setPrice(-5.00);

    }
}
