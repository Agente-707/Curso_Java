package c08_oop;

public class BankAccount{
  int balance;

  public BankAccount(int balance){
    this.balance = balance;
  }

  public void deposit(){
    int saldo=0;

    saldo = saldo + balance;

    System.out.println(String.format("Saldo actual: %d", saldo));
  }

}
