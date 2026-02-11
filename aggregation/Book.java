package aggregation;

public class Book {

    String name;
    int pages;

    Book(String name, int pages){
        this.name = name;
        this.pages = pages;
    }

    void displayInfo(){
        System.out.println(this.name + " (" + this.pages + "pages)");
    }
    
    
}
