public class Operators {
    public static void main(String[] args){
        // Operadores Aritmeticos
        System.out.println("----Operadores Aritmeticos----");
        var a=10; var b=4;

        System.out.println(a+b); // Suma
        System.out.println(a-b); // Resta
        System.out.println(a*b); // Multiplicacion
        System.out.println(a/b); // Division
        System.out.println(a%b); // Modulo

        // Operadores de Asignacion
        System.out.println("----Operadores de Asignacion----");
        a = b; // 'a' toma el valor de 'b' => a = 4;
        System.out.println(a);

        a = b * 3; // a = 4x3
        System.out.println(a);

        a += 1; // => a = a + 1
        System.out.println(a);

        // a = 13
        a -= 1; // => a = a - 1
        System.out.println(a); 
        a *= 2; // => a = a x 2
        System.out.println(a);
        a /= 3; // => a = a / 3
        System.out.println(a);

        // Operadores de Comparacion
        System.out.println("----Operadores de Comparacion----");

        // Operador de igualdad
        System.out.println("1) Igualdad");
        System.out.println(a == b); // Nos devuelve 'true' o 'false'
        System.out.println(a == 8); 
        System.out.println(true == false);
        System.out.println(200 == 20.0);
        System.out.println("Hola" == "HOLA");

        // Operador de desigualdad
        System.out.println("2) Desigualdad");
        // a = 8, b = 3
        System.out.println(a != b); // => true
        System.out.println(100 != 1000);
        System.out.println(true != false);
        System.out.println(!(10 != 9)); // { !(true) = false } => Operador de negacion
        System.out.println(a > b); // a mayor que b
        System.out.println(a >= b); // a mayor igual que b
        System.out.println(a < b); // a menor que b
        System.out.println(a <= b); // a menor igual que b
        
        // Operadores Logicos

        /*
        Tabla del 'Y' (&&):

        p | q | p && q
        F | F |   F
        F | V |   F
        V | F |   F
        V | V |   V
        */

        System.out.println("3) Logicos");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(3>2 && 5==2); // V && F => F

        /*
        Tabla del 'O' (||)

        p | q | p || q
        F | F |   F
        F | V |   V
        V | F |   V
        V | V |   V
        */

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println(3>2 || 5==2); // V || F => V

        // Operadores Unarios
        System.out.println("----Operadores Unarios----");
        System.out.println(+b); // Nos devuelve el mismo valor (Positivo)
        System.out.println(++b); // b = b + 1, luego lo imprime
        System.out.println(b++); // primero lo imprime, luego b = b + 1
        System.out.println(b);

        System.out.println(-b); // Nos devuelve el valor negativo de b
        System.out.println(--b); // b = b - 1, luego lo imprime
        System.out.println(b--); // primero lo imprime, luego b = b - 1
        System.out.println(b);
    }
}