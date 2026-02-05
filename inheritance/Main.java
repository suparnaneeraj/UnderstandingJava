package inheritance;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog("Dog","Woof");
        Cat cat = new Cat("Cat","Meow");
        Plant plant = new Plant();
        Fish fish = new Fish("Fish","Blumm");

        System.out.println(dog);
        dog.eat();
        System.out.println(dog.isAlive);
        System.out.println(dog.lives);
        dog.sound();
        dog.move();

        System.out.println(cat);
        cat.eat();
        System.out.println(cat.isAlive);
        System.out.println(cat.lives);
        cat.sound();
        
        plant.photosynthesis();
        System.out.println(plant.isAlive);
        
        
        cat.move();
        System.out.println(fish);
        fish.move();
        fish.sound();

    }
    
}
