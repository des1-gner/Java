/**UseRandomArray.java
*/


import java.util.*;
public class UseRandomArray{
 
  public static void randomArray(int[] arr, int min, int max){
  Random r = new Random();
  for(int i = 0; i < arr.length; i++){
   arr[i] =r.nextInt(max - min + 1) + min;
  }
 }
 public static void printArray(int[] arr){
  for(int i = 0; i < arr.length; i++){
   System.out.print(arr[i] + " ");
  }
  System.out.println();
 }
 public static void main(String[] args){
  //array must be created first
  int[] array = new int[20];
  //before method call
  printArray(array);
  //method call
  randomArray(array, 3, 89);
  //after method call
  printArray(array);
 }
}
