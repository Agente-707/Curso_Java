package c08_oop;

// Ejercicio 6: Solución
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
