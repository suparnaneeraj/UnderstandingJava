package inheritance;

public class Animal extends Organism {

    String sound,name;
    Animal(String name, String sound){
        this.name = name;
        this.sound = sound;
    }

    void sound(){
        System.out.println("This animal makes "+this.sound+ " sound");
    }
    void eat(){
        System.out.println("The animal is eating");
    }

    void move(){
        System.out.println("The animal is moving");
    }

    @Override
    public String toString(){
        return "This is a " +this.name+ " with sound "+this.sound;
    }
    
}
