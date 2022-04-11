package areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double radius;
        double area;
        boolean correct = false;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter a radius: ");
            radius = input.nextInt();
            if (radius < 0){
                System.out.println("Please enter a positive number");
            }else if(radius > 0){
                correct=true;
                input.close();
            }
//            else{
//                System.out.println("Please enter a positive number");
//            }
        }
        while (!correct);
        area = Circle.getArea(radius);

        System.out.println("The area of a circle of radius "
                +radius+" is: "+area);
    }
}
