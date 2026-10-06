# Curso_Java

Video de referencia: https://youtu.be/JOAqpdM36wI?si=mh-1FVRPc46MgOK4

## $\color{#01DE82}{\text{▷}}$ 1) Introducción

Java es un lenguaje de programación increíblemente potente y versátil que te permite crear desde aplicaciones móviles hasta software empresarial, con la asombrosa capacidad de **escribir una vez y ejecutar en cualquier lugar** (*Write Once, Run Anywhere*).

En esta sección abarcaremos la estructura básica de un archivo en Java, el uso del método principal `main`, la emisión de mensajes por consola y la documentación mediante comentarios.

---

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

## Incremento/Decremento

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

## Atajos Aritméticos

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

## $\color{#01DE82}{\text{▷}}$ 6) Estructuras

## $\color{#01DE82}{\text{▷}}$ 7) Bucles

## $\color{#01DE82}{\text{▷}}$ 8) Funciones

## $\color{#01DE82}{\text{▷}}$ 9) Programación Orientada a Objetos (POO)

## $\color{#01DE82}{\text{▷}}$ 10) Excepciones

## $\color{#01DE82}{\text{▷}}$ 11) Extras
