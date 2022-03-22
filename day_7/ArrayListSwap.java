package dailyCoding.day_7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListSwap {

    public static ArrayList<Integer> swapArray(ArrayList<Integer> inputArrayList, int length){

        for(int i=0; i < length - 1; i += 2){
            Collections.swap(inputArrayList , i, i + 1);
        }
        return inputArrayList;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the string");
        int length = scanner.nextInt();
        System.out.println("Enter the elements");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int number = 0; number < length; number++){
            arrayList.add(Integer.valueOf(scanner.next()));
        }
        System.out.println(swapArray(arrayList,length));
    }
}
