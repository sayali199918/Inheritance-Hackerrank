import java.io.*;
import java.util.*;


public class Point_hr extends Point{
    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
     Scanner sc = new Scanner(System.in);
     Point c=new Point(); //Create a point center
     c.x=sc.nextDouble();
     c.y=sc.nextDouble();
     Point p=new Point();  //Create a point on circumference
     p.x=sc.nextDouble();
     p.y=sc.nextDouble(); 
     Point_hr c1=new Point_hr(); //Create an object of class Circle
     c1.distance(c,p);  //Calcualte radius of the circle
    
    }
}

class Point {
    double x,y;
    double distance(Point p1, Point p2)
    {
        double result;
        result = Math.sqrt(Math.pow((p2.x - p1.x),2) + Math.pow((p2.y - p1.y),2));
         System.out.print(result);
        return result;        
    }
}