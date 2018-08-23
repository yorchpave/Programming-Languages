import java.util.Scanner;

public class FirstFactorial {  
  public static int firstFactorial(int num) { 
  
    // code goes here   
    int factorial = 1;

    for(int i = 1; i <= num; i++){

        factorial = factorial * i;

    }
    
    return factorial;

  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.println(firstFactorial(s.nextInt())); 
    s.close();
  }   
  
}







  









  