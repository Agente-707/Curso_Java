# Curso_Java

Video de referencia: https://youtu.be/JOAqpdM36wI?si=mh-1FVRPc46MgOK4

## $\color{#01DE82}{\text{▷}}$ 1) Introducción

Java es un lenguaje de programación increíblemente potente y versátil que te permite crear desde aplicaciones móviles hasta software empresarial, con la asombrosa capacidad de **escribir una vez y ejecutar en cualquier lugar** (*Write Once, Run Anywhere*).

En esta sección abarcaremos la estructura básica de un archivo en Java, el uso del método principal `main`, la emisión de mensajes por consola y la documentación mediante comentarios.

### Estructura básica de Java
```java
public class Main{
   public static void main(String[] args){
     System.out.print("Hola, Mundo!");
   }
}
```

En Java, usamos `System.out.println()` para imprimir la salida en la consola.

---

### Comentarios de una línea y de varias líneas 

Los comentarios son notas que escribes dentro de tu código. El compilador los ignora por completo; solo existen para ayudar a los humanos a entender el código.

```java
public class Main{
   public static void main(String[] args){
     // Este es un comentario de una sola línea
     // HOLAAA :D

     /*
     Esto es un comentario de varias líneas,
     el compilador ignora todo esto.
     */

     System.out.print("Hola, Mundo!");
   }
}
```

Para escribir un comentario de una sola línea, usa `//`. Todo lo que este después se convierte en comentario y el compilador lo ignora.

Para comentarios que abarcan varias líneas, usa `/*` para comenzar y `*/` para terminar.


## $\color{#01DE82}{\text{▷}}$ 2) Variables y Constantes

Las variables son contenedores que almacenan valores de datos. Se utilizan para guardar, manipular y mostrar información dentro de un programa.

Cada variable tiene un $\color{#01DE82}{\text{nombre}}$ único y un $\color{#01DE82}{\text{valor}}$ que puede ser de distintos tipos. Java cuenta con varios tipos de datos integrados que definen el tipo de valor que puede contener una variable.

---

### Tipos de datos primitivos
- `int`
- `double`
- `char`
- `boolean`

---

### Declaración de variables
| Tipo de Dato | Nombre | Valor | Inicialización |
|---|---|---|---|
| int | age | 19 | int age = 19; |
| double | height | 1.75 | double height = 1.75; |
| char | note | A | char note = 'A'; | 
| boolean | lie | false | boolean lie = false; |

Al declarar variables en Java, debes especificar el tipo de la variable antes del nombre de la variable. Esto se conoce como **declaración de tipo**. Una vez que una variable se declara con un tipo determinado, solo puede contener valores de ese tipo.

---

### Constantes

Una constante es un tipo especial de variable que no se puede cambiar una vez que se inicializa.
Para declarar una constante, usa la palabra clave `final` seguida del tipo de variable.

```java
final double PI = 3.14159;
```

Si intentamos cambiar un valor constante:
```java
final double PI = 3.14159;
PI = 3.14; // => Error
```
Esto dará como resultado un error porque los valores constantes no se pueden cambiar.

## $\color{#01DE82}{\text{▷}}$ 3) Operadores

Con los operadores podemos realizar operaciones con los valores numéricos ($\color{#01DE82}{\text{int}}$ o $\color{#01DE82}{\text{double}}$).
```java
// Ejemplo
int a = 2;
int b = 3;
int c = a + b; // => c = 3 + 2 = 5
```
Al trabajar con números decimales en Java, utilizamos el tipo de dato double, que puede almacenar números con puntos decimales. Los mismos operadores aritméticos (+, -, *, /) funcionan con doubles al igual que lo hacen con los enteros:

```java
// Ejemplo
double a = 2.55;
double b = 3.75;
double c = a + b; // => c = 2.55 + 3.75 = 6.30
```

---

### Operador módulo 

El operador módulo `%` proporciona el resto de una división.

En Java, se usa con una sintaxis sencilla:
```java
int dividend = 10;
int divisor = 3;
result = dividend % divisor; // resto de la division (dividend/divisor) => 1 
```

---

### Incremento/Decremento

Los operadores de incremento y decremento se utilizan para aumentar o disminuir el valor de una variable en 1.
El operador de incremento se representa por dos signos de más `++`, y el operador de decremento se representa por dos signos de menos `--`.

```java
// Incremento
int cont = 5;
count++; // => cont = 6
```

```java
// Decremento
int cont = 5;
count--; // => cont = 4
```

---

### Atajos Aritméticos

Java creó un atajo genial para las operaciones aritméticas de autoasignación.

Por ejemplo, en lugar de escribir:
```java
int a = 5;
a = a + 3; // a contiene 8
```

Podemos simplificarlo escribiendo `+=`:

```java
int a = 5;
a += 3; // a contiene 8
```

El $\color{#01DE82}{\text{+=}}$ está agregando a $\color{#01DE82}{\text{a}}$ mismo el valor $\color{#01DE82}{\text{3}}$

Esta operación es válida para todas las operaciones aritméticas:

| Operador | Atajo |
|---|---|
| + | += |
| - | -= |
| * | *= |
| / | /= |
| % | %= |

---

### Operadores de comparación 

Operadores de comparación se utilizan para comparar entre dos operandos

La siguiente tabla muestra los posibles operadores de comparación:

| Operador | Significado | Ejemplo |
|---|---|---|
| == | Igual | 1 == 2 devuelve $\color{#FF0000}{\text{false}}$ |
| != | No igual | 1 != 2 devuelve $\color{#01DE82}{\text{true}}$ | 
| > | Mayor que | 1 > 2 devuelve $\color{#FF0000}{\text{false}}$ | 
| < | Menor que | 1 < 2 devuelve $\color{#01DE82}{\text{true}}$ |
| >= | mayor o igual que | 1 >= 2 devuelve $\color{#FF0000}{\text{false}}$ |
| <= | menor o igual que | 1 <= 2 devuelve $\color{#01DE82}{\text{true}}$ | 

El operador de comparación devuelve $\color{#01DE82}{\text{true}}$ si la comparación es correcta o $\color{#FF0000}{\text{false}}$ de lo contrario.

---

### Operadores lógicos

Los operadores lógicos se utilizan para comprobar combinaciones de comparaciones que devuelven `true` o `false`.

| Operador | Significado | Ejemplo |
| --- | --- | --- |
| `&&` | Y: `true` si todos los operadores son `true` | `a && b` | 
| `\|\|` | O: `true` si algun operador es `true` | ` a \|\| b ` |
| `!` | NO: `true` si el operando es `false` | ` !a ` | 

## $\color{#01DE82}{\text{▷}}$ 4) Strings

El tipo **String** es un tipo especial que consta de varios **char**.

Para inicializar un valor de cadena en una variable, enciérralo entre comillas dobles:

```java
String user_name = "Agente-707"; 
```

### Funciones con Strings

| Función | Acción | Inicialización |
| --- | --- | --- | 
| length | Nos da la cantidad de caracteres | user_name.length(); |
| charAt | Devuelve el caracter en la posición que le mandemos | user_name.charAt(5); | 
| substring | Nos da una parte del String | user_name.substring(2, 5); |
| toUpperCase | Convierte todas las letras de un String en mayusculas | user_name.toUpperCase(); |
| toLowerCase | Convierte todas las letras de un String en Minusculas | user_name.toLowerCase(); |
| contains | Si el String contiene la cadena que le damos, nos devolvera true | user_name.contains("Agente"); | 
| equals | Nos da true si dos Strings son iguales | user_name.equals("Agente-707"); | 

---

### Formato de Strings

Utilizaremos la impresión con formato ```printf``` para insertar valores de variable en la cadena:

- ```%s``` es un marcador de posición para cadenas de texto.
- ```%d``` es un marcador de posición para enteros.
- ```%f```  es un marcador de posición para números de punto flotante.
- ```%.2f``` formatea el número de punto flotante a dos lugares decimales.

```java
// Ejemplo:
int age = 19;
String name = "Agente-707";
double height = 1.75;
System.out.printf("Name: %s, Age: %d, Height: %.2f\n", name, age, height);
```

---

### Concatenación de Strings

Otra forma de combinar cadenas con variables es con el operador más +:

```java
System.out.print("Name: " + name + " Age: " + age + " Height: " + height);
```

## $\color{#01DE82}{\text{▷}}$ 5) Condicionales

Las instrucciones ```if``` nos permiten ejecutar código con condiciones. Y en caso no se cumplan esas condiciones usamos la instrucción ```else```.

```java
// Ejemplo:
int age = 15;
String status = "None";
if (age >= 18) {
    status = "Adult";
} else {
    status = "Young";
}
```

Si nosotros quisiéramos agregar mas condiciones, podemos hacerlo con la instrucción ```else if```.

```java
// Ejemplo:
int age = 68;
String status = "None";
if (age < 18) {
    status = "Young";
} else if (age >= 18 && age <= 65) {
    status = "Adult";
} else {
    status = "Old";
}
```

---

### Sentencia Switch

La instrucción ```switch``` es como una instrucción ```if``` de múltiples opciones. En lugar de evaluar una sola condición, comprueba el valor de una variable con varios casos y ejecuta el código asociado al caso coincidente.

Esta es la estructura básica de una instrucción ```switch```:

```java
int day = 3;
String dayName;

switch (day) {
    case 1:
        dayName = "Monday";
        break;
    case 2:
        dayName = "Tuesday";
        break;
    // ... casos para otros días
    default:
        dayName = "Invalid day";
}
```

- La palabra clave ```switch``` va seguida de la variable que quieres comprobar entre paréntesis.
- Cada ```case``` representa un posible valor de la variable.
- El código dentro de cada ```case``` se ejecuta si la variable coincide con el valor de ese ```case```.
- La instrucción ```break``` es crucial; sale de ```switch``` después de ejecutar un caso. Sin ella, la ejecución continuaría («fall through») hasta el caso siguiente.
- El caso ```default``` es opcional y se ejecuta si ningún otro caso coincide.

## $\color{#01DE82}{\text{▷}}$ 6) Estructuras

### Arrays

Un ```array``` es un tipo de estructura que guarda un número fijo de elementos del mismo tipo. Cada elemento de un array es accesible mediante un índice que inicia en cero.

Esta es la estructura de declaración de un array:

```java
int[] numeros = new int[5];  // => Array sin elementos instanciados => [0, 0, 0, 0, 0]
String[] nombres = {"Pablo", "Juan", "Antonio"}; // => Array con elementos instanciados (Strings)

// Otra forma equivalente
double[] notas = new doubles[]{15.5, 18.0, 12.5};
```

Para acceder o modificar un elemento de un array lo hacemos mediante el índice de dicho elemento 

```java
int[] a = {10, 20, 30};

System.out.println(a[0]);   // 10
System.out.println(a[1]);   // 20
System.out.println(a[2]);   // 30
a[1] = 99;                  // ahora es {10, 99, 30}
```

---

### ArrayList

un ```ArrayList``` es una lista de tamaño dinámico que internamente usa un array y lo redimensiona automáticamente cuando se van agregando más elementos.

Declaración de un ArrayList:

```java
import java.util.ArrayList;

ArrayList<String> nombres = new ArrayList<>();  // vacío 
ArrayList<Integer> numeros = new ArrayList<>();
ArrayList<Double> notas = new ArrayList<>();
```

### Operaciones básicas

| Operación | Acción | Inicialización | 
| --- | --- | --- |
| add | Añade un elemento al ArrayList | nombres.add("Luis"); |
| get | Llama a un elemento por medio de su índice | nombres.get(0); |
| set | Reemplaza el valor de un elemento llamando a su índice | nombres.set(0, "Pedro"); |
| remove | Elimina un elemento del ArrayList | nombres.remove("Pedro"); |
| size | Devuelve el tamaño del ArrayList | nombres.size(); |
| isEmpty | Devuelve $\color{#01DE82}{\text{true}}$ si el ArrayList está vacío y $\color{#FF0000}{\text{false}}$ si no lo está | nombres.isEmpty(); |
| contains | Le pasamos un elemento y nos devuelve $\color{#01DE82}{\text{true}}$ si ese elemento pertenece al ArrayList y $\color{#FF0000}{\text{false}}$ si no pertenece | nombres.contains("Pedro"); |
| indexOf | Devuelve el índice de un elemento | nombres.indexOf("Pedro"); |
| clear | Elimina todos los elementos del ArrayList | nombres.clear(); |

---

### Set

Un ```set``` es una estructura que no permite elementos duplicados. A diferencia de las estructuras anteriores, los sets no tienen índices.  

Declaración de un Set:

```java
import java.util.HashSet;

Set<String> nombres = new HashSet<>(); // vacío 
Set<Integer> numeros = new HashSet<>();
Set<Double> notas = new hashSet<>();
```

---

### Operaciones básicas

Como esta estructura no trabaja con índices, las funciones ```get```, ```indexOf``` y ```set``` no funcionan.  

| Operación | Acción | Inicialización |
| --- | --- | --- |
| add | Añade un elemento al Set | nombres.add("Luis"); |
| size | Devuelve el tamaño del Set | nombres.size(); | 
| contains | Le pasamos un elemento y nos devuelve $\color{#01DE82}{\text{true}}$ si ese elemento pertenece al Set y $\color{#FF0000}{\text{false}}$ si no pertenece | nombres.contains("Luis"); |
| remove | Elimina un elemento del Set | nombres.remove("Luis"); |
| isEmpty | Devuelve $\color{#01DE82}{\text{true}}$ si el Set está vacío y $\color{#FF0000}{\text{false}}$ si no lo está | nombres.isEmpty(); |
| clear | Elimina todos los elementos del Set | nombres.clear(); |

Si añadimos un elemento repetido, este se va a ignorar.

```java
import java.util.HashSet;

Set<String> nombres = new HashSet<>(); 
nombres.add("Luis");
nombres.add("Luis");  // ya existía, se ignora
nombres.add("Pedro");
```

---

### Maps

un ```Map``` guarda **pares -> clave**. Cada clave es única y se usa para acceder al valor asociado. 

Declaración de un Map:

```java
import java.util.HashMap;

Map<String, Integer> edades = new HashMap<>();   // clave: String   valor: int 
```

---

### Operaciones básicas

| Operación | Acción | Inicialización |
| --- | --- | --- | 
| put | Añade la clave y el valor de un elemento en el Map | edades.put("Luis", 19); | 
| get | Llama la clave del elemento y devuelve el valor | edades.get("Luis"); |
| containsKey | Devuelve $\color{#01DE82}{\text{true}}$ si el Map contiene la clave que le pasamos y $\color{#FF0000}{\text{false}}$ si no lo contiene | edades.containsKey("Luis"); |
| containsValue | Devuelve $\color{#01DE82}{\text{true}}$ si el Map contiene el valor que le pasamos y $\color{#FF0000}{\text{false}}$ si no lo contiene | edades.containsValue(19); |
| remove | Le pasamos la llave y elimina el elemento junto con su valor | edades.remove("Luis"); |
| isEmpty | Devuelve $\color{#01DE82}{\text{true}}$ si el Map esta vacio y $\color{#FF0000}{\text{false}}$ si no lo esta | edades.isEmpty(); | 
| clear | Elimina todos los elementos del Map | edades.clear(); | 

## $\color{#01DE82}{\text{▷}}$ 7) Bucles

A veces, al programar, es necesario realizar la misma operación, o casi la misma, un par de veces. 
Para evitar escribir lo mismo una y otra vez, podemos usar **bucles**.

### Bucle While
Un bucle ```while``` nos permite seguir iterando mientras se cumpla una condición.
Para usar un bucle while, escribe:

```java
while (condition) {
    // Código a ser ejecutado
}
```

El codigo se ejecutara si la condicion es $\color{#01DE82}{\text{true}}$.

---

### Bucle Do-while

El bucle ```do-while``` es similar al bucle **while**, pero con una diferencia clave: el bloque de código se ejecuta al menos una vez antes de que se verifique la condición.

El cuerpo del bucle siempre se ejecutara la primera vez, independientemente de si la condicion es $\color{#01DE82}{\text{true}}$ o $\color{#FF0000}{\text{false}}$.

Estructura básica del bucle ```do-while```: 

```java
do {
    // Código a ser ejecutado
} while (condition);
```

La palabra clave ```do``` marca el inicio del bucle, seguida del bloque de código entre llaves. Después del bloque de código, la palabra clave ```while``` introduce la condición. El bucle continuará ejecutándose mientras la condición sea $\color{#01DE82}{\text{true}}$.

---

### Bucle for

Un bucle ```for``` es una estructura que repite un bloque de código un número determinado de veces. Es ideal cuando sabes de antemano cuántas iteraciones necesitas.

El bucle ```for``` tiene la siguiente sintaxis:

```java
for (inicialización; condición; actualización) {
    // Código a ser ejecutado
}
```

La inicialización, la condición y la actualización determinan cuál es el valor de inicio y cuál es el valor de fin.

## $\color{#01DE82}{\text{▷}}$ 8) Funciones

Un función es una secuencia de código que tiene un nombre. El propósito de las funciones es reutilizar un fragmento de código varias veces.

Por ejemplo, crearemos una función llamada ```greet``` la cual tendrá la siguiente estructura:

```java
public static void greet() {
    System.out.println("Bienvenidos a Java!");
}
```

Para llamar a la función, escribimos ```greet();```:

```java
greet(); // => "Bienvenidos a Java!"
System.out.println("Nueva sesión...");
greet(); // => "Bienvenidos a Java!"
System.out.println("Otra sesión...");
greet(); // => "Bienvenidos a Java!"
```

---

### Parámetros de una Función 

Las variables enumeradas en la declaración de una función se llaman **parámetros**; los valores que proporcionas cuando llamas a la función se llaman **argumentos**.

```java
method_name(value1, value2, value3, ...);
```

---

### Tipos de Retorno

La instrucción ```return``` en una función se utiliza para especificar el valor o los valores que la función debe producir como salida. Por ejemplo, la siguiente función producirá 100:

```java
public static int functionName() {
    return 100;
}
```

Para asignar el valor a una variable, escribe:

```java
int number = functionName();
```

Ahora la variable ```number``` contendrá ```100``` porque esto es lo que devolvió el método.

## $\color{#01DE82}{\text{▷}}$ 9) Programación Orientada a Objetos (POO)

## $\color{#01DE82}{\text{▷}}$ 10) Excepciones

## $\color{#01DE82}{\text{▷}}$ 11) Extras
