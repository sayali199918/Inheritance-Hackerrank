import java.io.*;
import java.util.*;

public class GcdRecursive_hr {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         B a = new B();   //Create an object of class B
            // Read two numbers from the keyboard
            Scanner sc = new Scanner(System.in);  
             int p1 = sc.nextInt();
             int p2 = sc.nextInt();
            System.out.print(a.findGCD(p1,p2)); 
    }
}

interface GCD {
    public int findGCD(int n1,int n2);
}

//Create a class B, which implements the interface GCD.
class B implements GCD{
  public int findGCD(int n1,int n2){
  
  if(n1 < 0 || n2 < 0)
    return -1;
  else if( n2 != 0 )
     return findGCD(n2,n1%n2);
  else 
    return n1;
  }
}