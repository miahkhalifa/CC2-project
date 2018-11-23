package edede;
import java.util.Scanner;

public class Edede {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int comp = ((int) (Math.random()*1000)+1);
       int Pontillo;
       int a = 1, b = 0;
       
       System.out.println("I am thinking of a number from 1 to 1000 ... guess what it is ?" );
     Pontillo = sc.nextInt();
      do{  
              if (comp %2 == b ){
                System.out.println("The number is even");
              }  
              if (comp %2 == a){
                 System.out.println("the number is odd");
              }
              
              if (Pontillo < comp){
                 System.out.println("The number is higher"); 
              }
               if (Pontillo > comp){
                 System.out.println("The number is lower"); 
              }
               if (Pontillo > 1000){
               System.out.println("The number is more than 1000");
               
               }
                System.out.println("Enter a number from 1 - 1000" );
     Pontillo = sc.nextInt();
        }
        while(Pontillo != comp);
            
            System.out.println("correct number" + comp );
   
    }
}
