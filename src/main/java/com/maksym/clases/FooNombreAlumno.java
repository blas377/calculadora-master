package com.maksym.clases;

public class FooNombreAlumno {
    // Clase nombre alumno - subido por blas

    static void factorialbucle(int iNumero){
        int iFactorial = 1;
        for (int x=2;x<=iNumero;x++)
        iFactorial = iFactorial * x;

        System.out.println("El factorial del número " + Integer.toString(iNumero) +  " es " + Integer.toString(iFactorial));
    }
}
