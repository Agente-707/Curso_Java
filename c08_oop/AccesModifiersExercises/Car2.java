package c08_oop.AccesModifiersExercises;

// Ejercicio 10: Solución
public class Car2 {
    private int speed;

    public Car2(int speed){
        this.speed = speed;
    }

    public void accelerate(int amount){
        
        if(speed+amount>=120){
            System.out.println("La velocidad no puede superar el límite (120km/h)");
        }else{
            speed = speed + amount;
            System.out.println("La velocidad aumento a: " + speed);
        }
    }

    public void brake(int amount){

        if(speed-amount<=0){
            System.out.println("El auto no se mueve");
        }else{
            speed = speed - amount;
            System.out.println("La velocidad disminuyo a: " + speed);
        }
    }
}
