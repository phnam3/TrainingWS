package rectangle;

public class Rectangle {
    private Double width;
    private Double height;

    public Rectangle(){}
    public Rectangle(Double width, Double height){
        this.height = height;
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public void display(){
        System.out.println("Width : " + width + " Height : " + height);
    }

    public Double area(){
        return width*height;
    }

    public Double perimeter(){
        return 2*(width+height);
    }
}
