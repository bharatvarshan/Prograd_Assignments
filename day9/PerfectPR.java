package dailyCoding.day9;

import java.util.Scanner;

public class PerfectPR {

    public static boolean checkPR(char pointer ,String string){
        for(char character:string.toCharArray()){
            if(character==pointer){
                return false;
            }
            pointer=character;
        }
        return true;
    }

    public static boolean checkContainsOnlyPR(String string){
        for(char character:string.toCharArray()){
            if(character!= 'P' && character!='R'){
                return false;
            }
        }
        return true;
    }


    public static boolean checkUsingRegex(String string){
        return string.matches("[R]?(([P][R])?[P]?)*");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char pointer = inputString.charAt(0);
        String subString = inputString.substring(1);
//        if(checkContainsOnlyPR(inputString) && checkPR(pointer,subString)){
//            System.out.println("Perfect");
//        }else{
//            System.out.println("Not Perfect");
//        }
        if(checkUsingRegex(inputString))
            System.out.println("Perfect");
        else
            System.out.println("Not Perfect");

    }
}

