package abstraction;

public class Rectangle extends Shape{
    
    double length, height;

    Rectangle(double length, double height){
        this.height = height;
        this.length = length;
    }

    @Override
    double area(){
        return length * height;
    }
    
}
