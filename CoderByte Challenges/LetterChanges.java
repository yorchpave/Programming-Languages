import java.util.Scanner; 

class LetterChanges {  
  public static String letterChanges(String str) { 
  
    char[] string = str.toCharArray();
    char asciiCharValue = '\0';

    int asciiIntValue = 0;

    String finalString = "";
   

    int index = 0;
    for(char c : string){

        if(Character.isLetter(c)){

            asciiIntValue = c + 1;

            asciiCharValue = (char)asciiIntValue;

            if(Character.toString(asciiCharValue).matches("[aeiou]")){
        
                asciiCharValue = Character.toUpperCase(asciiCharValue);


            }
      
            index++;

        }
        else {
            asciiCharValue = c;
        }

        finalString += asciiCharValue;
    }

    return finalString;
    
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(letterChanges(s.nextLine())); 
    s.close();
  }   
  
}