package com.example.estructurascontrol.condicionales;

public class ifelseifmain {

    public static void main(String[] args) {

        String dia = "jdsjdjd";

        boolean resultado = dia.equals("Martes");

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles con M de Me besas");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("nos fuimos!");

        } else if (dia.equals("Sabado")) {
            System.out.println("Nos murimos");

        } else if (dia.equals("Domingo")) {
            System.out.println("Depresión");

        } else {
            System.out.println("El dia introducido No es un dia valido");

        }

    }
}
