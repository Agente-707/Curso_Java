package c08_oop.AccesModifiersExercises;

public class Employee {
    private double salary;

    public Employee(double salary){
        this.salary = salary;
    }

    public void raiseSalary(double percent){
        if(percent>0){
            System.out.println("Salario antes: " + salary);
            salary = salary + ((percent * salary)/100);
            System.out.println("Salario actual: " + salary);
        } else{
            System.out.println("Error: Tiene que ser una valor positivo");
        }
    }


}
