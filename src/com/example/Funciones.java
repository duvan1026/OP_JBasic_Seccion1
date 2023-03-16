package com.example;

public class Funciones {

    public static void main(String[] args){

        System.out.println("\n/**** Opcion 1: sin parametros y sin tipo de retorno ****/ ");
        // Opcion 1: sin parametros y sin tipo de retorno
        showMenu();
        showMenu();

        System.out.println("\n/**** Opcion 2: Función sin parametros y con tipo de retorno ****/");
        // Opcion 2: Función sin parametros y con tipo de retorno
        String menu = getMenu();
        System.out.println(menu);

        double price = getPrice();
        System.out.println(price);
        
        
        // Opcion 3: Funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");
    }

    static void imprimirSaludoBuenosDias(String name) {
        System.out.println(name);
    }

    static double getPrice() {
        return 100.99;
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu(){
        System.out.println("bienvenidos al E-Commerce de zapatillas");
        System.out.println("1- ver zapatillas");
//        System.out.println("2- Comprar zapatilla");
//        System.out.println("3- Salir");
    }

    static String getMenu(){
        return "bienvenidos al E-Commerce de zapatillas \n 1 - Ver Zapatillas..... ";
    }
}
