import java.util.Scanner;

public class LongestWord {  
  
    public static String longestWord(String sen) {

        // code goes here
        String longest = "";

        String[] wordsArray = sen.split("[^a-z|A-Z]");

        for(int i = 0; i < wordsArray.length; i++){

            if(wordsArray[i].length() > longest.length()){
                longest = wordsArray[i];
            }
        }
        
        return longest;
    }   

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(longestWord(s.nextLine())); 
    s.close();
  }   
  
}








