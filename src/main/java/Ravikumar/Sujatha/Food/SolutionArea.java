package Ravikumar.Sujatha.Food;
import java.util.Scanner;
import java.io.*;
/**
 * Created by sujatharavikumar on 9/23/16.
 */

class Circle{
    private float radius;

    Circle(float radius){
        this.radius = radius;
    }

    public int getArea(){
        return (int)Math.ceil(3.14159265*radius*radius);
    }
}

class Rectangle{
    private float width;
    private float height;

    Rectangle(float width, float height){
        this.width = width;
        this.height = height;
    }

    public int getArea(){
        return (int)Math.ceil(width*height);
    }
}

class Square{
    private float width;

    Square(float width){
        this.width = width;
    }
    public int getArea(){
        return (int)Math.ceil(width*width);
    }
}









public class SolutionArea {
    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc=new Scanner(System.in);

        float radius=0, width=0, height=0;

        radius = Float.parseFloat(sc.nextLine());
        Circle C1=new Circle(radius);
        System.out.println(C1.getArea());

        width =sc.nextFloat();
        height= sc.nextFloat();
        Rectangle R1=new Rectangle(width, height);
        System.out.println(R1.getArea());
        sc.nextLine();
        radius = Float.parseFloat(sc.nextLine());
        Circle C2=new Circle(radius);
        System.out.println(C2.getArea());

        width =Float.parseFloat(sc.nextLine());
        Square S1=new Square(width);
        System.out.println(S1.getArea());

        width =sc.nextFloat();
        height= sc.nextFloat();
        Rectangle R2=new Rectangle(width, height);
        System.out.println(R2.getArea());

    }

}
