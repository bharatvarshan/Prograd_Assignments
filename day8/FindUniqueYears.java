package dailyCoding.day8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindUniqueYears{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String inputString = scanner.nextLine();
        Pattern pattern = Pattern.compile("(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}");
        Matcher matcher = pattern.matcher(inputString);

        ArrayList<String> dates = new ArrayList<String>();
        HashSet<String> years = new HashSet<>();

        while (matcher.find()){
            dates.add(matcher.group());
        }

        for(String date : dates){
            years.add(date.substring(6,10));
        }

        System.out.println(years.size());

    }
}
