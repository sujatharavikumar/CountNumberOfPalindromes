package Ravikumar.Sujatha.Food;
import java.io.*;
import java.util.*;

/**
 * Created by sujatharavikumar on 9/23/16.
 */
public class Palindrome {

    static int countPalindromes(String s) {
            int count = 0;
            for (int from = 0; from < s.length(); from++) {
                for (int to = from + 1; to <= s.length(); to++) {
                    String newSubStr = s.substring(from, to);
                    boolean flag = isPalindrome(newSubStr);
                    if (flag == true)
                        count++;

                }
            }
            return count;
    }
     static boolean isPalindrome(String str) {
        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return false;
            }
        }
        return true;
    }



    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);

        String s;
        s = in.nextLine();

        int counter = countPalindromes(s);
        System.out.println(counter);

    }
}
