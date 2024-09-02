public class Display {
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.draw();
        c1.color();

        Square s1 = new Square();
        s1.draw();
        s1.color();
    }
}

abstract class Shape {
    abstract void draw();
    abstract void color();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Draw the Circle.");
    }

    void color(){
        System.out.println("Color is Blue.\n");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Draw the Square.");
    }

    void color(){
        System.out.println("Color is pink.");
    }
}
