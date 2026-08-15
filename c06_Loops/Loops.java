package c06_Loops;

public class Loops {
    public static void main(String[] args){

        // Loops (o bucles)

        // - for: Controlado por contador

        for(int ind = 0; ind < 5; ind++){
            System.out.println("Hola mundo!"); // Imprime "Hola mundo!" 5 veces
        }

        /*
        Nota:
        La estructura del for en Java
        es exactamente igual que en C++
        primero inicializamos el indice 
        (int ind = 0), despues establecemos
        sus limites (ind < 5), y por ultimo,
        indicamos como va a variar en cada
        vuelta (i++ aumenta de uno en uno).
        */

        for(int ind = 1; ind <= 5; ind+=2){
            System.out.println("Hola mundo!"); // Imprime "Hola mundo!" 3 veces
        }

        // El indice aumenta de dos en dos y no puede ser mayor que 5.
        // ind = 1   => "Hola mundo!"
        // ind = 3   => "Hola mundo!"
        // ind = 5   => "Hola mundo!"
        // El bucle termina

        // Bucle en reversa
        for(int ind = 5; ind >= 0; ind--){
            System.out.println("Hola mundo!"); // Imprime "Hola mundo!" 6 veces
        }

        // El indice va disminuyendo de uno en uno en cada vuelta hasta ser cero
        // ind = 5   => "Hola mundo!"
        // ind = 4   => "Hola mundo!"
        // ind = 3   => "Hola mundo!"
        // ind = 2   => "Hola mundo!"
        // ind = 1   => "Hola mundo!"
        // ind = 0   => "Hola mundo!"
        // El bucle termina

        
        // Aplicacion del bucle for en Arrays
        String[] names = {"Luis", "Pareja", "Agente-707", "Luis@gmail.com"};

        for(int ind = 0; ind < names.length; ind++){
            System.out.println(names[ind]); // => Imprime cada elemento del array (índice menor que el tamaño)
        }

        
    }
}
