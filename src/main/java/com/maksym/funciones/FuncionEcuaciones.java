package com.maksym.funciones;

import java.util.Scanner;

public class FuncionEcuaciones {
    static Scanner sc = new Scanner(System.in);

    int a, b, c;


    public FuncionEcuaciones(int num1, int num2){//Constructor sin el término "a" (Ec 1ºgrado)
        this.a=0;
        this.b=num1;
        this.c=num2;
    }


    public FuncionEcuaciones(int num1, int num2, int num3){//Constructor de la ecuación de 2º grado
        this.a=num1;
        this.b=num2;
        this.c=num3;
    }

    public String CalcularEcuacion(){
        String sol="";
        if(this.a==0){//Es una ecuación de primer grado
            if(this.b==0)//No es una ecuación
                sol="Esto no es una ecuación";
            else{
                sol="La solución es: ";
                sol+=(-this.c/this.b);
            }
        }else
            if((Math.pow(this.b,2)-(4*this.a*this.c))<0){ //Daría lugar a una raiz negativa, por lo tanto tendríamos problemas y no existirían soluciones reales.
                sol="No tiene soluciones reales";
            }else{
                sol="Las soluciones son: ";
                sol+=((-this.b+Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/(2*this.a))+" y ";
                sol+=((-this.b-Math.sqrt(Math.pow(this.b,2)-4*this.a*this.c))/(2*this.a));
            }
        return sol;
    };
}

