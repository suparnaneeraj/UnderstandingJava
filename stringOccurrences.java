public class stringOccurrences {
    public static void main(String[] args) {
        String sentence =" You are good but   good not as god.Good" , wordToCount="good",tempWord="";
        int lengthOfSentence,count=0;
        lengthOfSentence=sentence.length();
        String [] arrayOfWords =(sentence.toLowerCase()).split("[ .]+");

        // for(int i=0;i<lengthOfSentence;i++){
        //     for(int j=0;j<lengthOfSentence;j++){
        //         if(sentence.)
        //         tempWord=tempWord+sentence[j];
        //     }
        // }
        
        for(int i=0;i<arrayOfWords.length;i++){
            System.out.println(arrayOfWords[i]);
            if(arrayOfWords[i].equals(wordToCount)){
                count++;
            }
        }

        System.out.printf("The count of %s is %d\n" ,wordToCount,count);
    }
    
}
