import java.util.Scanner;

class Rectangle{
    
    public double length, width, area;
    public String color;

    void get_length(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle : ");
        length = sc1.nextDouble();
    }

    void get_width(){
        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle : ");
        width = sc2.nextDouble();
    }

    void get_color(){
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the color of the rectangle : ");
        color = sc3.next();
    }

    double find_area(){
        return length*width;
    }

}

public class Classes_and_objects{
    public static void main(String args[]){
        
        System.out.println("Enter the length, width, color of rectangle 1!\n");

        Rectangle r1 = new Rectangle();
        r1.get_length();
        r1.get_width();
        r1.get_color();

        System.out.println("\nEnter the length, width, color of rectangle 2!\n");

        Rectangle r2 = new Rectangle();
        r2.get_length();
        r2.get_width();
        r2.get_color();

        if ((r1.find_area() == r2.find_area()) && (r1.color.equalsIgnoreCase(r2.color))){
            System.out.println("\nMATCHING RECTANGLES");
        }
        else{
            System.out.println("\nNON MATCHING RECTANGLES");
        }

    }
}