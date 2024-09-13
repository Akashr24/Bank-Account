import java.time.LocalDateTime;
class BankAccount{
     private double balance;
     BankAccount(double amount){
           this.balance=amount;}
     public void depositeAmt(double amt){
           balance=balance+amt;
           System.out.println(balance);}
     public void withdrawAmt(double amt){
             if(balance-amt<0){
              System.out.println("insufficient balance");}
             else{
                 balance=balance-amt;
                 System.out.println(balance);}}}
class SMS{
     private long senderNumber;
     private long recieverNumber;
     private String message;
     int amount;
public String sendSMS(long sender,long receiver,int amount){
       this.senderNumber=sender;
       this.recieverNumber=receiver;
       String message1="Dear Customer,you have withdraw Rs"+amount;
       String message2="from the ATM at";
       return(message1+message2);}}
public class K84{
       public static void main(String[]args){
         LocalDateTime time1=LocalDateTime.now();
         BankAccount acc1=new BankAccount(500);
         SMS sms1=new SMS();
         acc1.depositeAmt(200);
         int amount1=300;
         acc1.withdrawAmt(amount1);
         String msg=sms1.sendSMS(998877,948185,amount1);
         System.out.println(msg+time1);
}
}




      


