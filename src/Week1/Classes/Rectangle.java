package Week1.Classes;

public class Rectangle {
    private int width;
    private int height;
    private String color;

    // constructor
    public Rectangle(int width, int height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    // draw method
    public void draw() {
        char c = this.color.charAt(0);

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }

    public void setWidth(int width) {
        if (width < 1){
            this.width = 1;
        } else {
            this.width = width;
        }
    }

    public void setHeight(int height) {
        if (height < 1){
            this.height = 1;
        } else {
            this.height = height;
        }
    }

    public void setColor(String color) {
        if ( 2 <= color.length() && color.length() < 20 ){
            this.color = color;
        } else {
            this.color = "Blue";
        }
    }

}
