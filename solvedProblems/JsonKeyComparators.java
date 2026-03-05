package solvedProblems;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JsonKeyComparators {
    
    public static void main(String[] args) {
        
        String json1 = "{\"name\": \"John\", \"age\": 20}";
        String json2 = "{\"age\": 20 , \"name\": \"John\"}";
        boolean status;
        Map<String,String> jsonMap1 = stringToMap(json1);
        Map<String,String> jsonMap2 = stringToMap(json2);
        status = jsonKeyComparator(jsonMap1, jsonMap2);
        if(status){
            System.out.println("The two jsons are equal");
        }
        else{
            System.out.println("The two jsons are not equal");
        }
       
    }

    static Map<String,String> stringToMap(String json){
        Map<String,String> jsonMap1 = new HashMap<>();
        if(json.startsWith("{")){
            json = json.substring(1);
        }
         if(json.endsWith("}")){
            json = json.substring(0,json.length()-1);
            System.out.println(json);
        }
        String[] pairs = json.split(",");
        for(int i=0;i<pairs.length;i++){
            String[] valuesInPair = pairs[i].split(":");
            jsonMap1.put(valuesInPair[0].trim(), valuesInPair[1].trim());
        }
        return jsonMap1;
    }
     

        
     

    
    static boolean jsonKeyComparator(Map<String,String> jsonMap1, Map<String,String> jsonMap2){
        return jsonMap1.equals(jsonMap2);
    }
}
