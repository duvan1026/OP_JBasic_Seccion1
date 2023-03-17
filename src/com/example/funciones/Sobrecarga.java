package com.example.funciones;

/**
 * Sobrecarga: me permite duplicar un método siempre y cuando
 * tenga diferentes numero/tipo parametros
 */
public class Sobrecarga {

    public static void main(String[] args){

    }

    static double suma(double numero1, int numero2){
        return numero2 + numero1;
    }

    static int suma(int numero1, int numero2){
        return numero2 + numero1;
    }

    static int suma(int numero1, int numero2, int numero3){
        return numero1 + numero2;
    }
}
