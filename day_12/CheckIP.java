package dailyCoding.day_12;

import java.util.Scanner;

public class CheckIP {

    public static boolean checkInt(String string){
        for(int i = 0; i < string.length();i++){
            if(string.charAt(i) >=0 && string.charAt(i) <= 9){
                return true;
            }

        }
        return false;
    }

    public static boolean validateIP(String string){
        String[] array = string.split("\\.");
        if(array.length != 4){
            return false;
        }

        for(int i =0 ; i < array.length ; i++){
            //array[i].matches("[0-9]+")  checkInt(array[i])
            if(array[i].matches("[0-9]+")){
                int bytePart = Integer.parseInt(array[i]);
                if (bytePart < 0 || bytePart > 255){
                    return false;
                }
                if (i == 3 && bytePart == 0 || bytePart == 255 ){
                        return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputIP = scanner.nextLine();
        System.out.println(validateIP(inputIP) ? "Valid IP" : "Invalid IP");
    }

}
