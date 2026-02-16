package anonymousClass;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog(){ // This is anonymous class

            @Override
            void speak(){
                System.out.println("Scooby doo goes *Ruh Ruh*");
            }
        };
    
    dog1.speak();
    dog2.speak();
    }
}
