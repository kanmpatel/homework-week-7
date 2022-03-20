public class Wall {
    double width;
    double height;

    //constructors wall
    public Wall() {

    }

    //define constructors of set the value of height and width
    public Wall(double w, double h) {
        if (w <= 0) {
            width = 0;
        } else {
            width = w;
        }
        if (h <= 0) {
            height = 0;
        } else {
            height = h;
        }
    }

    //get the value of width
    public double getWidth() {
        return width;
    }

    //get the value of height
    public double getHeight() {
        return height;
    }

    //set the value of width
    public void setWidth(double w1) {
        if (w1 <= 0) {
            width = 0;
        } else {
            width = w1;
        }
    }

    //set the value oh height
    public void setHeight(double h1) {
        if (h1 <= 0) {
            height = 0;
        } else {
            height = h1;
        }
    }

    //get the area of wall
    public double getArea() {
        return height * width;
    }

    public static void main(String[] args) {
        System.out.println("set thr value in constructors.");
        Wall wall = new Wall(5, 4);           //set thr value width and height in constructors
        System.out.println("area= " + wall.getArea());  //get the area of wall
        wall.setHeight(-1.5);                     //set the value of height
        System.out.println("result of height if height is less then 0");
        System.out.println("height= " + wall.getHeight());  //get the value of height
        wall.setWidth(50);                      //set the value of width
        System.out.println("result of width");
        System.out.println("width= " + wall.getWidth());   //get the value of width
        System.out.println("result of area if any height of width is leas then o :");
        System.out.println("area= "+ wall.getArea());        //get the area of wall
    }
}
