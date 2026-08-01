public class HelloWorldExercises {
    public static void main(String[] args) {
        // 1. Imprime un mensaje que diga tu nombre
        System.out.println("Mi nombre es Agente-707"); // println imprime un mensaje y luego hace un salto de linea

        // 2. Imprime dos lineas: "Hola" y luego "Mundo" con un solo println
        System.out.println("Hola\nMundo"); // \n es un salto de linea

        //3. Crea un comentario en varias lineas.
        /* Este es 
           un comentario
           en varias
           lineas 
        */

        //4. Imprime tu edad, tu color favorito y tu ciudad.
        System.out.println("Edad: 19");
        System.out.println("Color favorito: Verde");
        System.out.println("Ciudad: Lima");

        //5. Explora los diferentes System.err, System.out.
        System.err.println("Este es un mensaje de error"); // Esto imprime un mensaje de error en la consola
        System.out.println("Este es un mensaje con salto de linea");
        System.out.print("Este es un mensaje sin salto de linea /");
        System.out.printf("Este es un mensaje con formato: %s, %d", "Hola", 123); 
        System.console().printf("Este es un mensaje con formato en consola: %s, %d", "Hola", 123); // Esto imprime un mensaje con formato en la consola
        System.out.println(); // Esto imprime una linea vacia

        //6. Utiliza varios println para imprimir una frase.
        System.out.println("Esta");
        System.out.println("es");
        System.out.println("una");
        System.out.println("frase");

        //7. Imprime un diseño ASCII (Por ejemplo: Una cara feliz, un corazón, una casa, etc.)
        System.out.println("   -----   ");
        System.out.println("  /     \\  ");
        System.out.println(" |  O O  | ");
        System.out.println(" |   ^   | ");
        System.out.println(" |  \\_/  | ");
        System.out.println("  \\     /  ");
        System.out.println("   -----   ");
        
    }
}