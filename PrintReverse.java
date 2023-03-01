public class PrintReverse {
  public static void main(String[] args) {
    int reverseNumber = reverse(12345);
    System.out.println(reverseNumber );
  }

  public static int reverse(int number) {
     String s = Integer.toString(number);
     int sLength = s.length();
     String revStr = "";
     for(int i = sLength-1; i >=0; i--){
       revStr += s.charAt(i);
     
    }
      return Integer.parseInt(revStr);
    }
}

