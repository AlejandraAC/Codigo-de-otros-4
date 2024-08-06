package com.generation; //Se creó un paquete con el mismo nombre

import java.util.Scanner; //Se importó util

/**
 * Este programa simula un juego de "piedra, papel o tijeras" para dos jugadores.
 * Cada jugador introduce su elección y el programa determina el ganador
 * o si hay un empate.
 */

public class Codigo4 { //Se renmbró el archivo con el nombre de la clase

    public static void main(String[] args) { // Colocamos el código dentro del método main
        Scanner s = new Scanner(System.in); // Inicializamos el escáner con System.in

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine(); // Leemos la entrada del jugador 1

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        String j2 = s.nextLine(); // Leemos la entrada del jugador 2

        if (j1.equals(j2)) { // Usamos .equals() para comparar cadenas
            System.out.println("Empate");
        } else {
            int g = 2; // Variable para determinar el ganador
            switch (j1) {
                case "piedra":
                    if (j2.equals("tijeras")) { // Usamos .equals() para comparar cadenas
                        g = 1;
                    }
                    break; // Añadimos break 
                case "papel":
                    if (j2.equals("piedra")) { // Usamos .equals() para comparar cadenas
                        g = 1;
                    }
                    break; // Añadimos break 
                case "tijeras":
                    if (j2.equals("papel")) { // Usamos .equals() para comparar cadenas
                        g = 1;
                    }
                    break; // Añadimos break 
                default:
                    System.out.println("Entrada inválida");
                    return; // Salimos del programa en caso de entrada inválida
            }
            System.out.println("Gana el jugador " + g);
        }
        s.close(); // Cerramos el escáner para liberar recursos
    }
}