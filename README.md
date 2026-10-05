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

---

Al declarar variables en Java, debes especificar el tipo de la variable antes del nombre de la variable. Esto se conoce como **declaración de tipo**. Una vez que una variable se declara con un tipo determinado, solo puede contener valores de ese tipo.

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

## $\color{#01DE82}{\text{▷}}$ 4) Strings

## $\color{#01DE82}{\text{▷}}$ 5) Condicionales

## $\color{#01DE82}{\text{▷}}$ 6) Estructuras

## $\color{#01DE82}{\text{▷}}$ 7) Bucles

## $\color{#01DE82}{\text{▷}}$ 8) Funciones

## $\color{#01DE82}{\text{▷}}$ 9) Programación Orientada a Objetos (POO)

## $\color{#01DE82}{\text{▷}}$ 10) Excepciones

## $\color{#01DE82}{\text{▷}}$ 11) Extras
