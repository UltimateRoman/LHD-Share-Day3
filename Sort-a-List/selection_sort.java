import java.io.*; 
import java.util.*; 
import java.lang.*; 

class Main { 
public static void main(String args[]) {
    int n; 
    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter no:of elements of the list:"); 
    n = sc.nextInt(); 
    int[] A = new int[n]; 
    System.out.println("Enter elements of the list: "); 
    for(int i=0; i<n; ++i) {
      A[i]=sc.nextInt();
    }
  
    int pos; 
    for(int i=0; i<n-1; ++i) 
    { pos=i; 
      for(int j=i+1; j<n; ++j) 
      {
        if(A[j]<A[pos]) {
           pos=j;
        }
      }
      
      if(A[pos]<A[i]) {
         int temp = A[i]; 
         A[i] = A[pos];
         A[pos] = temp;
      }
    }
    System.out.println("Sorted list: ");
    for(int i=0; i<n; ++i) { 
      System.out.println(A[i]);
    }
  } 
}
