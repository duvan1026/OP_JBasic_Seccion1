package com.example.estructurascontrol.repeticion;

public class formain {

    public static  void main(String[] args){

        for( int i = 0; i < 10; i++ ){
            System.out.println("El valor de i es: " + i );
        }

        String[] nombres = { "Pepe", "Juanito", "Roberta" };

        for( int i = 0; i < nombres.length; i++ ){
            System.out.println(nombres[i]);
        }

        int[] numeros = {5, 7, 8};
        int suma = 0;
        for( int i = 0; i < numeros.length; i++ ){
            suma += numeros[i];
            System.out.println(numeros[i]);
        }

        System.out.println(suma);

    }
}
