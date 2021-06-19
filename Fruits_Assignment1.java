 class Fruit
 {
 int fruitcount;
 
 void calculate(Mangoes m, Apples a)
 {
 this.fruitcount = m.mango+a.apple;
 }
 
 
 
 void show(Mangoes m,Apples a)
{
 System.out.println("total number of "+fruitcount);
 System.out.println("total number of Mangoes "+m.mango);
 System.out.println("total number of Apples "+a.apple);
 }
 }
 
 class Apples extends Fruit
 {
 int apple;
 Apples(int count)
 {
 apple=count;
 }
 
 }
 class Mangoes extends Fruit
 {
 int mango;
 Mangoes(int count)
 {
 mango = count;
 }
 }
 public class Fruits_Assignment1
{
 public static void main(String args[])
{
 Apples ap = new Apples(35);
 //ap.count(35);
 Mangoes ma = new Mangoes(25);
 //ma.count(10);
 Fruit f = new Fruit();
 f.calculate(ma, ap);
 f.show(ma,ap);
 }
 }
 
