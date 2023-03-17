package com.example.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args){

        String dia = "Viernes";

        switch(dia){

            case "Lunes":
                System.out.println("Hoy es Lunes!! Animo!!");
                break;

            case "Martes":
                System.out.println("Hoy es martes");
                break;

            case "Miercoles":
                System.out.println("Hoy es Miercoles!! Animo!!");
                break;

            case "Jueves":
                System.out.println("Hoy es Jueves");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes!! Animo!!");
                break;

            case "Sabado":
                System.out.println("Hoy es Sabado");
                break;

            case "Domingo":
                System.out.println("Hoy es Domingo");
                break;

            default:
                System.out.println("No es un dia valido");
                break;
        }

    }
}
