public class String1 {


  public static void main(String[] args) {
    String str = "I am happy, but raining";// value 放入variable
    str = str + ".";
    System.out.println(str);

    //method for String, ()=method
    //1. length(), ans retuen int
    int i = str. length(); // 用variable call 工具 (. length)
    System.out.println(i);

    System.out.println("hello". length());//唔用variable, 直接用value call 工具)


    //equals(), ans return boolean
    String str1 = "abc";
    String str2 = "abc";
    boolean aretheyequal = str1.equals(str2);
    System.out.println(aretheyequal);


    // chatAt(2), find the char at index 2 of the string,佢原本有bug, charAt(-x), charAt(20)
    //可以大過個source, 但冇red line




  }
  
}
