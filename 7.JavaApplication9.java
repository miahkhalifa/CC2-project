/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

/**
 *
 * @author CC2_1E-17
 */
public class JavaApplication9 {

    
    public static void main(String[] args) {
       int [] a = {3,5,7,13,2,3,9};
               display(a);
      
    }
    static void display(int [] a){
   
     for(int i=0; i<a.length; i++){
        System.out.println( "f("  +  a[i]  + ")=" + fib(a[i])+ "\t"); 
        
     }
        System.out.println("");
    
     }
    static int fib(int a){
        if (a<=1){
            return a;
            
        }else{
            return fib(a-1) + fib(a-2);
        
    }
}
}
