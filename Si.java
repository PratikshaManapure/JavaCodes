public class Si {
    public static void main(String[] args){
        calculateSimpleInterest(10000,2.34f,4);
    }
    public static void calculateSimpleInterest(int principle , float rateOfInterest , int year){
        double simpleInterest =(principle * rateOfInterest *year)/100;
        System.out.println(simpleInterest); 
    }
}
