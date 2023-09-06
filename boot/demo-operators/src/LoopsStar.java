public class LoopsStar {

  public static void main(String[] args) {

  String star = "*";
  for (int i = 0; i<5; i++) {
    for (int j=0; j <=i; j++) {
    System.out.print(star);
  }
  System.out.println("");
  }

    // i = 0, j = 0, star
    // i = 0, j = 1, exit


    // i = 1, j = 0, star
    // i = 1, j = 1, star
    // i = 1, j = 2, exit

    // i = 2, j = 0, star
    // i = 2, j = 1, star
    // i = 2, j = 2, star   
    // i = 2, j = 3, exit

    // i = 3, j = 0, star
    // i = 3, j = 1, star
    // i = 3, j = 2, star
    // i = 3, j = 3, star
    // i = 3, j = 4, exit

    // i = 4, j = 0, star
    // i = 4, j = 1, star
    // i = 4, j = 2, star   
    // i = 4, j = 3, star
    // i = 4, j = 4, star  
    // i = 4, j = 5, exit

    String str ="";
    for(int i = 0; i < 5; i++) {
str += "*";
      System.out.println(str); //{} 內每loop 一次print 一次
    }


    str = "";
    
    for (int i = 0; i <5; i++) {
   str = ""; // 重點!!, reset str = 0 星星
       for (int j = 0; j <i+1; j++) {
   str += "*";
    }
      System.out.println(str);} //第2個loop 完哂先print

    // i = 0, j = 0, j< 1, star
    // i = 0, j = 1, j< 1, exit
    //str = *
    //printout *

    // i = 1, j = 0, j< 2, star
    // i = 1, j = 1, j< 2, star
    // i = 1, j = 2, j< 2, exit
    //str = * + **
    //printout ***

    // i = 2, j = 0, j< 3, star
    // i = 2, j = 1, j< 3, star
    // i = 2, j = 2, j< 3, star   
    // i = 2, j = 3, j< 3, exit
    //str = *** + ***
    //printout ******

    // i = 3, j = 0, star
    // i = 3, j = 1, star
    // i = 3, j = 2, star
    // i = 3, j = 3, star
    // i = 3, j = 4, exit

    // i = 4, j = 0, star
    // i = 4, j = 1, star
    // i = 4, j = 2, star   
    // i = 4, j = 3, star
    // i = 4, j = 4, star  
    // i = 4, j = 5, exit










}
}
