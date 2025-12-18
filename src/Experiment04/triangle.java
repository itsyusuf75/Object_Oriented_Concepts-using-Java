package Experiment04;
import java.util.Scanner;

public class triangle {
    double s1,s2,s3;
    double perimeter;
    double area;
    public triangle(double side1, double side2, double side3){
        s1=side1;
        s2=side2;
        s3=side3;
    }
    void perimeter(){
        perimeter=s1+s2+s3;
    }
    void area(){
        double s=(s1+s2+s3)/2;
        area=Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
    }
    void display(){
        System.out.println("Triangle perimeter: "+perimeter);
        System.out.println("Triangle area: "+area);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter triangle sides: ");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        triangle t=new triangle(a,b,c);

        t.perimeter();
        t.area();
        t.display();
    }
}
