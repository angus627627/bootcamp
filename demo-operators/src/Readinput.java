import java.util.Scanner;

public class Readinput {

  public static void main(String[] args) {
    String str = "Hello";
    str.charAt(0); //H

    //Scammer --> read user input
    System.out.println("Please input the loop count;");
    Scanner scanner = new Scanner(System.in); // 指派s 做俾你input 一樣野, call scanner 依個工具
    int input = scanner.nextInt(); // set input = 你input 個樣野, 儲你打ga 野入input
    System.out.println("input=" + input);

    for (int i = 0; i < input; i++) {
      System.out.println(i + "Hello");
      scanner.close();
    }



  }
}
