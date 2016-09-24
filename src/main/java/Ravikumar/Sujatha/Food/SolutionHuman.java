package Ravikumar.Sujatha.Food;
import java.util.Scanner;
/**
 * Created by sujatharavikumar on 9/23/16.
 */

class Human extends SolutionHuman implements Cloneable{
    public String name;
    public Human(String name){
        this.name = name;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



}



public class SolutionHuman {

    public static void main(String args[])
    {
        try
        {
            Scanner in = new Scanner(System.in);

            Human h1=new Human("sam");
            Human h2=(Human)h1.clone();

            System.out.println("Created a human called: "+h1.name);
            System.out.println("Created a clone called: "+h2.name);

        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }

    }
}
