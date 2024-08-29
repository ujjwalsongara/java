 import java.util.*; 
    public class Listtest{
 public static void main(String args[]){  
 //Creating a List  
 List<String> list=new ArrayList<String>();  
 //Adding elements in the List  
 list.add("Mango");  
 list.add("Apple");  
 list.add("Banana");  
 list.add("Grapes");  
 //accessing the element    
 System.out.println("Returning element: \n"+list.get(1));//it will return the 2nd element, because index starts from 0  
 //changing the element  
 list.set(1,"Dates");  
 //Iterating the List element using for-each loop  
 for(String fruit:list)  
  System.out.println(fruit);  

  System.out.println("Sorting numbers...");  
  //Creating a list of numbers  
  List<Integer> list2=new ArrayList<Integer>();  
  list2.add(21);  
  list2.add(11);  
  list2.add(51);  
  list2.add(1);  
  //Sorting the list  
  Collections.sort(list2);  
   //Traversing list through the for-each loop  
  for(Integer number:list2)  
    System.out.println(number); 
  
 }   
}  


