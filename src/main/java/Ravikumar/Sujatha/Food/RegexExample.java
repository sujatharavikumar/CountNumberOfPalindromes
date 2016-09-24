package Ravikumar.Sujatha.Food;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by sujatharavikumar on 9/23/16.
 */
public class RegexExample {

    public static void main(String[] args){

        String pattern = "\\b(\\w+)(\\b\\s+\\1\\b)+";
        Pattern r = Pattern.compile(pattern);

        Scanner in = new Scanner(System.in);
        //int testCases = Integer.parseInt(in.nextLine());



        //while(testCases>0){
            String input = in.nextLine();
            Matcher m = r.matcher(input);
            boolean findMatch = true;
            while(m.find( )){
                input = input.replaceAll(m.group(), m.group(1));
                findMatch = false;
            }
            System.out.println(input);
            //testCases--;
        //}
    }

}
