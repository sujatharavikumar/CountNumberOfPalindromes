package Ravikumar.Sujatha.Food;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Created by sujatharavikumar on 9/23/16.
 */
public class FlagSolution {


    static int jumps(int k, int j) {
        if (j==1)
            return k;
        /*else if ((k%2==0) && (j%2==0))
            return k/j;*/
        else if (k==j)
            return 1;
        else if (k%j == 0)
            return k/j;
        /*else if ((k%2 == 1) && (j%2 == 1))
            return ((k/j)+1);*/
        else
            return ((k/j)+1);

    }


    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int res;
        int _k;
        _k = Integer.parseInt(in.nextLine().trim());

        int _j;
        _j = Integer.parseInt(in.nextLine().trim());

        res = jumps(_k, _j);
        System.out.println(res);
        //bw.write(String.valueOf(res));
        //bw.newLine();

        //bw.close();
    }

}
