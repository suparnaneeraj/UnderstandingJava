package inheritance;

public class Fish extends Animal {
      
    String name, sound;

    Fish(String name, String sound){
        super(name,sound);
    }
    @Override
    void move(){
        System.out.println("This animal is swimming");
    }
    
}
