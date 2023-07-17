import java.util.Arrays;

public class Array {

public static void main(String [] args) {
int num = 7;
int num2 = 8;
int num3 = -30;

// Create Empty Array (Approach 1)
int [] nums = new int[3]; // 3 is the length of array nums
// with index 0 , 1, 2, ( 0 1 2 act like a address, 似係一個地址)
nums[0] = -40;
nums[1] = 500;
nums[2] = -1000;
nums[0] = -5000; // can redefine
// set 左3 length (0 1 2), so num -1, nums 3 will 出error


double[] arr = new double [5];//
arr [0] = 0;   // java 會accept 整數in double.
arr [1] = 1;
arr [2] = 2;
arr [3] = 3;
arr [4] = 4;

//for loop 
for(int i =0; i<nums.length;i++) { // 0 1 2 //nums 係object, 唔係class, 一般length係會.length() 有(), 但array 冇(),
  //num.length =3 ( index: 0 1 2), 
  System.out.println( "nums["  + i +  "] =" + nums[i] );
}

// reversely print array nums
//用i 個時要nums.length -1
for(int i = nums.length -1 ; i>= 0;i--) { 
  System.out.println( "nums["  + i +  "] =" + nums[i] );
}

// Approach 2, create array
int [] array = new int [] {3,9,23};
for(int i =0; i<array.length;i++) {
  System.out.println( "array["  + i +  "] =" + array[i] );
}

// Can add a new element at tail ? No. array 長度唔可以改
// Modify an element
array [2] = -10;
//Access an element
int index = 2;
System.out.println( array[index]); //-10

// char []
char [] chars = new char [3] ;
chars[2] = 'a';
chars[0] = '!';
// chars[1] = empty (char default value 係empty,咩都唔填係empty)
for(int i =0; i<chars.length;i++) {
  System.out.println( "chars["  + i +  "] =" + chars[i] );
}

// String
String [] strs = new String [] {"hello hello", "abc", "goodbye"};
strs[1] = "typhoon";
for(int i =0; i<strs.length;i++) {
  System.out.println( "strs["  + i +  "] =" + strs[i] );
}

String[] fruits = new String [5];
fruits[0] = "apple";
fruits[1] = "water";
fruits[2] = "orange";
//冇assign = null
//冇assign = null
  System.out.println(Arrays.toString(fruits) );

byte[] bytes = new byte [6];
bytes [3] = -4;
//冇assign = 0
  System.out.println(Arrays.toString(bytes) );










}
}






  

