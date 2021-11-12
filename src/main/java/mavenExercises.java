import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class mavenExercises {


    public static void main(String[] args) {
        Scanner userEntry = new Scanner(System.in);
        System.out.println("Enter something: ");

        String string =  userEntry.nextLine();
        System.out.println(StringUtils.isNumeric(string));
        System.out.println(StringUtils.reverse(string));
        System.out.println(StringUtils.swapCase(string));
//        String input = userEntry.nextLine();
//        System.out.println(userEntry);


    }
}
