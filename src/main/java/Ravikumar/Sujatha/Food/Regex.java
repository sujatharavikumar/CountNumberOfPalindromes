package Ravikumar.Sujatha.Food;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by sujatharavikumar on 9/24/16.
 */
public class Regex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());
        //while(testCases>0){
            String username = in.nextLine();
            //String pattern = Complete this line in the editable area below
            String pattern = "^[(a-zA-Z)][^@~`#\\s]";
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            //testCases--;
        //}
    }
}



