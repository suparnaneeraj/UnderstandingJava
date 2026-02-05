package inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        dog.eat();
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.speak();
        cat.eat();
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.speak();
        plant.photosynthesis();
        System.out.println(plant.isAlive);
    }
    
}
