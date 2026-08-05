package c02_Operators;
public class OperatorsExercises {
    public static void main(String[] args){
        // 1. Crea una variable con el resultado de cada operacion aritmetica.

        int a = 10 + 5;
        System.out.println(a);
        a = 10 - 5;
        System.out.println(a);
        a = 10 * 5;
        System.out.println(a);
        a = 10 / 5;
        System.out.println(a);

        // 2. Crea una variable para cada tipo de operacion de asignacion.

        int b = 0;
        b += 10;
        System.out.println(b);

        int c = 12;
        c -= 2;
        System.out.println(c);

        int d = 10;
        d *= 3;
        System.out.println(d);

        int e = 30;
        e /= 10;
        System.out.println(e);

        // 3. Utiliza el operador logico 'and'.

        System.out.println(true && false);
        System.out.println(4>5 && "Hola"=="adios");

        // 4. Utiliza el operador logico 'or'.

        System.out.println(5<7 || 23.0 == 23);

        // 5. Combina ambos operadores.

        System.out.println(("AAAA" == "aaaa" && 10.2 > 10.222) || 12 <= 113);

        // 6. Imprime tres ejemplos de uso de operadores unarios.

        System.out.println(-b);
        System.out.println(++e);
        System.out.println(a--);
        System.out.println(a);

    }
}
