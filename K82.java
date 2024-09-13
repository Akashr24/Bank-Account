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
public class K82{
    public static void main(String[]args){
          BankAccount acc1=new  BankAccount(500);
          BankAccount acc2=new  BankAccount(5000);
          acc1.depositeAmt(200);
          acc1.withdrawAmt(800);
          acc2.depositeAmt(300);
          acc2.withdrawAmt(900);
}}



    
