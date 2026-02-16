package generics;


public class Main {
    public static void main(String[] args) {
        
        Boxes<String> box = new Boxes<>();
        box.setItem("Bag");
        System.out.println("The item is "+box.getItem());

        Product<String, Double> product = new Product<>("Shoes", 1500.50);
        System.out.println(product.getItem());
        System.out.println(product.getPrice());

    }
    
}
