package c08_oop.AccesModifiersExercises;

public class Rectangle2 {
    private int width;
    private int height;

    public Rectangle2(int width, int height){
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width){
        this.width = width;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void calculateArea(){
        int area;

        area = height * width;

        System.out.println("El área del rectangulo es: " + area);
    }
}
