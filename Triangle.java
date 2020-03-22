import java.util.Objects;

public class Triangle extends Shape{
    private int base;
    private int height;

    public Triangle(int base,int height){
        this.base=base;
        this.height=height;
    }
    public Triangle(String text,String material,int base, int height){
        super(text,material);
        this.base=base;
        this.height=height;
    }

    public void displayTriangleHeight(){
        System.out.println("Triangle height is:"+this.height);
    }

    @Override
    public double getSize() {
        return (float)this.base*this.height/2;
    }

    @Override
    public String toString() {
        return "Triangle:height is "+this.height+", base is:"+this.base+","+super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
            return true;
        if(obj==null || obj.getClass()!=this.getClass())
            return false;
        Triangle triangleObj=(Triangle)obj;
        if(super.equals(obj)==true && this.base==triangleObj.base && this.height==triangleObj.height)
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), base, height);
    }
}
