package dailyCoding.day_10;

import java.util.Scanner;

public class MakePalindrome {

    public static boolean checkPalindrome(String string){
        int first = 0;
        int last = string.length() - 1;
        while(first < last){
            if(string.charAt(first) != string.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
    return true;
    }

    public static int NoOfString(String string){
        if(checkPalindrome(string)){
            return 0;
        }
        String subString = string.substring(1);
        return 1 + NoOfString(subString);

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        if(!checkPalindrome(inputString)){
            String string_to_add = inputString.substring(0,NoOfString(inputString));
//            System.out.println(string_to_add);
            StringBuilder sbf = new StringBuilder(string_to_add);
            System.out.println(inputString+sbf.reverse());
        }else{
            System.out.println("Palindrome");
        }
    }
}
