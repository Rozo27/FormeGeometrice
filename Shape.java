import java.util.Objects;

public class Shape {
    private String text;
    private String material;

    public Shape(){

    }
    public Shape(String text,String material){
        this.text=text;
        this.material=material;
    }
    public double getSize(){
        return -1;
    }

    @Override
    public String toString() {
        return "made of "+this.material+", contains the text:"+this.text;
    }

    @Override
    public boolean equals(Object obj) {
        if(super.equals(obj)==true)
            return true;
        if(obj==null || this.getClass()!=obj.getClass())
            return false;
        Shape shapeObj=(Shape)obj;
        if(this.text.equals(shapeObj.text) && this.material.equals(shapeObj.material))
            return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, material);
    }
}
