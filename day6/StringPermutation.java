package dailyCoding.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringPermutation {

    static int factorial(int number){
        int temp = 1;
        for (int i = 2; i <= number; i++){
            temp = temp * i;

        }
        return temp;
    }

    //using Recursion
    static int factorialUsingRecursion(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number *= factorialUsingRecursion(number -1);
    }

    static int permutations(String str){
//        return factorial(str.length());
        HashMap<Character, Integer> charCountMap
                = new HashMap<Character, Integer>();


        char[] strArray = str.toCharArray();

        for (char c : strArray) {

            charCountMap.put(c, charCountMap.getOrDefault(c,0) +1);
            //Method 2
//            if (charCountMap.containsKey(c)) {
//                charCountMap.put(c, charCountMap.get(c) + 1);
//            }
//            else {
//                charCountMap.put(c, 1);
//            }
        }

        // Tricky part
        int freq = 1;
        for(Map.Entry<Character ,Integer> mapValue : charCountMap.entrySet()){
            freq *= factorial( mapValue.getValue());
        }

        return factorial(str.length()) / freq;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        System.out.println(permutations(inputString));
    }

}

