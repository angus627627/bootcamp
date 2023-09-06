public class Operators {

  public static void main(String[] args) {
    int a = 1;
    a = a + 1;
    a = a - 2;
    int b = 10 / 5;
    b = b * 3 + 5;
    System.out.println("a+b=" + a + b); //a+b=011 強行會轉做string 如果()入面有string

    // + 1 operations
    int x = 1;
    x = x + 1; //自身+1
    x++; //自身+1
    ++x; //自身+1
    x += 1; //自身+1
    System.out.println("x=" + x);

    //- 1 operations
    int y = 10;
    y = y - 1;
    y--;
    --y;
    y -= 1;

    int integer = 12 % 5; //2
    int integer2 = 12;
    integer2 %= 5; //2
    System.out.println(integer2 + integer);

    int m = 3;
    m++; //4
    int preIncrement = ++m;//5
    System.out.println("preIncrement=" + preIncrement);//5
    int postIncrement = m++; //5, assignment first, n-1 later
    System.out.println("postIncrement=" + postIncrement);//5
    System.out.println("m=" + m);//6

    //String +=
    String str = "hello";
    str += "World";//hello world

    
  }
}
