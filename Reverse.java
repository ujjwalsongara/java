public class Reverse {
        public static void main(String[] args) {    
            String string = "dlrow olleh";  //mom  
            //Stores the reverse of given string    
            String reversed = "";    
                
            //Iterate through the string from last and add each character to variable reversedStr    
            for(int i = string.length()-1; i >= 0; i--)
           // for(int i =11-1; i >= 0; i--)
            {    
             reversed = reversed + string.charAt(i);    
            }    
                
            System.out.println("original string: " + string);    
            
            //Displays the reverse of given string    
            System.out.println("reverse string: "+ reversed); 
            if (string.equals(reversed)){
            System.out.println("palindrome");
            }   
            else {
               System.out.println("not a palindrome");
            }
        }  
}
