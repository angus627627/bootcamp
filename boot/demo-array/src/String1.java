public class String1 {

  public static void main(String[] args) {
    //工具: .length(), .equals(), .charAt()

    // 工具 .isEmpty()
    String str = "Hello";
    System.out.println(str.isEmpty()); // false

    String str2 = ""; // --> empty string (什麼都冇=empty)
    System.out.println(str2.isEmpty()); // true

    String str3 = " ";
    System.out.println(str3.isEmpty()); // false

    // 工具 .isBlank()
    System.out.println(str.isBlank()); // false
    System.out.println(str2.isBlank()); // True
    System.out.println(str3.isBlank()); // True (冇填過野/only space = isBlank)

    // 工具 toLowerCase(), toUpperCase()
    System.out.println(str.toUpperCase()); // HELLO (冇save入/改變str, 即時print 出黎only)
    System.out.println(str); // hello
    System.out.println(str.toUpperCase().toLowerCase()); // hello

    str = str.toUpperCase();
    System.out.println(str); // HELLO

    str += str.toLowerCase();
    System.out.println(str); // HELLOhello    


    if (str.toUpperCase().equals("HELLO")) {
      System.out.println("yes, it is HELLO");
    }

    // 工具 substring 1 (取陪份value from string)
    //start index is normal index
    // hello --> 擺he
    System.out.println(str.substring(0, 2)); //0 = start index, 2-1 = end index ans is he, (h =0 e=2-1=1)
    System.out.println(str.substring(2, 3)); //l 由0數起,0 1 2, l = start index; 0 1 2 3, -1 =l
    System.out.println(str.substring(0, 5)); //hello

    // 工具 substring 2 (choose 由which index 做start index, default ending index = 最後個個index)
    System.out.println(str.substring(0)); //hello
    System.out.println(str.substring(3)); //lo
    if (str.substring(3).equals("lo")) {
      System.out.println();
    }

    //工具 contains() , ans 出true, fales
    String s = "lo";
    System.out.println(str.contains(s)); // 睇下string 有冇"lo"; true (hello contains lo)
    System.out.println(str.contains("ol")); // fales (hello not contains ol)
    // --> 結合if then else
    if (str.contains("lo")) {
      System.out.println("str contains lo");
    }
  }
}
