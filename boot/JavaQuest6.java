/**
 * Expected output:
 * 1 1 2 3 5 8 13 21 ...
 * 
 */
public class JavaQuest6 {
  public static void main(String[] args) {
    // for loop to print first 15 numbers in Fibonacci Sequence

    int a= 1;
     int b = 0;
  
    for(int i = 1; i<=15;i++) {
      
      b = a +b;
      System.out.print(b + " ");
      a = b-a;      
    }

    // i = 1,
    // b =  1 + 0 = 1 ,  print 1
    //a = 1 -1 = 0     

    // i = 2, 
    //b = 1 + 0 = 1 ,   print 1
    //a = 1 - 0 = 1      


    // i = 3, b = 2 , a = 1      print 2
    // i = 4, b = 3 , a = 2      print 3
    // i = 5, b = 5 , a = 3      print 5



  }
}