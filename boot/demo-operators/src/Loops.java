public class Loops {

  public static void main(String[] args) {
    // For Loop
    // 行左int i=0; i < 4 先, 如果fulfill i < 4 就會行system print out
    // 1st loop, i = 0, 1st Hello
    //第二次and 之後ga loop 就會行埋最右個個 ++i, so the second time is ++i, i = 0+1
    //2 loop, i = 1, 2nd Hell0
    //i =2
    //i = 3
    for (int i = 0; i < 4; ++i) {
      System.out.println("i=" + i + ", Hello");
    }

    for (int i = 3; i > 0; --i) {
      System.out.println("i=" + i + ", Hello");
    }

    int x = 2;
    for (int i = 0; i < 4; ++i) {
      System.out.println(x);
      x *= 2;
    }

    for (int z = 6; z > 0; z--) {
      System.out.println("z=" + z + ", hello");
    }

    //for (int i =0;i >=0; i++) {
    // System.out.println("hello");

    int max = 10;
    int count = 0;
    for (int p = 0; p < max; ++p) {
      count += p;
    }
    // 0 1 2 3 4 5 6 7 8 9, count = 45

    int sum = 0;
    for (int k = 0; k < 10; k += 2) {
      sum += k + 1;
    }
    System.out.println(sum);
    //sum = 1 3 5 7

    int sum2 = 0;
    int sumwithout5 = 0;
    for (int g = 0; g < 10; g++) {
      if (g % 2 == 1) {
        sum2 += g;
      }
      if (g % 2 == 1 && g != 5) {
        sumwithout5 += g;
      }
    }
    System.out.println(sum2);
    System.out.println(sumwithout5);

    for (int i = 0; i < 5; ++i) {
      System.out.println("hello");
      if (i > 2) {
        break;
      }
    }
    //i = 0, hello
    //i = 1, hellp
    //i = 2, hello
    //i = 3, hello
    // break

    //continue
    for (int i = 0; i < 6; i++) {
      System.out.println("hello!");
      if (i > 3) {
        continue; // go to the next iteration (唔會再落去, 會重新多次個forloop)
      }
      System.out.println("Bye!");
    }

    //i = 0, hello, bye
    //i = 1, hello, bye
    //i = 2, hello, bye
    //i = 3, hello, bye
    //i = 4, hello
    //i = 5, hello
    //i = 6, exit

    for (int i = 0; i < 8; i++) {
      if (i % 2 == 0) {
        if (i % 3 == 0) {
          System.out.println("Bye!");
        }
      }
    }

    // Nested loop
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.println("Hello");
      }
    }
    // how many Hello?
    // i = 0, j = 0, Hello
    // i = 0, j = 1, Hello
    // i = 0, j = 2, Hello
    // i = 0, j = 3, exit

    // i = 1, j = 0, Hello
    // i = 1, j = 1, Hello
    // i = 1, j = 2, Hello
    // i = 1, j = 3, exit

    // i = 2, j = 0, Hello
    // i = 2, j = 1, Hello
    // i = 2, j = 2, Hello
    // i = 2, j = 3, exit

    // i = 3, j = 0, Hello
    // i = 3, j = 1, Hello
    // i = 3, j = 2, Hello
    // i = 3, j = 3, exit

    // i = 4, j = 0, Hello
    // i = 4, j = 1, Hello
    // i = 4, j = 2, Hello
    // i = 4, j = 3, exit


    //* 
    //**
    //***
    //****
    //***** 

    String star = "*";

    for (int a = 0; a<5; a++) {
      System.out.println(star);

    }










    for (int i = 0; i <5 ; i++) {
      for (int j = 0; j < 1; j++) {
      System.out.println(star);
      star += star.charAt(0);
      }
    }


    String str ="";
    for(int i = 0; i < 5; i++) {
str += "*";
      System.out.println(str);
    }



    
    











 




  






    }}

