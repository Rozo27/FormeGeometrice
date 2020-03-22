import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int height;

    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(String text, String material, int width, int height){
        super(text, material);
        this.width=width;
        this.height=height;
    }
    public void displayRectangleHeight(){
        System.out.println("Rectangle height is:"+this.height);
    }

    @Override
    public double getSize() {
        return width*height;
    }

    @Override
    public String toString() {
        return "Rectangle:height is "+this.height+", width is:"+this.width+","+super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if(obj==null || this.getClass()!=obj.getClass())
            return false;
        Rectangle rectangleObj=(Rectangle)obj;
        if(super.equals(obj)==true && this.width==rectangleObj.width && this.height==rectangleObj.height)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), width, height);
    }
}
