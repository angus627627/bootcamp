public class ReverseString {

  public static void main(String[] args) {
    String str = "hello";
    // output: olleh
    for (int i = 4; i >= 0; i--) {
      System.out.print(str.charAt(i));
    }

    String reversed = "";
    for(int i = str.length()-1 ; i >=0; i--){ //i=3
            reversed += str.charAt(i);
    }
    System.out.println(reversed);


  }
}
