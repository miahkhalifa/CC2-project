package arrays;

public class Arrays {

    public static void main(String[] args) {

int num[] = {3, 9, 15, 20, 65, 23, 18 , 4 , 2 , 14, 21};  

System.out.print("ODD" + " \t" + "Even" + "\n");  

for(int odd =0 ;odd < num.length; odd++){
    
    for(int even = 0;even < num.length; even++){ 
      if(num[odd] % 2 == 1) { 
             
         System.out.println("\t" + num[odd]);
      }
          if(num[even] % 2 == 0){
      
       System.out.print(num[even]+ "\n");
       
      }
     }
    }
   }
  
 }

 

