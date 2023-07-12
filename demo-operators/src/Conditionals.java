public class Conditionals {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // if, else if, else
    int i = 10;
    if (i > 9) {
      System.out.println("i=" + i);
    }

    // flow control, if-else
    if (i < 8) { //not fulfill
      System.out.println("i is smaller than 8");
    } else {
      System.out.println("i=" + i);
    }

    // String
    String str = "Monday";

    if (str.length() > 10) {}


    int age = 65;
    boolean isElderly = age < 65;// true, 意思係如果後面age>=65 係岩, 甘就true.othervise, false
    System.out.println(isElderly);
  


  

    // switch (同if 好似, switch 用黎做簡單條件,有限數ga answer), 
    //要靠自己做break, 如果唔係會出最後個個answer.永遠都要break!!!!
    //break 係指只會出中條件個個answer







  }
}
