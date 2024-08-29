public class palindrom {
        public static void main(String[] args) {    
            String string = "hello";  //mom  
               
            String reversed = "";    
             
            for(int i = string.length()-1; i >= 0; i--)
          
            {    
             reversed = reversed + string.charAt(i);    
            }    
                
            System.out.println("original string: " + string);    
            
              
            System.out.println("reverse string: "+ reversed); 
            if (string.equals(reversed)){
            System.out.println("palindrome");
            }   
            else {
               System.out.println("not a palindrome");
            }
        }  
}

