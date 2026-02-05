package inheritance;

public class Dog extends Animal {

    int lives = 1;
    String sound, name;

    Dog(String name, String sound){
        super(name,sound);
    }

    void speak(){
        System.out.println("The Dog goes *woof*");
    }
    
}
