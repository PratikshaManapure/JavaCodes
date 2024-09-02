interface Color{
    void fill();
}
class Red implements Color{
    public void fill(){
        System.out.println("I am in Red color.");
    }
}
class Purple implements Color{
    public void fill(){
        System.out.println("I am in Purple color.");
    }
}
class Blue implements Color{
    public void fill(){
        System.out.println("I am in Blue color.");
    }
}
class Black implements Color{
    public void fill(){
        System.out.println("I am in Black color.");
    }
}
class ColorFactory{
    Color cs;
    public Color getColor(String s){
        if(s.equalsIgnoreCase("Red")){
            return new Red();
        }else  if(s.equalsIgnoreCase("Blue")){
            return new Blue();
        }else  if(s.equalsIgnoreCase("Black")){
            return new Black();
        }else  if(s.equalsIgnoreCase("Purple")){
            return new Purple();
        }
        return null;
    }
}
public class ColorDemo {
    public static void main(String[] args){
        Color c;
        ColorFactory cf = new ColorFactory();
        c = cf.getColor("blue");
        c.fill();

    }
}
