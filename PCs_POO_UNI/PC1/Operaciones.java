package PCs_POO_UNI.PC1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;

// Ejercicio 2

class Operaciones {
    static BigDecimal bn1, bn2;
    static NumberFormat numero = NumberFormat.getNumberInstance();

    public static void main(String[] args){
        float float1 = 123.456f, float2 = 4.04f;
        System.out.println("Verificación del cumplimiento de la Regla 2");
        System.out.println("4 Operaciones con       BigDecimal");
        System.out.println("  float1  float2     Clase    Objeto  Verifica");
        OpObjeto opObjeto = new OpObjeto();

        bn1 = OpClase.sumar(float1,float2);
        bn2 = opObjeto.sumar(float1, float2);
        print(float1, float2, 'x', bn1, bn2, bn1.equals(bn2));

        bn1 = OpClase.restar(float1, float2);
        bn2 = opObjeto.restar(float1, float2);
        print(float1, float2, '-', bn1, bn2, bn1.equals(bn2));

        bn1 = OpClase.multiplicar(float1, float2);
        bn2 = opObjeto.multiplicar(float1, float2);
        print(float1, float2, '*', bn1, bn2, bn1.equals(bn2));
        
        bn1 = OpClase.dividir(float1, float2);
        bn2 = opObjeto.dividir(float1, float2);
        print(float1,float2, '/', bn1, bn2, bn1.equals(bn2));
    }

    static void print(float float1, float float2, char op, BigDecimal bn1, BigDecimal bn2, boolean bu){
        System.out.printf("%.3f %c %.3f = %7s = %7s  %-6b\n", float1, op, float2, numero.format(bn1), numero.format(bn2), bu);
    }
}

class OpClase{
    static BigDecimal sumar       (float float1, float float2){ return new BigDecimal(float1).add(new BigDecimal(float2));}
    static BigDecimal restar      (float float1, float float2){ return new BigDecimal(float1).subtract(new BigDecimal(float2));}
    static BigDecimal multiplicar (float float1, float float2){ return new BigDecimal(float1).multiply(new BigDecimal(float2));}
    static BigDecimal dividir     (float float1, float float2){ return new BigDecimal(float1).divide (new BigDecimal(float2),3, RoundingMode.HALF_UP);}
}

class OpObjeto{
    BigDecimal sumar       (float float1, float float2){return new BigDecimal(float1).add(new BigDecimal(float2));}
    BigDecimal restar      (float float1, float float2){return new BigDecimal(float1).subtract(new BigDecimal(float2));}
    BigDecimal multiplicar (float float1, float float2){return new BigDecimal(float1).multiply(new BigDecimal(float2));}
    BigDecimal dividir     (float float1, float float2){return new BigDecimal(float1).divide(new BigDecimal(float1),3, RoundingMode.HALF_UP);}
}
