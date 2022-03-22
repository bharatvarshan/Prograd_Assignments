package dailyCoding.day_1;
import java.util.*;

public class anagrams {


    public static boolean checkAnagramUsingHashMap(String string1, String string2){

        if (string1.length() == string2.length()) {
            HashMap<Character, Integer> hashMap1 = new HashMap<>();
            HashMap<Character, Integer> hashMap2 = new HashMap<>();

            for(int i = 0; i < string1.length(); i++ ){
                hashMap1.put(string1.charAt(i), hashMap1.getOrDefault(string1.charAt(i),0)+1);
                // Improvement - since string length are same - append both hashmaps in single loop
                hashMap2.put(string2.charAt(i), hashMap2.getOrDefault(string2.charAt(i),0)+1);

            }
//            for(int i = 0; i < string2.length(); i++ ){
//                hashMap2.put(string2.charAt(i), hashMap2.getOrDefault(string2.charAt(i),0)+1);
//            }

            return hashMap1.equals(hashMap2);
        }

        return false;
    }

    public static boolean checkAnagram(String string1, String string2){

//        string1.toLowerCase();
//        string2.toLowerCase();

        if(string1.length() == string2.length()){
            //creating character Array
            char[] ch1 = new char[string1.length()];
            char[] ch2 = new char[string2.length()];
            for (int i = 0; i < string1.length();i++){
                ch1[i] = string1.charAt(i);
                ch2[i] = string2.charAt(i);
            }
                Arrays.sort(ch1);
                Arrays.sort(ch2);

                return Arrays.equals(ch1, ch2);
        }
    return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings:");
        String string1 = sc.nextLine();
        String string2 = sc.nextLine();
        if(checkAnagramUsingHashMap(string1,string2)){
            System.out.println("Strings are anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }




}
