 import java.io.*;
 import java.util.*;
 
 class Mammals{
 
 public void mammals(){
 System.out.println("I am mammal");
 }
 
 }
 
 class MarineAnimals extends Mammals{
 
 public void marineAnimals(){
 System.out.println("I am a marine animal");
 }
 
 }
 
 class BlueWhale extends MarineAnimals{
 
 public void blueWhale(){
 System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
 }
 
 }
 
 public class Solution_mammals {
 
 public static void main(String[] args) {
 BlueWhale bw = new BlueWhale();
 bw.mammals();
 bw.marineAnimals();
 bw.blueWhale();
 
 Mammals m = new Mammals();
 m.mammals();
 
 MarineAnimals ma = new MarineAnimals();
 ma.marineAnimals();
 }
 }
