import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Shape shape=new Shape("I am the first shape","Plastic");
        Triangle triangle=new Triangle("I am the second shape","Wood",13,15);
        Rectangle rectangle=new Rectangle("I am the third shape","Iron",13,20);
        System.out.println("\nShape:");
        System.out.println(shape.getSize());
        System.out.println(shape.toString());
        System.out.println(shape.equals(new Shape("I am the first shape","Plastic")));
        System.out.println(shape.equals(new Shape("I am the second shape","Plastic")));
        System.out.println(shape.equals(rectangle));

        System.out.println("\nTriangle:");
        System.out.println(triangle.getSize());
        System.out.println(triangle.toString());
        System.out.println(triangle.equals(new Triangle("I am the second shape","Wood",12,15)));
        System.out.println(triangle.equals(new Triangle(12,5)));
        System.out.println(triangle.equals(rectangle));

        System.out.println("\nRectangle:");
        System.out.println(rectangle.getSize());
        System.out.println(rectangle.toString());
        System.out.println(rectangle.equals(new Rectangle("I am the third shape","Iron",13,20)));
        System.out.println(rectangle.equals(new Rectangle(13,20)));
        System.out.println(rectangle.equals(triangle));

        ArrayList<Shape> a=new ArrayList<>();
        a.add(new Shape("primul element","plastic"));
        a.add(new Shape("al doilea element","plastic"));
        a.add(new Triangle("al treilea element","plastic",10,15));
        a.add(new Triangle("al patrulea element","plastic",20,25));
        a.add(new Rectangle("al cincilea element","plastic",12,14));
        a.add(new Rectangle("al saselea element","plastic",21,20));
        System.out.println("\ntoString():");
        for(Shape i:a){
            System.out.println(i.toString());
            //se apeleaza metoda specifica fiecarei clase
        }
        System.out.println("\ngetSize():");
        for(Shape i:a){
            System.out.println(i.getSize());
        }

        for(Shape i:a){
            if(i instanceof Triangle)
                ((Triangle) i).displayTriangleHeight();
            if(i instanceof Rectangle)
                ((Rectangle) i).displayRectangleHeight();
        }
    }
}
