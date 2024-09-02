public class M1 {
    public static void main(String[] args){
        circle c1 = new circle();
        c1.draw();
        square s1 = new square();
        s1.draw();  
    }
}

interface drawShape{
    void draw();

}

class circle implements drawShape{
    public void draw(){
        System.out.println("Draw the circle");
    }    
}

class square implements drawShape{
    public void draw(){
        System.out.println("Draw the square.");
    }
}