import java.util.Arrays;

public class SearchArray {

  public static void main(String[] args) {
    // Search
    char target = 'm';
    char[] chars = new char[] { 'j', 'p', 'm', 'm', 'q', 'c' };

    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == target) {
        System.out.println("index = " + i);
        break;
      }
    }

    // toCharArrat()
    String str = "i am a boy."; // 11 characters
    char[] arr = str.toCharArray(); // String ==>> char, save 入arr
    System.out.println(Arrays.toString(arr));

    //Find Max. value in the array
    int[] nums = new int[] { 3, 6, -9, 12, 32, 49 };
    int max = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
      }
    }
    System.out.println(max);

    //Find Min. value in the array
    int[] nums2 = new int[] { 3, 6, -9, 12, 32, 49 };
    int min = 99999999;
    for (int i = 0; i < nums2.length; i++) {
      if (nums2[i] < min) {
        min = nums2[i];
      }
    }
    System.out.println(min);
    //approach 2, find min
    int[] nums3 = new int[] { 3, 6, -9, 12, -24, 49 };
    int min1 = nums3[0];
    for (int i = 1; i < nums3.length; i++) {
      if (nums3[i] < min1) {
        min1 = nums3[i];
      }
    }
    System.out.println(min1);
  }
}
