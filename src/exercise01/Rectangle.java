package exercise01;

public class Rectangle {

        private final double length,width;
        public Rectangle(){
            length = 1;
            width = 1;
        }
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        public double getLength() {
            return length;
        }
        public double getWidth() {
            return width;
        }
        public double getArea() {
            return length*width;
        }
        public double getPerimeter() {
            return 2*(length+width);
        }
        public void display(){
            System.out.println("length is "+getLength());
            System.out.println("width is "+getWidth());
            System.out.println("Area is "+getArea());
            System.out.println("Perimeter is "+getPerimeter());

        }}

