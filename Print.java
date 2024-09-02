class Bicycle{
    int gear;
    int speed;

    void applyBreaks(){
        System.out.println("Apply breaks to bicycle.");
    }

    void speedUp(){
        System.out.println("speed up the vehicle.");
    }

    void slowerSpeed(){
        System.out.println("slower down the speed of vehicle.");
    }
}

class MTB extends Bicycle{
    void applyBreaks(){
        System.out.println("Apply breaks to mtb.");
    }

    void speedUp(){
        System.out.println("speed up the mtb.");
    }

    void slowerSpeed(){
        System.out.println("slower down the speed of mtb.");
    }
}


public class Print {
    public static void main(String[] args){
        MTB m1 = new MTB();
        m1.applyBreaks();
        m1.speedUp();
        m1.slowerSpeed();
    }
}
