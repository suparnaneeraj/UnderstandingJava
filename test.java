public class test {
    public static String reverseSentence(String s){
        String [] sentenceArray=s.split(" ");
        String newString="";
        for(int i=sentenceArray.length-1;i>=0;i--){
            newString+=sentenceArray[i]+" ";
        }
        return newString.trim();
    }
    public static int nonRepeatingCharacter(String s){
        int index=-1,count;
        for(int i=0;i<s.length();i++){
            count=1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                count++;
                }
            }
            if(count==1){
                System.out.println("Isnide if");
                return i;
            }
        }
        
        return index;
    }
    public static void main(String[] args){
        String s="swiss";
        System.out.println(nonRepeatingCharacter(s));
    }
    
}

