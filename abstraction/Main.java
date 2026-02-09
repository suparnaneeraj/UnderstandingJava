package abstraction;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Triangle triange = new Triangle(5, 10);
        Rectangle rectangle = new Rectangle(5, 8);

        circle.display();
        System.out.println("The area of circle is :" +circle.area());

        circle.display();
        System.out.println("The area of rectangle is :" +rectangle.area());

        circle.display();
        System.out.println("The area of triangle is :" +triange.area());

    }
    
}
