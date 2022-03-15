package dailyCoding.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class createArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cars = new ArrayList<>();
        System.out.println("Enter Names of cars with space");



        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }
    }
}
