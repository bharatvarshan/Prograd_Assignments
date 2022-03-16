package dailyCoding.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUniqueYears{

    public static ArrayList<String> findDates(String string){
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}");
        Matcher matcher = pattern.matcher(string);
        ArrayList<String> dates = new ArrayList<String>();
        while (matcher.find()){
            dates.add(matcher.group());
        }
        return dates;
    }

    public static int findNoOfUniqueYears(ArrayList<String> datesList ){
        HashSet<String> years = new HashSet<>();
        for(String date : datesList){
            years.add(date.substring(6,10));
        }
        return years.size();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String inputString = scanner.nextLine();
        System.out.print("No of unique Years are: ");
        System.out.println(findNoOfUniqueYears(findDates(inputString)));
    }
}
