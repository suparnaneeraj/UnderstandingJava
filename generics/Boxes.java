package generics;

public class Boxes<T> {

    T item;

    public void setItem(T item){
        this.item=item;
    }

    public T getItem(){
        return this.item;
    }
    
}
