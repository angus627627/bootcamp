public class ProductSequence {

  public static void main(String[] args) {
    //0 1 2 3 4 5
    // print out 0 2 6 12 20
    // print first 20
    int count = 0;
    for (int a = 0; a >= 0; a++) { // a= 0 1 2 3 4 5
      System.out.print(a * (a + 1) + ", "); //0*1,1*2
      count += 1;
      if (count == 20) {
        break;
      }
    }

  // declare 2 variables in one go, defalut = 0 










  }
}
