package com.maksym.funciones;

public class FuncionPoligonoRegular {

    static public void calcular(double num,double lon,double apo) {
        String sol;

        //Compruba que sea mayor a 0 el número
        if (num < 0 || lon < 0 || apo < 0) {
            sol = "Datos incorrectos";
        } else {
            sol = String.valueOf((num * lon * apo) / 2);
        }

        System.out.println("Solución: " + sol);
        System.out.println();
    }

}
