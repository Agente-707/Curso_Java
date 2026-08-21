package c08_oop.AccesModifiersExercises;

// Ejercicio 3: Solución
public class BankAccount2 {
    private double balance;

    public BankAccount2(double balance){
        this.balance = balance;
    }

    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Balance = " + balance);
    }

    public void withDraw(double amount){
        balance = balance - amount;
        System.out.println("Balance = " + balance);
    }
}
