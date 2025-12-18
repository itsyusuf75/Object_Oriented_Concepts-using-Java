package Experiment07;
    public class Main{
        public static void main(String[] args){
            Area obj = new Area();
            System.out.println("Area of cube :" +obj.area(5));
            System.out.println("Area of cuboid :" +obj.area(5,4,3));
            System.out.println("Area of sphere :"+ obj.area(3.5f));
        }
}
