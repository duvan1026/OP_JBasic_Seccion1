package com.example.operadores;

public class Operadores {

    public static void main(String[] args){

        // aritmeticos

        int numero1 = 10;
        int numero2 = 20;

        int resultadoSuma = numero1 + numero2;

        System.out.println( "resultadoSuma: " + resultadoSuma);
        System.out.println("resultadoSuma: " + (resultadoSuma + 5.77));


        int resultadoresta = numero1 - numero2;

        /*
         Comparación
         > Mayor que
         < menor que
         >= mayor igual que
         <= menor igual que
         == igual que
         */

        boolean resultado1 = numero1 > numero2;
        System.out.println("resultado1: " + resultado1);


        boolean resultado2 = numero1 < numero2;
        System.out.println("resultado2: " + resultado2);

        System.out.println();

        /*
        Logicos
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;
        boolean carnetJoven = edad  >= 15 && edad <= 26;






    }
}
