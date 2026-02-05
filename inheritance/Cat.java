package inheritance;

public class Cat extends Animal{

    int lives = 9;
    String sound, name;

    Cat(String name,String sound){
        super(name,sound);
    }

    void speak(){
        System.out.println("The cat goes *meow*");
    }

   
}