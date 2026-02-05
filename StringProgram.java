import java.util.ArrayList;

public class StringProgram {
    public static String[] testFunction(String[] words, String letters){
        String[] result=new String[words.length];
        //ArrayList<String> result=new ArrayList<>();
        int k=0;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<letters.length();j++){
                if(words[i].indexOf(letters.charAt(j))!=-1){
                    result[k]=words[i];
                    k++;
                    //result.add(words[i]);
                }
            }
        }
        if(k!=words.length){
            String[] result1=new String[k];
            for(int i=0;i<k;i++){
                result1[i]=result[i];
            }
            return result1;
        }
       
        return result;
        //return result.toArray(new String[0]);
    }
    public static void main (String[] args){
        String[] s={"the","a","dog","bone","good"};
        String letters="ae";
        String[] newS= testFunction(s, letters);
        for(int i=0;i<newS.length;i++){
            System.out.println(newS[i]);
        }
    }
}
