package com.maksym.funciones;


import java.util.ArrayList;

public class FuncionRuffini {

    static public String calcular(ArrayList<Integer> array){
        String sol="";
        int res, res1;

        for(int i=1; i<=array.get(0);i++){
            res=0; //Reseteo los resultados para volver a usarlos
            res1=0;
            if(array.get(0)%i==0){//Comprobamos que el valor sea divisible entre el termino independiente
                for(int j=0;j<array.size();j++){
                    res+=Math.pow(i, j)*array.get(j); //Calculo y concateno resultados para realiar el teorema del resto
                    res1+=Math.pow(-i, j)*array.get(j); //Teorema del resto pero con el dividor negativo
                }
                    if(res==0) //Si el teorema del resto es cero, quiere decir que una solución es el número sustituido
                        sol+=+i+", ";
                    if(res1==0)
                        sol+=+(-i)+", ";
            }
        }

        if(sol.equalsIgnoreCase(""))
            sol="Las soluciones no son números enteros";
        else
            sol="Las soluciones son: "+sol;

        return sol;
    }
}
