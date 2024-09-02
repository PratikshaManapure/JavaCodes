public class MethodOverriding {
    public static void main(String[] args){
        SBI s1 = new SBI();
        s1.getRateOfInterest();

        ICICI i1 = new ICICI();
        i1.getRateOfInterest();

        AXIS a1 = new AXIS();
        a1.getRateOfInterest();
    }
}

class Bank{
    int getRateOfInterest(){
        return 0;
    }
}

class SBI extends Bank{
    int getRateOfInterest(){
        System.out.println("Rate of interest of SBI bank is 7%.");
        return 0;
    }

}

class ICICI extends Bank{
    int getRateOfInterest(){
        System.out.println("Rate of interest of ICICI bank is 8%.");
        return 0;
    }

}

class AXIS extends Bank{
    int getRateOfInterest(){
        System.out.println("ate of interest of AXiS bank is 9%.");
        return 0;
    }

}