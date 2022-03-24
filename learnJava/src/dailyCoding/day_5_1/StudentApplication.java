package dailyCoding.day_5_1;

import java.util.Scanner;

public class StudentApplication {

    public static void showOptions(){
        System.out.println("Select your Option from below!");
        System.out.print("1.Add Student ");
        System.out.print("2.Get Student ");
        System.out.println("3.Exit");
    }

    public static int getOptionFromUser(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());

    }

    public static void main(String[] args) {
        showOptions();
        while(true){

            int option = getOptionFromUser();
            switch (option){
                case 1:
                    System.out.println("You have Selected the option to add user to file");
                    break;
                case 2:
                    System.out.println("You have Selected the option to get user from file");
                    break;
                case 3:
                    System.out.println("Thank You!");
            }
            if(option == 3){
                break;
            }
        }
    }
}
