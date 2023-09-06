public class Loop2 {

  public static void main(String[] args) {
    /////break
    for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
      for (int j = 0; j < 3; j++) { // 0, 1, 2
        System.out.println("i=" + i + "j" + j);
        if (i == j) { // print完先再去依步
          break; // this break statement just break the inner loop, break/直接離開 1 個loop, 返去line 6
        }
      }
    }
    // i = 0, j = 0 , print i = 0 j 0                 i = 0 j 0
    // as i=j, after print then break.

    // i = 1, j = 0 , print i = 1 j 0                 i = 1 j 0
    // i = 1, j = 1 , print i = 1 j 1                 i = 1 j 1
    // as i=j, after print then break.

    // i = 2, j = 0 , print i = 2 j 0                 i = 2 j 0
    // i = 2, j = 1 , print i = 2 j 1                 i = 2 j 1
    // i = 2, j = 2 , print i = 2 j 2                 i = 2 j 2
    // as i=j, after print then break.

    ///// continue (switch 冇, 多入係forloop)

    for (int i = 0; i < 6; i++) { // 0, 1, 2, 3, 4, 5
      for (int j = 0; j < 3; j++) { // 0, 1, 2
        if (i == j) {
          continue; // skip 34 行 in inner loop (燈色{}), continue去line 30 再loop 過第2次, 但break 係去第29行.
        }
        System.out.println("i=" + i + ", j=" + j);
      }
    }
    // i = 0, j = 0 , back to line 30
    // i = 0, j = 1 ,pint
    // i = 0, j = 2 ,pint

    // i = 1, j = 0 , print
    // i = 1, j = 1 , continue, back to line 30
    // i = 0, j = 2 ,pint
    // str.length
    String str = "I love programming. I love java";
    System.out.println("str" + str.length()); // 32

    for (int i = 0; i < str.length(); i++) {
      System.out.println("Hello");
    }

    // str.charAt(int index)
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == 'e') { // true/ false, charAt 要用==,!=, string 要用equal to (check content 係咪一樣) 唔用==
        System.out.println(i);
        break;
      }
    }
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == 'y') {
        System.out.println("found");
      } else {
        System.out.println("not found");
      }
    }

    // if the number of occurrence of target >=3, print yes
    // otherwise, print no

    char target = 'o';
    int count = 0;
    boolean found2 = false;
    for (int i = 0; i < str.length(); ++i) {
      if (str.charAt(i) == target) { //charAt 係用==
        count += 1;
      }

      if (count >= 3) {
        found2 = true;
        break;
      }
    }

    if (found2 == true) {
      System.out.println("yes");
    } else {
      System.out.println("no");
    }
  }
}
