public class Palindrome {
  public static boolean isPalindrome(String str) {
    int left = 0;
    int right = str.length() - 1;
    while (left < right) {
      if (str.charAt(left) != str.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }
  public static void main(String[] args) {
    String testStr1 = "racecar";
    String testStr2 = "hello";
    System.out.println(testStr1 + " is palindrome: " + isPalindrome(testStr1));
    System.out.println(testStr2 + " is palindrome: " + isPalindrome(testStr2));

    String number = "122e1";
    int left = 0;
    int right = number.length() - 1;
    boolean result = true;
    while(left < right){
      if(number.charAt(left) != number.charAt(right)){
        result = false;
        break;
      }
      left++;
      right--;
    }
    if(result)
      System.out.println(number+" is a palindrome");
    else
      System.out.println(number+" is a not palindrome");
  }


}