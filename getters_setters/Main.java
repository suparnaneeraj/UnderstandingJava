package getters_setters;

public class Main {
    
    public static void main(String[] args) {
        Car car = new Car("Ford", "Blue", 50000);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
        car.setColor("Red");
        car.setPrice(10000);
        System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());
    }
}
