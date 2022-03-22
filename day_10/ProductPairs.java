package dailyCoding.day_10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class ProductPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int string_length = scanner.nextInt();
//        List list = new ArrayList();
        // Take input of unique characters only
        HashSet<Integer> set = new HashSet<Integer>();
        for(int input = 0; input < string_length; input++){
//            list.add(scanner.next());
            set.add(Integer.valueOf(scanner.next()));
        }
        int product = scanner.nextInt();
        List<Integer> arrayList = new ArrayList<Integer>(set);
        int counter = 0;
//        System.out.println(arrayList.get(1));
        for(int i = 0; i <= set.size();i++){
            for(int j=i+1; j <= set.size() - 1; j++){
                if(arrayList.get(i) * arrayList.get(j) == product ){
                    counter++;
//                    System.out.println(arrayList.get(i)+" "+arrayList.get(j));
                }
            }
        }
        System.out.println(counter);
    }
}
