package Week1.Classes;

public class Rectangle {
    // width, height, color as fields
    private int width;
    private int height;
    private String color;

    // "Method overloading" : same method name, but different set of parameters.
    public Rectangle(int width, int height){
        // call other constructor
        // this. field or this.method()
        // this() : constructor
        this(width, height, "Blue");
    }
    // designated constructor : takes most parameters
    public Rectangle(int width, int height, String color){
        setWidth(width);
        setHeight(height);
        setColor(color);
    }
    // draw method
    public void draw() {
        // 1. get the first char of the color
        char c = color.charAt(0);
        // 2. print first char - for each row(height), print col(width)
        for (int i = 1; i <= height; i++) {
            // print each width (col)
            for (int j = 1; j <= width; j++) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        if (width < 1){
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        if (height < 1){
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if ( 2 < color.length()
                && color.length() < 20
                && color.charAt(0) >= 'A' && color.charAt(0) <= 'Z'){
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }

}
