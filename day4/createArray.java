package dailyCoding.day4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class createArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
        System.out.println("Enter Names of cars with space");

        String inputString = scanner.nextLine();

        StringTokenizer stringTokenizer = new StringTokenizer(inputString, " ");

        while(stringTokenizer.hasMoreTokens()){
            cars.add(stringTokenizer.nextToken());
        }

        //Not working
//        while (scanner.hasNext(" ")){
//            cars.add(scanner.next());
//        }

//        System.out.println(cars);
        System.out.println("Great Choices!!");
        for (String car : cars) {
            System.out.print(car + " ");
        }
    }
}
