public class userDefinedException extends Exception {
    public static void main(String[] args){

        int acc_No[] = {1001,1002,1003,1004};
        String cust_Name[] = {"A","B","C","D"};
        double balance[] = {12000,30000,40000,500};
        try{

            System.out.println("Account No." + "\t" +"Customer Name" + "\t" + "Balance");
            for(int i=0;i<4;i++){
                
                if(balance[i] < 1000){

                    throw new userDefinedException();
                }
                System.out.println(acc_No[i] + "\t\t" + cust_Name[i] + "\t\t" + balance[i]);
            }

        }catch(userDefinedException e){
            e.printStackTrace();
        }
    }
}

