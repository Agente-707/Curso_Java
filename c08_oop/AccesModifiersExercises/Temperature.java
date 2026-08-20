package c08_oop.AccesModifiersExercises;

public class Temperature {
    private double celsius;
    
    public Temperature(double celsius){
        this.setCelsius(celsius);
    }

    public void setCelsius(double celsius){
        if(celsius >= -100 && celsius <=100){
            this.celsius = celsius;
            System.out.println("La temperatura es: " + celsius);
        } else{
            System.out.println("Error: la temperatura debe estar entre los -100 y 100 grados celsius");
        }
    }

}
