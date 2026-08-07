package c04_Conditionals;

public class Conditional{
    public static void main(String[] args){

        // Condicionales

        var age = 19;

        if(age>=18){ // si 'age' es mayor o igual que 18, se imprimira el mensaje de abajo
            System.out.println("El usuario es mayor de edad.");
        }

        // else
        if(age>=18){ // Si la primera condicion se cumple, imprime unicamente el primer mensaje
            System.out.println("El usuario es mayor de edad.");
        }else{ // Si la condicion de arriba no se cumple, imprimira unicamente el segundo mensaje (si no se cumple una condición, se cumple su caso contrario)
            System.out.println("El usuario es menor de edad");
        }

        // else if
        if(age>18){ 
            System.out.println("El usuario es mayor de edad.");
        }else if(age==18){ // Con el 'else if' podemos añadir más condiciones
            System.out.println("El usuario acaba de cumplir 18 años");
        }else{
            System.out.println("El usuario es menor de edad");
        }
    }
}