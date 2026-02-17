import java.util.HashMap;

public class HashMapProgram {

    public static void main(String[] args){
        HashMap<String, Double> map = new HashMap<>();

        map.put("Orange", 0.50);
        map.put("apple", 0.70);
        map.put("grapes", 0.30);

        map.remove("grapes");
        map.put("banana", 0.2);

        if(map.containsKey("apple")){
            System.out.println("Apple is " + map.get("apple") + "$");
        }
        else{
            System.out.println("Key not found");
        }

        if(map.containsValue(1.00)){
            System.out.println("There are fruits for the given value");
        }
        else{
            System.out.println("No such fruits with the given value found");
        }
        System.out.println("The elements in map are: ");
        for(String key : map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
    }
    
}
