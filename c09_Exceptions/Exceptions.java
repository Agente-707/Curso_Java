package c09_Exceptions;

public class Exceptions {
    public static void main(String[] args){

        /*
        Si nosotros intentaramos ejecutar 
        lo siguiente:

        var result = 10 / 0; 
        System.out.println(result); 
        System.out.println("Fin"); 

        =>
        El programa no tiene ningun error de sintaxis,
        sin embargo, al intentar ejecutar 'result'
        nuestro programa se detiene y lanza una
        'excepción' (no se puede dividir un número
        entre cero)
        */


        // Manejo de excepciones

        // try catch

        try {

            var result = 10/0;
            System.out.println(result);

        } catch(Exception e){ // => Parametro e que guarda la información del error
            System.out.println("Error: " + e);

            // Si el código dentro de 'try' es una excepción se imprimirá "Error"
        }

        System.out.println("Fin"); // La ejecución del código continúa


        try {
            var result = 10/0;
            System.out.println(result);
        } catch(ArithmeticException e){ // => Tipo de excepción 'aritmetica'
            System.out.println("Error: " + e);
        }
        System.out.println("Fin"); // La ejecución del código continúa

        
         try {
            var result = 10/5;  //  Operación sin errores
            System.out.println(result);
        } catch(Exception e){ 
            System.out.println("Error: " + e);
            // El código dentro de 'try' no tiene errores, por lo tanto no se imprime el error
        }
        System.out.println("Fin"); // La ejecución del código continúa

        
        // try con múltiples catch

        try {

            var result = 10/5;
            System.out.println(result);

            var name = "Luis";
            name = null;
            System.out.println("Name: " + name.toUpperCase()); // Hacemos toUpperCase() a un String 'null'
        } catch(ArithmeticException e){ // Excepción de la suma
            System.out.println("Cuidado con dividir algo que no puedes: " + e);
        } catch(NullPointerException e){ // Excepción del String null
            System.out.println("Ha ocurrido un null pointer mítico!");
        } catch(Exception e){ // Excepción por defecto (Captura caulquier tipo de error que no sean los que ya establecimos antes 'ArithmeticException' y 'NullPointerException')
            System.out.println("Se ha producido un error inesperado");
        }
            
        System.out.println("Fin"); // La ejecución del código continúa


        // finally

        try { //=> Identifica si hay un error
            var result = 10/0;
            System.out.println(result);
        } catch(ArithmeticException e){ // => Parametro e que guarda la información del error
            System.out.println("Error: " + e);
        } finally{ // => Siempre se ejecuta (Sin importar que)
            System.out.println("Fin del bloque try-catch");
        }

        // throw

        System.out.println("Fin");


        


        


        
    }
}
