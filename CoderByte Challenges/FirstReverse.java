import java.util.*; 
import java.io.*;

public class FirstReverse{  
  public static String firstReverse(String str) { 
      
    int lastIndex = str.length() - 1;
    String reversed = "";

    for(int i = lastIndex; i >= 0; i--) {
        reversed = reversed + str.charAt(i);
    }
    
    return reversed;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(firstReverse(s.nextLine())); 
    s.close();
  }   
  
}


