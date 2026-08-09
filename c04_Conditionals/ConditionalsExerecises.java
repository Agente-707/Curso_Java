package c04_Conditionals;

public class ConditionalsExerecises {
    public static void main(String[] args){
        /*
        Algunos ejercicios simples con condicionales
        para practicar
        */
        
        //1. Establece la edad de un usuario y muestra si puede votar.
        // Solución:
        int age = 19;
        if(age >= 18){
            System.out.println("El usuario sí puede votar.");
        }else{
            System.out.println("El usuario no puede votar (aun es menor de edad)");
        }

        //2. Declara dos números y muestra cuál es mayor, o si son iguales.
        // Solución:
        int a = 10;
        int b = 7;

        if(a>b){
            System.out.println(String.format("El número %d es mayor que %d.", a, b));
        }else if(a==b){
            System.out.println("El valor de 'a' es igual a 'b'.");
        }else{
            System.out.println(String.format("El número %d es mayor que %d.",b ,a));
        }

        //3. Dado un número, verifica si es positivo, negativo o cero.
        // Solución:
        int c = -10;

        if(c>=0){
            System.out.println(String.format("%d es un número positivo.",c));
        }else{
            System.out.println(String.format("%d es un número negativo.",c));
        }

        //4. Crea un programa que diga si un número es par o impar.
        // Solución:
        int my_number = 1001;

        if(my_number % 2 == 0){
            System.out.println("Mi número es PAR.");
        }else{
            System.out.println("Mi número es IMPAR.");
        }

        //5. Verifica si un número está en el rango de 1 a 100.
        // Solución:
        int six_seven = 67; //xd

        if(six_seven>1 && six_seven<100){
            System.out.println("Mi número pertenece al rango de 1 a 100."); 
        }else{
            System.out.println("Mi número no pertenece al rango de 1 a 100.");
        }

        //6. Declara una variable con el día de la semana (1-7) y muestra su nombre con un switch.
        // Solución:
        int day = 5;
        switch(day){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
        }

        //7. Simula un sistema notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" segun la nota (1-100).
        // Solución:
        int mi_nota = -100;

        if(mi_nota<=100 && mi_nota>=90){
            System.out.println("Sobresaliente");
        } else if (mi_nota<90 && mi_nota>=10){
            System.out.println("Aprobado");
        } else if (mi_nota<10){
            System.out.println("Suspenso");
        }

        //8. Escribe un programa que determine si puedes entrar al cine: debes tener almenos 15 años o ir acompañado.
        // Solución:
        int edad = 19;
        boolean with_an_adult = true;
        if(edad>=15 || with_an_adult){
            System.out.println("Sí puedes entrar al cine.");
        }else{
            System.out.println("No puedes entrar al cine.");
        }

        //9. Crea un programa que diga si una letra es vocal o consonante (char).
        // Solución:
        char my_char = 'e';
        if(my_char=='a' || my_char=='e' || my_char=='i' || my_char=='o' || my_char=='u'){
            System.out.println("Tu letra es una vocal minuscula.");
        } else if(my_char=='A' || my_char=='E' || my_char=='I' || my_char=='O' || my_char=='U'){
            System.out.println("Tu letra es una vocal mayuscula.");
        } else{
            System.out.println("Tu letra es una consonante.");
        }

        //10. Usa tres variables a, b, c y muestra cual es el mayor de las tres.
        // Solución:
        a = 1;
        b = 2;
        c = 3;

        if(a>b && a>c){
            System.out.println("'a' es mayor que 'b' y 'c'");
        } else if(b>a && b>c){
            System.out.println("'b' es mayor que 'a' y 'c'");
        } else if(c>a && c>b){
            System.out.println("'c' es mayor que 'a' y 'b'");
        }
    }
    
}
