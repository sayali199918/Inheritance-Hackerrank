import java.io.*;
import java.util.*;

public class Greater_extra_hr implements ExtraLarge {

    
       

    public void display(){
        System.out.print(extra);
    }

    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
    Greater_extra_hr q = new Greater_extra_hr();
      q.display();
    }
}
    

interface ExtraLarge{
    String extra = "This is extra-large";
    public void display();
}

class Large {
    public void Print() {
        System.out.println("This ia large");
    }
}
 
class Medium extends Large {
    public void Print() {
          super.Print();  
        System.out.println("This is medium");
    }
}
class Small extends Medium {
    public void Print() {
        super.Print();  
        System.out.println("This is small");
    }
}