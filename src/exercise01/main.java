package exercise01;

public class main {
    public static void main(String[]args){
        System.out.println("Rectangle 1:");
        Rectangle rectangle = new Rectangle();
        rectangle.display();
        System.out.println("Rectangle 2:");
        Rectangle rectangle2 = new Rectangle(5.0,3.0);
        rectangle2.display();
    }
}
