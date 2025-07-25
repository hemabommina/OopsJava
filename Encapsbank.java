class BankAccount{
    private String accountNumber;
    private double balance;
    public String getaccountNumber(){
        return accountNumber;
    }
    public void setaccountNumber(String newaccountNumber){
        accountNumber=newaccountNumber;
    }
    public double getbalance(){
        return balance;
    }
    public void setbalance(double newbalance){
        if(newbalance>0){
            balance=newbalance;
        }
        else{
            System.out.println("Invalid Balance");
        }
        }
    }


public class Encapsbank {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.setaccountNumber("ABC123");
        b1.setbalance(-10000);
        System.out.println("accountNumber:" + b1.getaccountNumber());
        System.out.println("balance:" + b1.getbalance());
    
    }
    
}
