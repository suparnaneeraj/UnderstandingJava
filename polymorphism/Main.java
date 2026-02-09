package polymorphism;

public class Main {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Car car = new Car();
        Boat boat = new Boat();

        Vehicle[] vehicles = {car, bike, boat};  // instead of declaring Vehicle as abstract class you can also use imterface but then it would be implements
        for(Vehicle vehicle : vehicles){
            vehicle.go();
        }

    }
    
}
