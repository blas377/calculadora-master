package com.maksym;

import java.util.Scanner;
import com.maksym.funciones.aritmeticaBasica;
import com.maksym.funciones.FuncionEcuaciones;
import com.maksym.funciones.FuncionPoligonoRegular;
import com.maksym.funciones.FuncionTeoremaPitagoras;
import com.maksym.funciones.FuncionLogaritmo;
import com.maksym.funciones.FuncionFactorial;
import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer a, b, c, opcion = 0;

        do {
            System.out.println("0 para salir");
            System.out.println("1 Aritmética básica");
            System.out.println("2 Área polígonos regulares.");
            System.out.println("3 Teorema de Pitágoras");
            System.out.println("4 Ecuaciones 1º grado");
            System.out.println("5 Ecuaciones 2º grado");
            System.out.println("6 Ecuaciones superior al 2º grado");
            System.out.println("7 EXAMEN: Logaritmo");
            System.out.println("8 EXAMEN: Factorial");
            System.out.print("Introduzca una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    int option1;

                    System.out.println("1 Sumar");
                    System.out.println("2 Restar");
                    System.out.print("Que desea: ");

                    option1 = sc.nextInt();
                    System.out.println("Introduzca dos números: ");

                    if (option1 == 1) {
                        a = sc.nextInt();
                        b = sc.nextInt();
                        aritmeticaBasica.sumar(a, b);
                    } else {
                        a = sc.nextInt();
                        b = sc.nextInt();
                        aritmeticaBasica.restar(a, b);
                    }
                    break;
                case 2:
                    double num, lon, apo;

                    // Se introducen los datos
                    System.out.println("Introduzca el número de lados: ");
                    num = Double.parseDouble(sc.next());

                    System.out.println("Introduzca la longitud de los lados: ");
                    lon = Double.parseDouble(sc.next());

                    System.out.println("Introduzca el apótema: ");
                    apo = Double.parseDouble(sc.next());

                    FuncionPoligonoRegular.calcular(num, lon, apo);
                    break;
                case 3:
                    int opc = 0;
                    double cat = -1, cat2 = -1, hip = -1;
                    
                    // Se elige la opción
                    System.out.println("¿Qué desea calcular, el cateto(1) o la hipotenusa(2)?");
                    opc = Integer.parseInt(sc.next());

                    switch (opc) {
                        case 1:
                            // Se recogen los datos
                            System.out.println("Introduzca el otro cateto");
                            cat = Double.parseDouble(sc.next());

                            System.out.println("Introduzca la hipotenusa");
                            hip = Double.parseDouble(sc.next());

                            break;
                        case 2:
                            // Se recogen los datos
                            System.out.println("Introduzca el primer cateto");
                            cat = Double.parseDouble(sc.next());

                            System.out.println("Introduzca el segundo cateto");
                            cat2 = Double.parseDouble(sc.next());

                            break;
                    }

                    FuncionTeoremaPitagoras.calcular(cat,cat2,hip,opc);
                    break;
                case 4:
                    System.out.println("Introduzca el coeficiente grado 1: ");
                    b = sc.nextInt();
                    System.out.println("Introduzca el termino independiente: ");
                    c = sc.nextInt();
                    FuncionEcuaciones ec = new FuncionEcuaciones(b, c);
                    System.out.println(ec.CalcularEcuacion());
                    break;
                case 5:
                    System.out.println("Introduzca el coeficiente de grado 2: ");
                    a = sc.nextInt();
                    System.out.println("Introduzca el coeficiente grado 1: ");
                    b = sc.nextInt();
                    System.out.println("Introduzca el termino independiente: ");
                    c = sc.nextInt();
                    FuncionEcuaciones ecuacion = new FuncionEcuaciones(a, b, c);
                    System.out.println(ecuacion.CalcularEcuacion());
                    break;
                case 6:
                    int tam;
                    Integer valor;
                    System.out.println("Introduzca el grado de la ecuación: ");
                    tam = sc.nextInt();
                    ArrayList<Integer> array = new ArrayList<Integer>();

                    for(int i=0; i<=tam; i++){ //Creo el array para rellenarno de forma inversa
                        array.add(i, 0);
                    }
            
                    for(int i = tam; i >= 0; i--) {
                        System.out.println("Introduzca el coeficiente de grado "+i+"º : ");
                        valor = sc.nextInt();
                        array.set(i, valor);
                    }

                    System.out.println();
                    break;
                case 7:

                System.out.print("Introduzca el número que desee hacer el logaritmo: ");
                a = sc.nextInt();        
  
                FuncionLogaritmo.funcionLogaritmo(a);
                break;

                case 8:

                System.out.print("Introduzca el número que desee hacer el factorial: ");
                a = sc.nextInt();
                
                FuncionFactorial.funcionFactorial(a);
                break;

                default:
                    break;
            }

        } while (opcion != 0);

        sc.close();

    }
}
