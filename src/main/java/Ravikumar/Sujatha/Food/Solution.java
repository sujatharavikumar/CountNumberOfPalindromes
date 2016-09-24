package Ravikumar.Sujatha.Food;

/**
 * Created by sujatharavikumar on 9/23/16.
 */
class FoodFactory {
    public Food getFood(String foodStr){
        if (foodStr.equals("FastFood"))
            return new FastFood();
        else if (foodStr.equals("Fruits"))
            return new Fruits();
        else
            return new Food();
    }
}

class Food{

    public void serveFood() {
        System.out.println("I'm serving Food");
    }
}

class FastFood extends Food {
    public void serveFood(){
        System.out.println("I'm serving FastFood");
    }
}

class Fruits extends Food{
    public void serveFood(){
        System.out.println("I'm serving Fruits");
    }
}






public class Solution {
    public static void main(String[] argh) {
        FoodFactory myFoods = new FoodFactory();
        Food food1 = myFoods.getFood("FastFood");
        Food food2 = myFoods.getFood("Fruits");
        System.out.println("My name is: " + food1.getClass().getName());
        System.out.println("My name is: " + food2.getClass().getName());
        System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
        food1.serveFood();
        food2.serveFood();
    }

}
