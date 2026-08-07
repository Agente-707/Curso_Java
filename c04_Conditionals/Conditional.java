package c04_Conditionals;

public class Conditional{
    public static void main(String[] args){

        // Condicionales
        // Las condicionales en Java funcionan exactamente igual que en C++.

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

        // Switch
        int today = 3;

        switch (today){
            case 1: // Primer caso 'today==1', si no se cumple continua buscando
                System.out.println("Hoy es lunes");
                break;
            case 2:
                System.out.println("Hoy es martes");
                break;
            case 3: // 'today==3' sí cumple!
                System.out.println("Hoy es miercoles"); // este mensaje se imprime
                break; // sale del Switch y omite los casos restantes 
            case 4:
                System.out.println("Hoy es jueves");
                break;
            case 5:
                System.out.println("Hoy es viernes");
                break;
            case 6:
                System.out.println("Hoy es sabado");
                break;
            case 7:
                System.out.println("Hoy es domingo");
                break;
        }
    }
}
