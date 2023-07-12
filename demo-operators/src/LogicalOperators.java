public class LogicalOperators {

  public static void main(String[] args) {
    boolean isExpensive = true;
    boolean isWorthToBuy = false;
    // && Operator (and)
    boolean result = isExpensive && isWorthToBuy; // false (true,false => false)

    // || operator (or)
    boolean result2 = isExpensive || isWorthToBuy; //true

    int a = 5;
    int b = 10;
    int c = 13;
    //==, >=, <=
    //==,mean asking if a equal b? -> true/ false
    boolean result7 = a == b; // false
    boolean result10 = c !=13; //false, != mean not equal to 
    //! = Not

    boolean result11 = !(c<13);// true, 問緊C<13 係咪錯


    // Operators Precedence
    int result13 = (1+9)*3; //30
    int result14 = ++result13 + 1; // result14 32
    int i = 27;
    int result15 = i++ + 1;// 

    boolean result16 = 25+2 < result15 + 1; //true

    //
    int x = 5;
    int y = 10;
    int z = x += 3 * y; // 35
    System.out.println(x);   
    int result17 = (x++ + 2)* x++;
    System.out.println(x); 
    System.out.println(result17);

x=5
int result17 = (x++ + 2)* x++



  }
}
