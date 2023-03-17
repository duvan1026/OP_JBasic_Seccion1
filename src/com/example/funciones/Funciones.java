package com.example.funciones;

public class Funciones {

    public static void main(String[] args){


//        // Opcion 1: sin parametros y sin tipo de retorno
//        showMenu();
//        showMenu();
//
//        // Opcion 2: Función sin parametros y con tipo de retorno
//        String menu = getMenu();
//        System.out.println(menu);
//
//        double price = getPrice();
//        System.out.println(price);
        
        // Opcion 3: Funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");


        // Opción 4: Función con parámetros y con tipo de retorno
        String nombre = "Duvan";
        String apellido = "Castro";
        String saludo =  obtenerSaludo( nombre,apellido );
        System.out.println( saludo );

        int resultadoSuma = suma(50, 200);
        System.out.println("resultado de la suma es: " + resultadoSuma);
    }

    static int suma( int numero1, int numero2 ){
        int sumat = numero1 + numero2;
        return sumat;
    }

    static String obtenerSaludo( String nombre, String apellido){
        String saludo = "Buenas tardes " + nombre + " " + apellido;
        return saludo;
    }

    static void imprimirSaludoBuenosDias(String nombreprint) {
        System.out.println("Buenas tardes " + nombreprint);
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
        System.out.println("Imprimiendo texto prueba");
        return "bienvenidos al E-Commerce de zapatillas \n 1 - Ver Zapatillas..... ";
    }
}
