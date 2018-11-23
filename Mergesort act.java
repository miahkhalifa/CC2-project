package mergesort;
import java.util.Scanner;
public class Mergesort {
    
 public static void sort(int []z, int low, int high){
     int num = high-low;
     
     if (num <= 1)
         return;
     int mid = low + num / 2;
     
     sort(z, low, mid);
     sort(z, mid, high);
     
     int temp [] = new int [num];
     int i = low, j = mid;
     
     for (int x=0; x<num; x++){
         if (i==mid)
             temp[x] = z[j++];
         else if (j== high)
             temp[x] =z[i++];
         else if (z[j] < z[i])
             temp[x] = z[j++];
         else
             temp[x]= z[i++];
     }
     for (int x =0; x < num; x++){
         z[low + x] = temp[x];
     }
 
 }
    public static void main(String[] args) {
     Scanner input = new Scanner (System.in);
     int element, i;
     
     System.out.println("Enter number of integer elements: ");
     element = input.nextInt();
     
     int arr[] = new int [element];
     
     System.out.println("Enter " + element + " integer elements");
     
     for (i = 0; i < element; i++)
         arr[i] =input.nextInt();
     
     sort (arr , 0 , element);
     
     System.out.println("Elements after sorting");
     for (i = 0; i< element; i++){
     System.out.print(arr[i] + " ");
     System.out.println();
     } 
    }
    
}
