import java.util.Scanner;


 class marks
 {
 Physics p;
 Chemistry c;
 Mathematics m;
 static int rollno=1;
 float avg;
 int sum;
 void total(Physics p,Chemistry c,Mathematics m)
 {
 sum = p.marks+c.marks+m.marks;
 avg =(sum)/3;

 System.out.println(rollno++);
 System.out.println(p.marks);
 System.out.println(c.marks);
 System.out.println(m.marks);
 System.out.println(sum);
 System.out.println(avg);

 }

 }
 class Physics extends marks
 {
 int marks;

 void getmarks(int marks)
 {
 this.marks=marks;
 }
}
 class Chemistry extends marks
 {
 int marks;

 void getmarks(int marks)
 {
 this.marks=marks;
 }
 }
 class Mathematics extends marks
 {
 int marks;

 void getmarks(int marks)
 {
 this.marks=marks;
 }

 }
 public class Marks_ass {

 public static void main(String[] args) {

 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number of students in a class");
 int n = sc.nextInt();

 Mathematics mh = new Mathematics();
 mh.getmarks(80);
 Physics ph = new Physics();
 ph.getmarks(70);
 Chemistry ch = new Chemistry();
 ch.getmarks(90);

 marks mp = new marks();
 mp.total(ph,ch,mh);
}
}
