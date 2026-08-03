public class Operators {
    public static void main(String[] args){
        // Operadores Aritmeticos
        var a=10; var b=4;

        System.out.println(a+b); //Suma
        System.out.println(a-b); //Resta
        System.out.println(a*b); //Multiplicacion
        System.out.println(a/b); //Division
        System.out.println(a%b); //Modulo

        // Operadores de Asignacion
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

        


    }
}
