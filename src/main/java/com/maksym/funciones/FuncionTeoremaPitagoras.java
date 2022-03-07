package com.maksym.funciones;

import java.util.Scanner;

public class FuncionTeoremaPitagoras {
    static Scanner sc = new Scanner(System.in);

    static public void calcular(double cat, double cat2, double hip, int opc) {
        String sol = "";

        switch (opc) {
            case 1:

                // Se comprueba que sean mayores a 0
                if (cat > 0 && hip > 0) {
                    sol = String.valueOf(Math.sqrt(Math.pow(hip, 2) - Math.pow(cat, 2)));
                } else {
                    sol = "Datos incorrectos";
                }

                break;

            case 2:

                // Se comprueba que sean mayores a 0
                if (cat > 0 && cat2 > 0) {
                    sol = String.valueOf(Math.sqrt(Math.pow(cat2, 2) + Math.pow(cat, 2)));
                } else {
                    sol = "Datos incorrectos";
                }

                break;
        }

        System.out.println("Solución: " + sol);
        System.out.println();
    }

}
