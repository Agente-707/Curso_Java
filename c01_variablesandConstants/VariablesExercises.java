package c01_variablesandConstants;
public class VariablesExercises {
    public static void main(String[] args) {
        /*
        Ejecicios simples con variables y constantes
        */
        
        // 1. Declara una variable de tipo String y asignale tu nombre.
        // Solución:
        String name = "Agente-707";
        System.out.println(name);

        // 2. Crea una variable de tipo int y asignale tu edad.
        // Solución:
        int age = 19;
        System.out.println(age);

        // 3. Crea una variable double con tu altura en metros.
        // Solución:
        double height = 1.75;
        System.out.println(height);

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        // Solución:
        boolean likesProgramming = true;
        System.out.println(likesProgramming);

        // 5. Declara una constante con tu email.
        // Solución:
        final String EMAIL = "agente707@example.com";
        System.out.println(EMAIL);

        // 6. Crea una variable de tipo char y guardale tu inicial.
        // Solución:
        char initial = 'A';
        System.out.println(initial);

        // 7. Declara una variable de tipo String con tu localidad, y a continuacion cambia su valor y vuelve a imprimirla
        // Solución:
        String location = "Peru";
        System.out.println(location);
        location = "Lima";
        System.out.println(location);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        // Solución
        int a=12; int b=13;
        System.out.println(a+b);

        // 9. Imprime el tipo de dos variable creadas anteriormente.
        // Solución:
        System.out.println(location.getClass().getSimpleName());
        System.out.println(EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asignale una valor antes de imprimirla.
        // Solución:

        /*
        helloWorld = "Hola, mundo";
        System.out.println(helloWorld);
        Error: cannot find symbol
        */
    }
}
